package com.example.twoforyou_note.screen.edit

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.twoforyou_note.model.Note
import com.example.twoforyou_note.navigation.Screen
import com.example.twoforyou_note.screen.view.EditScreenViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditScreen(
    navController: NavHostController,
    viewModel: EditScreenViewModel = hiltViewModel()
) {

    var title by remember { mutableStateOf("") }
    var content by remember { mutableStateOf("") }


//    val time: Int,
//    val title: String,
//    val content: String

    Column(

    ) {

        OutlinedTextField(
            value = title,
            onValueChange = {
                title = it
            },
            label = {
                Text("title")
            }
        )

        OutlinedTextField(
            value = content,
            onValueChange = {
                content = it
            },
            label = {
                Text("content")
            }
        )

        Button(
            onClick = {
                viewModel.insertNote(
                    Note(
                        time = now(),
                        title = title,
                        content = content
                    )
                )

                navController.navigate(route = Screen.ViewScreen.route)
            }
        ) {
            Text("Save")
        }

    }
}

fun now(): String {
    return SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date())
}