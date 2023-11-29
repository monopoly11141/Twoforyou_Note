package com.example.twoforyou_note.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.twoforyou_note.screen.edit.EditScreen
import com.example.twoforyou_note.screen.splash.SplashScreen
import com.example.twoforyou_note.screen.view.ViewScreen

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route
    ) {
        composable(route = Screen.EditScreen.route) {
            EditScreen(navController = navController)
        }

        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(route = Screen.ViewScreen.route) {
            ViewScreen(navController = navController)
        }
    }
}