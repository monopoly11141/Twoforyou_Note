package com.example.twoforyou_note

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.example.twoforyou_note.navigation.Navigation
import com.example.twoforyou_note.ui.theme.Twoforyou_NoteTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Twoforyou_NoteTheme {
                val navController = rememberNavController()
                Navigation(navController = navController)
            }
        }
    }
}
