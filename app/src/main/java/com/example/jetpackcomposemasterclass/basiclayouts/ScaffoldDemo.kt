@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.jetpackcomposemasterclass.basiclayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.ui.theme.JetPackComposeMasterClassTheme
import kotlinx.coroutines.launch


@Composable
fun ScaffoldDemo(modifier: Modifier = Modifier) {
    val snackBarState = remember {
        SnackbarHostState()
    }
    val scope = rememberCoroutineScope()


    Scaffold (
        topBar = {
            TopAppBar(
                title = {
                    Text("Hello world")
                },
                navigationIcon = {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Default.ArrowBack,
                            contentDescription = "Go Back"
                        )
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    scope.launch {
                        snackBarState.showSnackbar(
                            message = "Clicked FAB"
                        )
                    }

                }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        },
        snackbarHost = {
            SnackbarHost(
               hostState = SnackbarHostState()
            )
        },
        bottomBar = {
            BottomAppBar {
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon={
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text("favorites")
                    }
                )
                NavigationBarItem(
                    selected = true,
                    onClick = {},
                    icon={
                        Icon(
                            imageVector = Icons.Default.Favorite,
                            contentDescription = null
                        )
                    },
                    label = {
                        Text("search")
                    }
                )
            }
        }
    ){ padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .background(Color.Cyan)
        ) {
            Text(
                text = "Hello world",
            )
        }
    }

}



@Preview(
    showBackground = true
)
@Composable
private fun ScaffoldDemoPreview() {
    JetPackComposeMasterClassTheme {
        ScaffoldDemo()
    }

}