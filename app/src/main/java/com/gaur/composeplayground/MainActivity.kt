package com.gaur.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.gaur.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                MainScreen()
            }
        }
    }
}


@Composable
fun MainScreen() {

    val list = listOf("one", "two", "three", "four", "five")
    val expanded = remember { mutableStateOf(false) }
    val currentValue = remember { mutableStateOf(list[0]) }



    Surface(modifier = Modifier.fillMaxSize()) {

        Box(modifier = Modifier.fillMaxWidth()) {

            Row(modifier = Modifier
                .clickable {
                    expanded.value = !expanded.value
                }
                .align(Alignment.Center)) {
                Text(text = currentValue.value)
                Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = null)


                DropdownMenu(expanded = expanded.value, onDismissRequest = {
                    expanded.value = false
                }) {

                    list.forEach {

                        DropdownMenuItem(onClick = {
                            currentValue.value = it
                            expanded.value = false
                        }) {

                            Text(text = it)

                        }

                    }

                }


            }

        }


    }



}


@Composable
fun MainScreen2() {
    Surface(modifier = Modifier.fillMaxSize()) {

        val list = listOf("one", "two", "three", "four", "five")
        val currentValue = remember { mutableStateOf(list[0]) }
        val expanded = remember { mutableStateOf(false) }

        Box(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .clickable {
                    expanded.value = !expanded.value
                }
                .align(Alignment.Center)) {

                Text(
                    text = currentValue.value,
                    style = TextStyle(color = Color.Black, fontSize = 20.sp)
                )
                Icon(imageVector = Icons.Filled.ArrowDropDown, contentDescription = null)


                DropdownMenu(expanded = expanded.value, onDismissRequest = {
                    expanded.value = !expanded.value
                }) {

                    list.forEach {
                        DropdownMenuItem(onClick = {
                            expanded.value = false
                            currentValue.value = it

                        }) {
                            Text(text = it)
                        }
                    }


                }


            }

        }


    }
}

