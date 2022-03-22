package com.masters.friendshipbraceletsdiary.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.masters.friendshipbraceletsdiary.ui.theme.FriendshipBraceletsDiaryTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            FriendshipBraceletsDiaryTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "generate_pattern_screen") {
                    composable("generate_pattern_screen") {
                        GeneratePatternScreen()
                    }
                }
            }
        }
    }
}