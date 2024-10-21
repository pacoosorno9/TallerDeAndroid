package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.models.Tuition
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme
import com.example.a512lasalleapp.ui.components.TutionItem


@Composable
fun PaymentsScreen(innerPadding: PaddingValues, navController: NavController, student: Student) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(50.dp)
        ) {
            items(student.tution) { tuition ->
                TutionItem(navController = navController, tuition)
            }
        }
    }
}


@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PaymentsScreenPreview() {
    val student = Student(
        id = 1,
        fullName = "Juan Francisco",
        dateOfBirth = "2004-06-24",
        institutionalEmail = "jom77268@lasallebajio.edu.mx",
        career = "ISSC",
        photo = "https://em-content.zobj.net/source/apple/237/ghost_1f47b.png",
        currentSemester = "4",
        subjects = listOf(

        ),
        pastSemesters = listOf(10f, 7.5f, 9.7f),
        tution = listOf(
            Tuition(
                1,
                "PRIMER PAGO",
                "enero 16 de 2026",
                "ENE-JUN 2026",
                15000,
                true,
                "CPAL00020784"
            ),
            Tuition(
                2,
                "SEGUNDO PAGO",
                "febrero 16 de 2026",
                "ENE-JUN 2026",
                15000,
                true,
                "CPAL00020785"
            ),
            Tuition(
                3,
                "TERCER PAGO",
                "marzo 16 de 2026",
                "ENE-JUN 2026",
                15000,
                true,
                "CPAL00020786"
            ),
            Tuition(
                4,
                "CUARTO PAGO",
                "abril 16 de 2026",
                "ENE-JUN 2026",
                15000,
                false,
                "CPAL00020787"
            ),
            Tuition(
                5,
                "QUINTO PAGO",
                "mayo 16 de 2026",
                "ENE-JUN 2026",
                15000,
                false,
                "CPAL00020788"
            ),
        )
    )
    val navController = rememberNavController()
    LaSalleAppTheme {
        PaymentsScreen(innerPadding = PaddingValues(), navController = navController, student)
    }
}