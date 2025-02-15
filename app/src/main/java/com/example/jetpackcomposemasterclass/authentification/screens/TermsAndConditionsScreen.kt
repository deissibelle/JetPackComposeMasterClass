package com.example.jetpackcomposemasterclass.authentification.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.R
import com.example.jetpackcomposemasterclass.authentification.components.HeaderTextComponent
import com.example.jetpackcomposemasterclass.authentification.route.PostOfficeAppRouter
import com.example.jetpackcomposemasterclass.authentification.route.Screen
import com.example.jetpackcomposemasterclass.authentification.route.SystemBackButtonHandler
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun TermsAndConditionsScreen(modifier: Modifier = Modifier) {
    Surface (
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp)
    ){
        HeaderTextComponent(value = stringResource(id = R.string.terms_and_conditions_Header))

    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignUpScreen)
    }

}

@Preview
@Composable
private fun TermsAndConditionScreenPreview() {
    JetPackComposeMasterClassTheme {
        TermsAndConditionsScreen()
    }

}