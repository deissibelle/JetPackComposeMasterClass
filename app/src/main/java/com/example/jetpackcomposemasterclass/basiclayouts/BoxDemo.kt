package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.Image
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
            .size(200.dp),
        contentAlignment= Alignment.BottomCenter
    ) {

        Image(
            painter = painterResource(R.drawable.nature),
            contentDescription = null,
            modifier = Modifier.size(300.dp)
            
        )
        IconButton(
            onClick = {}
        ) {
            Icon(
                imageVector= Icons.Default.FavoriteBorder,
                contentDescription=null,
                tint = Color.White
            )
        }
        Text(
            text="Hello Sibelle",
            modifier = Modifier.align(Alignment.TopStart)
        )

        Text(
            text="What's up?",

            )
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