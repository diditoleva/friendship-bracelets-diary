package com.masters.friendshipbraceletsdiary.ui

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun GeneratePatternScreen()
{
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Generate Pattern") }
            )
        },
        content = {
            Text(text = "GeneratePattern")
        }
    )
}