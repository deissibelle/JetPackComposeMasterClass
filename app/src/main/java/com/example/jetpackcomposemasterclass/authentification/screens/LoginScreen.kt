package com.example.jetpackcomposemasterclass.authentification.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.R
import com.example.jetpackcomposemasterclass.authentification.components.ClickableLoginTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.UnderLinedTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.ButtonComponent
import com.example.jetpackcomposemasterclass.authentification.components.DividerTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.HeaderTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.MyTextField
import com.example.jetpackcomposemasterclass.authentification.components.NormalTextComponent
import com.example.jetpackcomposemasterclass.authentification.components.PasswordTextField
import com.example.jetpackcomposemasterclass.authentification.route.PostOfficeAppRouter
import com.example.jetpackcomposemasterclass.authentification.route.Screen
import com.example.jetpackcomposemasterclass.authentification.route.SystemBackButtonHandler
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {

        Surface(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
                .padding(28.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {

                NormalTextComponent(value = stringResource(id = R.string.login))
                HeaderTextComponent(value = stringResource(id = R.string.welcome))
                Spacer(modifier = Modifier.height(18.dp))

                MyTextField(labelValue = stringResource(id = R.string.email),
                    painterResource(id = R.drawable.message),

                )
                PasswordTextField(
                    labelValue = stringResource(id = R.string.password),
                    painterResource(id = R.drawable.lock),

                )

                Spacer(modifier = Modifier.height(20.dp))
                UnderLinedTextComponent(value = stringResource(id = R.string.forgot_password))

                Spacer(modifier = Modifier.height(40.dp))

                ButtonComponent(
                    value = stringResource(id = R.string.login),

                )
                Spacer(modifier = Modifier.height(20.dp))
                DividerTextComponent()

                ClickableLoginTextComponent( tryingToLogin = false,onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
                })
            }
        }


    }


    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }



}

@Preview
@Composable
private fun LoginScreenPreview() {
    JetPackComposeMasterClassTheme {
        LoginScreen()
    }

}