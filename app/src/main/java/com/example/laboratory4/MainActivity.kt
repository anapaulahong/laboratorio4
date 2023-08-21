package com.example.laboratory4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.laboratory4.ui.theme.Laboratory4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory4Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background){
            }
        }
    }
}

@Composable
fun Campus(name: String, modifier: Modifier = Modifier) {
    Column{
        Text(
            text = "Campus central",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .padding(30.dp)
        )
    }
    Image(
        painter = painterResource(id = R.drawable.campus),
        contentDescription = "fotita campus uvg",
        modifier = Modifier
            .padding(60.dp)
    )


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratory4Theme {
        Campus("Campus central")

    }
}}