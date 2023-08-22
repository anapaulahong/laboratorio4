package com.example.laboratory4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
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
fun Campus(name: String, modifier: Modifier = Modifier, cornerRadius: Dp) {
    Column{
        Text(
            text = "Campus Central",
            modifier = modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.TopCenter)
                .padding(30.dp)
        )
    }
    Image(
        painter = painterResource(id = R.drawable.campus),
        contentDescription = "fotita campus uvg",
        modifier = modifier
            .width(450.dp)
            .height(360.dp)
    )
    Text(
        text = "DESTACADOS",
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(start = 15.dp, top = 320.dp) //start: de izq a derecha, top: de arriba a abajo
    )
    Image(
        painter = painterResource(id = R.drawable._ingresocit),
        contentDescription = "personas entrando por el cit xd",
        modifier = modifier
            .size(200.dp)
            .padding(17.dp)
            .offset(y = 310.dp) //bajar la imagen
            .clip(RoundedCornerShape(cornerRadius))
    )
    Image(
        painter = painterResource(id = R.drawable.ocit),
        contentDescription = "cit",
        modifier = modifier
            .padding(start = 205.dp)
            .offset(y = 355.dp)
    )
    Text(
        text = "SERVICIOS Y RECURSOS",
        color = Color.DarkGray,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(start = 15.dp, top = 520.dp)
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratory4Theme {
        Campus("Campus central", cornerRadius = 16.dp)

    }
}}