package com.example.jetpackcomposemasterclass

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.authentification.screens.PostOfficeApp
import com.example.jetpackcomposemasterclass.authentification.screens.SignUpScreen
import com.example.jetpackcomposemasterclass.basiclayouts.HotelBookingScreen
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeMasterClassTheme {
               setContent {
                   PostOfficeApp()
               }

                }
            }
        }
    }




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeMasterClassTheme {
       PostOfficeApp()

    }
}