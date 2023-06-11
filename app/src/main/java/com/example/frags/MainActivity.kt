package com.example.frags

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frags.ui.theme.FragsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FragsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Finished();
                }
            }
        }
    }
}

@Composable
fun RowScope.SingleFrag(head: String, para: String, backgroundColor: Color) {
    Column (
        modifier = Modifier
            .fillMaxSize(.5f)
            .weight(1f, true)
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Text(
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
            fontSize = 14.sp,
            text = head,
            modifier = Modifier.padding(bottom = 2.dp)
        )
        Text(
            text = para,
            fontSize = 11.sp,
        )
    }
}


@Composable
fun Frags() {
    Column(
        Modifier.fillMaxSize()
    ) {
        Row {
            SingleFrag(head = "Heading", para = "This is the paragraph", backgroundColor = Color.Cyan)
            SingleFrag(head = "Heading2", para = "This is the paragraph2", backgroundColor = Color.Magenta)
        }
        Row {
            SingleFrag(head = "Heading3", para = "This is the paragraph3", backgroundColor = Color.Yellow)
            SingleFrag(head = "Heading4", para = "This is the paragraph4", backgroundColor = Color.Gray)
        }

    }

}

@Composable
fun Finished() {
    Frags();
}

