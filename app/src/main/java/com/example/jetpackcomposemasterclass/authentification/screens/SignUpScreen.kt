package com.example.jetpackcomposemasterclass.authentification.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.R
import com.example.jetpackcomposemasterclass.authentification.components.ButtonComponent
import com.example.jetpackcomposemasterclass.authentification.components.CheckboxComponent
import com.example.jetpackcomposemasterclass.authentification.components.ClickableLoginTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.DividerTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.HeaderTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.MyTextField
import com.example.jetpackcomposemasterclass.authentification.components.NormalTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.PasswordTextField
import com.example.jetpackcomposemasterclass.authentification.route.PostOfficeAppRouter
import com.example.jetpackcomposemasterclass.authentification.route.Screen
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun SignUpScreen(modifier: Modifier = Modifier) {
    Surface(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)


    ) {
        Column (modifier = Modifier.fillMaxSize()){
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeaderTextComponent(value = stringResource(id = R.string.create_an_acount))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(


                labelValue = stringResource(id = R.string.firstname),
                painterResource (id=R.drawable.profile)

            )
            MyTextField(
                labelValue = stringResource(id = R.string.lastname),
                painterResource (
                    id=R.drawable.profile

                )
            )
            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource (id=R.drawable.message)
            )
            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource (id=R.drawable.lock),


            )
             CheckboxComponent(value = stringResource(id= R.string.terms_and_conditions), onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)

            } )
            Spacer(modifier = Modifier.height(60.dp))

            ButtonComponent(value = stringResource(R.string.register))
            DividerTextComponent()
            ClickableLoginTextComponent(tryingToLogin = true, onTextSelected = {
                PostOfficeAppRouter.navigateTo(Screen.LoginScreen)
            })
        }


        }

    }



@Preview
@Composable
private fun SignUpScreenPreview() {
    JetPackComposeMasterClassTheme {
        SignUpScreen()
    }

}