package com.example.jetpackcomposemasterclass.animations


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun AnimateListChangesDemo(modifier: Modifier = Modifier) {
    var items by remember {
        mutableStateOf(
            (1..100).map {
                "List item $it"
            }
        )
    }
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                items = items.shuffled()
            }
        ) {
            Text("Shuffle")
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            items(
                items = items,
                key = { it }
            ) { text ->
                Text(
                    text = text,
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            items = items - text
                        }
                        .padding(16.dp)
                        .animateItemPlacement()
                )
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun AnimateListChangesDemoPreview() {
    JetPackComposeMasterClassTheme {
        AnimateListChangesDemo()
    }
}