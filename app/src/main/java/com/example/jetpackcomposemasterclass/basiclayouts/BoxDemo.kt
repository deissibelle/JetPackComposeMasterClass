package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.R
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun BoxDemo(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .size(100.dp),
        contentAlignment= Alignment.Center
    ) {
Box(
    modifier = Modifier
        .matchParentSize()
        .background(brush = Brush.verticalGradient(
        colors = listOf(
            Color.Transparent,
            Color.Black
        )
    ))
)
        Image(
            painter = painterResource(R.drawable.nature),
            contentDescription = null,
            modifier = Modifier.size(100.dp)
            
        )
        IconButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .size(10.dp)
        ) {
            Icon(
                imageVector= Icons.Default.FavoriteBorder,
                contentDescription=null,
                tint = Color.Red
            )
        }

    }


}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFF
)
@Composable
private fun BoxDemoPreview() {
   JetPackComposeMasterClassTheme {
       BoxDemo()
   }

}