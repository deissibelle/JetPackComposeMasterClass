package com.example.jetpackcomposemasterclass.composables.card

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme

@Composable
fun CardExample(modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),




    ) {

        Card(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.size(width = 100.dp, height = 100.dp)
        ){
            Text(
                text = "Filled Card",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center


            )


    }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.size(width=100.dp, height = 100.dp)

        ){
            Text(
                text = "Filled Card",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )

        }
        Card (
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant,
            ),
            modifier = Modifier.size(width=100.dp, height = 100.dp)

        ){
            Text(
                text = "Filled Card",
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center
            )

        }


    }
}

@Preview
@Composable
private fun CardPreview() {
    JetPackComposeMasterClassTheme {
        CardExample()
    }

}