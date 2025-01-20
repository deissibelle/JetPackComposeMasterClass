package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun FlowLayoutDemo(modifier: Modifier = Modifier) {
    FlowRow(
        modifier = Modifier
            .fillMaxSize(),

        horizontalArrangement = Arrangement.SpaceBetween

    ) {
        for (i in 1..30){
            AssistChip(
                onClick = {},
                label = {
                    Text("item $i")
                }
            )
        }

    }

}

@Preview(
    showBackground = true,
)
@Composable
private fun FlowLayoutDemoPreview() {
    JetPackComposeMasterClassTheme {
        FlowLayoutDemo()
    }
}