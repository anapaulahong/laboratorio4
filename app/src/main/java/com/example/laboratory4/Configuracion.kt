package com.example.laboratory4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laboratory4.ui.theme.Laboratory4Theme

class Configuracion : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Laboratory4Theme {
                // A surface container using the 'background' color from the theme
                Surface(color = Color.White){
            }
        }
    }
}

@Composable
fun Configuracionn(name: String, modifier: Modifier = Modifier) {
    Column{
        Text(
            text = "Settings",
            style = TextStyle(fontSize = 18.sp),
            fontWeight = FontWeight.Bold,
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .padding(28.dp)
        )
    }
    Image(
        painterResource(id = R.drawable.close__1_),
        contentDescription = null,
        modifier = modifier
            .padding(top = 35.dp, start = 25.dp)
    )

    Text(
        text = "My Campus",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 330.dp) //start: de izq a derecha, top: de arriba a abajo
    )
    Text(
        text = "Campus Central",
        color = Color.DarkGray,
        style = TextStyle(fontSize = 15.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 353.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito1_removebg_preview),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 330.dp)
        )
    }

    Text(
        text = "My Friends",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 400.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito2),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 395.dp)
        )
    }

    Text(
        text = "My Calendar",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 460.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito3),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 455.dp)
        )
    }

    Text(
        text = "My Courses",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 518.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito4),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 513.dp)
        )
    }

    Text(
        text = "My Grades",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 575.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito5),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 568.dp)
        )
    }

    Text(
        text = "My Groups",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 628.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito6),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 623.dp)
        )
    }
    
    Text(
        text = "My Upcoming Events",
        color = Color.Black,
        style = TextStyle(fontSize = 19.sp),
        modifier = modifier
            .padding(start = 55.dp, top = 680.dp)
    )
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.iconito7),
            contentDescription = null,
            modifier = modifier
                .size(40.dp)
                .offset(x = 10.dp, y = 673.dp)
        )
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratory4Theme {
        Configuracionn("Campus central")

    }
}}