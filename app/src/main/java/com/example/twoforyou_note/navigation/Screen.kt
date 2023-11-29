package com.example.twoforyou_note.navigation

sealed class Screen(val route: String) {
    object SplashScreen : Screen(route = "splash_screen")
    object ViewScreen : Screen(route = "note_view_screen")
    object EditScreen : Screen(route = "note_edit_screen")
}
