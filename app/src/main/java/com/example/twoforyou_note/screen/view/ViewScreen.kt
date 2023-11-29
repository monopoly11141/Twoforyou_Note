package com.example.twoforyou_note.screen.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.twoforyou_note.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ViewScreen(navController: NavHostController) {


    Scaffold(topBar = { },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
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
        Column(
            modifier = Modifier
                .padding(it)
        ) {

        }
    }

}

