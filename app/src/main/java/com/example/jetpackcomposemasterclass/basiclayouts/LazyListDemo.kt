package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun LazyListDemo(modifier: Modifier = Modifier) {
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        items(100){
            i -> Text("Item $i")
        }
    }



}

@Preview(
    showBackground = true
)
@Composable
private fun LazyListDemoPreview() {
    JetPackComposeMasterClassTheme {
        LazyListDemo()
    }

}