package com.example.jetpackcomposemasterclass.authentification.components

import android.graphics.drawable.Icon
import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposemasterclass.R
import com.example.jetpackcomposemasterclass.ui.theme.BgColor
import com.example.jetpackcomposemasterclass.ui.theme.GrayColor
import com.example.jetpackcomposemasterclass.ui.theme.Primary
import com.example.jetpackcomposemasterclass.ui.theme.Secondary
import com.example.jetpackcomposemasterclass.ui.theme.TextColor

@Composable
fun NormalTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(
                min = 40.dp
            ),
        style = TextStyle(
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center

    )

}


@Composable
fun HeaderTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(

            ),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center

    )

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTextField(labelValue: String, painterResource: Painter ) {

    val textValue = remember {
        mutableStateOf(
            ""
        )

    }
    OutlinedTextField(
         modifier = Modifier
             .fillMaxWidth()
             .background(BgColor),
        shape = RoundedCornerShape(20),


        label = {Text(text = labelValue )},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.colorPrimary),
            focusedLabelColor = Primary,
            cursorColor = Primary,

        ),
        keyboardOptions = KeyboardOptions.Default,
        value= textValue.value,
        onValueChange={
        textValue.value = it
    },
        leadingIcon = {
            Icon(
                painter = painterResource,
                contentDescription = null
            )
        }
        )


}@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField(labelValue: String, painterResource: Painter ) {

    val password = remember {
        mutableStateOf(
            ""
        )

    }

    val passwordVisible = remember {
        mutableStateOf(
            false
        )

    }
    OutlinedTextField(
         modifier = Modifier
             .fillMaxWidth()
             .background(BgColor),
        shape = RoundedCornerShape(20),


        label = {Text(text = labelValue )},
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = colorResource(id = R.color.colorPrimary),
            focusedLabelColor = Primary,
            cursorColor = Primary,

        ),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        value= password.value,
        onValueChange={
        password.value = it
    },
        leadingIcon = {
            Icon(
                painter = painterResource,
                contentDescription = null
            )
        },
        trailingIcon = {
            val iconImage= if(passwordVisible.value){
                Icons.Filled.Visibility
            }else{
                Icons.Filled.VisibilityOff
            }
            var description= if(passwordVisible.value){
                stringResource(id = R.string.hide_password)
            }else{
                stringResource(id = R.string.show_password)
            }
            IconButton(onClick = {
                    passwordVisible.value = !passwordVisible.value
            }
                    ) {
                Icon(imageVector = iconImage, contentDescription = description)
            }
        },
        visualTransformation = if(passwordVisible.value) VisualTransformation.None else
        PasswordVisualTransformation()

        )


}

@Composable
fun CheckboxComponent(value: String, onTextSelected : (String) -> Unit ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        val checkedState = remember {
            mutableStateOf(false)
        }
        Checkbox(checked= checkedState.value,
            onCheckedChange = {
                checkedState.value != checkedState.value

            }
            )
        ClickableTextComponent(value = value,onTextSelected)

    }

}

@Composable
fun ClickableTextComponent(value: String, onTextSelected : (String) -> Unit ) {
    val initialText = "By continuing you accept our "
    val privacyPolicyText = "Privacy Policy"
    val andText = " and "
    val termsAndConditionsText = "Terms of Use"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary )){
            pushStringAnnotation(tag = privacyPolicyText, annotation = privacyPolicyText)
            append(privacyPolicyText)
        }
        append(andText)
        withStyle(style = SpanStyle(color = Primary )){
            pushStringAnnotation(tag = termsAndConditionsText, annotation = termsAndConditionsText)
            append(termsAndConditionsText)
    }

}
        ClickableText(text=annotatedString,onClick={
            offset -> annotatedString.getStringAnnotations(offset,offset).firstOrNull()?.also{ span ->
                Log.d("ClickableTextComponent", "{${span.item}}")
            if((span.item == termsAndConditionsText)||(span.item == privacyPolicyText)  ){
                onTextSelected(
                    span.item
                )
            }
        }

        })
}

@Composable
fun ButtonComponent(value: String) {
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(48.dp),
        contentPadding = PaddingValues(),
        colors = ButtonDefaults.textButtonColors(Color.Transparent)
    ) {

        Box(

            modifier = Modifier
                .fillMaxWidth()
                .heightIn(48.dp)
                .background(
                    brush = Brush.horizontalGradient(listOf(Secondary, Primary)),
                    shape = RoundedCornerShape(50.dp)
                ),
            contentAlignment = Alignment.Center
        ){
            Text(
                text = value,
                fontSize = 18.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
    
}

@Composable
fun DividerTextComponent() {
    Row (
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ){
        Divider(
            modifier = Modifier.fillMaxWidth()
                .weight(1f),
            color = GrayColor,
            thickness = 1.dp
        )
        Text(
            modifier = Modifier.padding(8.dp),
            text = stringResource(R.string.or), fontSize = 18.sp, color = TextColor)
        Divider(
            modifier = Modifier.fillMaxWidth()
                .weight(1f),
            color = GrayColor,
            thickness = 1.dp
        )
    }
    
}

@Composable
fun ClickableLoginTextComponent(tryingToLogin: Boolean = true, onTextSelected: (String) -> Unit) {
    val initialText =
        if (tryingToLogin) "Already have an account? " else "Don’t have an account yet? "
    val loginText = if (tryingToLogin) "Login" else "Register"

    val annotatedString = buildAnnotatedString {
        append(initialText)
        withStyle(style = SpanStyle(color = Primary)) {
            pushStringAnnotation(tag = loginText, annotation = loginText)
            append(loginText)
        }
    }

    ClickableText(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 21.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center
        ),
        text = annotatedString,
        onClick = { offset ->

            annotatedString.getStringAnnotations(offset, offset)
                .firstOrNull()?.also { span ->
                    Log.d("ClickableTextComponent", "{${span.item}}")

                    if (span.item == loginText) {
                        onTextSelected(span.item)
                    }
                }

        },
    )
}

@Composable
fun UnderLinedTextComponent(value: String) {
    Text(
        text = value,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Normal,
            fontStyle = FontStyle.Normal
        ), color = colorResource(id = R.color.colorGray),
        textAlign = TextAlign.Center,
        textDecoration = TextDecoration.Underline
    )

}