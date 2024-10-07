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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeapp.ui.components.MyListItem
import com.example.composeapp.ui.theme.ComposeAppTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){
                    MyBox()
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
            modifier = Modifier
                .clip(CircleShape)
                .background(Color.Cyan)
                .width(200.dp)
                .height(200.dp),
            contentAlignment = Alignment.Center
        ){
            Text("Hola a todos")
        }
    }
}

@Composable
fun MyComplexLayout() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        //1. BOX
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.333f)
                .background(Color.Cyan)
        )

        //2. ROW
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.333f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.5f)
                    .background(Color.Yellow),
                    contentAlignment = Alignment.BottomEnd
            ) {
                Text("Hola a todos")
            }

            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(0.5f)
                    .background(Color.Green),
                contentAlignment = Alignment.Center
            ) {
                Text("Hola a todos")
            }

        }

        //3. BOX
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.333f)
                .background(Color.Magenta)
        )
    }
}

//@Composable
//fun MyList() {
//    val foodList = listOf("Hamburguesa", "Papas", "Tacos", "Sushi", "Ensalda", "Pozole")
//
//    LazyColumn(
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(10.dp)
//    ) {
//        items(foodList) { food ->
//            MyListItem(food = food )
//            Spacer(modifier = Modifier.height(10.dp))
//        }
//    }
//}


 @Composable
fun MyHomework() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Encabezado",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.3f)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.Yellow)
                    .weight(0.5f),
                contentAlignment = Alignment.Center
            ) {
                Column {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Caja 1 ",
                            modifier = Modifier.padding(20.dp),
                            fontSize = 24.sp
                        )
                        Box(
                            modifier = Modifier
                                .clip(RoundedCornerShape(30.dp))
                                .background(Color.Blue)
                        ) {
                            Text(
                                text = "Accion",
                                modifier = Modifier
                                    .padding(start = 30.dp)
                                    .padding(end = 30.dp)
                                    .padding(top = 20.dp)
                                    .padding(bottom = 20.dp), fontSize = 20.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(Color.Green)
                    .weight(0.5f),
                contentAlignment = Alignment.Center

            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Caja 2 ",
                        modifier = Modifier.padding(20.dp),
                        fontSize = 24.sp
                    )
                    Box(

                        modifier = Modifier
                            .clip(RoundedCornerShape(30.dp))
                            .background(Color.Blue)
                    ) {
                        Text(
                            text = "Accion",
                            modifier = Modifier
                                .padding(start = 30.dp)
                                .padding(end = 30.dp)
                                .padding(top = 20.dp)
                                .padding(bottom = 20.dp), fontSize = 20.sp,
                            color = Color.White
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxWidth()
                .weight(0.3f)
        ) {
            Column {
                Text(
                    text = "Lista de Elementos",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxWidth()

                )
                MyList()
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.2f)
                .background(Color.Magenta),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Pie de Página",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }

}

@Composable
fun MyList() {
    // Implementa la lista aquí
    Text(text = "Elemento de la lista")
}



@Preview(
    showBackground = true,
    showSystemUi = true,
    device = Devices.PIXEL_7_PRO
)
@Composable
fun GreetingPreview() {
    ComposeAppTheme {
        MyHomework()

    }
}