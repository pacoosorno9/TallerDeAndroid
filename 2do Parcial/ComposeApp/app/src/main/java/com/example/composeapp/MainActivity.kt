package com.example.composeapp

import android.annotation.SuppressLint
import android.content.pm.ModuleInfo
import android.health.connect.datatypes.Device
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){
                    MyRow()
                }
            }
        }
    }
}

//COLUMN, ESTE COMPONENTE PONE LOS ITEMS DE MANERA VERTICAL

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier.fillMaxSize()
            .background(Color.Cyan),
        verticalArrangement = Arrangement.SpaceAround
    ) {
        Text(text = "Ejemplo 1", modifier = Modifier.background(Color.Red))
        Text(text = "Ejemplo 2", modifier = Modifier.background(Color.Blue))
        Text(text = "Ejemplo 3", modifier = Modifier.background(Color.Yellow))
        Text(text = "Ejemplo 4", modifier = Modifier.background(Color.Green))
    }
}
//ROW PONE LOS COMPONENTES DE MANERA HORIZONTAL
@Composable
fun MyRow(){
    Row (
        modifier = Modifier.fillMaxWidth().horizontalScroll(
            rememberScrollState()
        )
    ){
        Text(text = "Ejemplo 1",
            modifier = Modifier
                .background(Color.Red)
                .width(100.dp)
                .height(200.dp)
        )
        Text(text = "Ejemplo 2",
            modifier = Modifier
                .background(Color.Cyan)
                .width(100.dp)
                .height(200.dp)
        )
        Text(text = "Ejemplo 3",
            modifier = Modifier
                .background(Color.Blue)
                .width(100.dp)
                .height(200.dp)
        )
        Text(text = "Ejemplo 4",
            modifier = Modifier
                .background(Color.Yellow)
                .width(100.dp)
                .height(200.dp)
        )
        Text(text = "Ejemplo 5",
            modifier = Modifier
                .background(Color.Green)
                .width(100.dp)
                .height(200.dp)
        )
        Text(text = "Ejemplo 6",
            modifier = Modifier
                .background(Color.Magenta)
                .width(100.dp)
                .height(200.dp)
        )
    }
    
}
//COMPONENTE BOX, PONE ELEMENTOS UNO ENCIMA DEL OTRO
@Composable
fun MyBox(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Box(
            modifier = Modifier.background(Color.Cyan)
                .width(200.dp)
                .clip(RoundedCornerShape(10.dp))
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            Text("Hola a todos")
        }

    }


}

@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_7_PRO
)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        MyBox()

    }
}