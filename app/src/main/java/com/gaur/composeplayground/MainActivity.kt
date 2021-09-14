package com.gaur.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.gaur.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                Surface(color = MaterialTheme.colors.background) {
                    ColumnExample()
                }
            }
        }
    }
}


@Composable
fun ColumnExample() {

    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Card(modifier = Modifier.padding(8.dp)) {
            Text(text = "first card", modifier = Modifier.padding(8.dp))
        }

        Card(modifier = Modifier.padding(8.dp)) {
            Text(text = "sec card", modifier = Modifier.padding(8.dp))
        }

        Card(modifier = Modifier.padding(8.dp)) {
            Text(text = "third card", modifier = Modifier.padding(8.dp))
        }

        Card(modifier = Modifier.padding(8.dp)) {
            Text(text = "fourth card", modifier = Modifier.padding(8.dp))
        }

        Card(modifier = Modifier.padding(8.dp)) {
            Text(text = "fifth card", modifier = Modifier.padding(8.dp))
        }

    }


}














