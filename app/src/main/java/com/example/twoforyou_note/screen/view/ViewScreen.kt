package com.example.twoforyou_note.screen.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.twoforyou_note.R
import com.example.twoforyou_note.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewScreen(
    navController: NavHostController,
    viewModel: ViewScreenViewModel = hiltViewModel()
) {

    Scaffold(topBar = { },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { navController.navigate(route = Screen.EditScreen.route) },
                modifier = Modifier
                    .size(50.dp)
                    .wrapContentHeight(Alignment.Bottom),
                shape = RectangleShape,
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_write),
                    contentDescription = "write note",
                )
            }
        }
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(it)
        ) {
            items(viewModel.noteList.value.size) {
                Text(viewModel.noteList.collectAsState().value[it].title)
            }
        }

    }

}

