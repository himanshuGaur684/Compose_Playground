package com.gaur.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gaur.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Surface(color = MaterialTheme.colors.background) {
                    RowExample()
                }
            }
        }
    }
}

@Preview
@Composable
fun RowExample() {

    Row(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxWidth()
            .wrapContentHeight()
    ) {

        Card(
            modifier = Modifier
                .padding(8.dp)
                .width(100.dp)
                .height(100.dp)
        ) {


            Box(modifier = Modifier.fillMaxSize()) {

                Text(
                    text = "1", modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.Center)
                )
            }


        }


        Card(
            modifier = Modifier
                .padding(8.dp)
                .width(100.dp)
                .height(100.dp)
        ) {


            Box(modifier = Modifier.fillMaxSize()) {

                Text(
                    text = "2", modifier = Modifier
                        .padding(8.dp)
                        .align(Alignment.Center)
                )
            }


        }


    }


}





















