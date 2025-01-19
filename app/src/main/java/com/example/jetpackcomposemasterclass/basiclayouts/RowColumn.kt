package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme
import kotlin.math.roundToInt

@Composable
fun RowColumnDemo() {
    Row(
        modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.aligned(Alignment.Horizontal{size,space,LayoutDirection -> (space*0.5).roundToInt()})
        ) {
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Red)
                .weight(2f)
        )
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Blue)
                .weight(1f)

        )
        Box(
            modifier = Modifier.size(100.dp)
                .background(Color.Black)
                .weight(0.5f)

        )
    }



}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun RowColumnDemoPreview() {
    JetPackComposeMasterClassTheme {
        RowColumnDemo()
    }
    
}