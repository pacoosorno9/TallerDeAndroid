package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.models.Tuition
import com.example.a512lasalleapp.ui.components.CardImage
import com.example.a512lasalleapp.ui.components.PerfilItem
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.ui.components.SettingsItem
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Screens
import com.example.a512lasalleapp.ui.utils.newsList
import com.example.a512lasalleapp.ui.utils.settingsList
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun SettingsScreen(innerPadding: PaddingValues, student: Student, navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        PerfilItem(student)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(50.dp),
            contentAlignment = Alignment.Center
        ) {
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                items(settingsList) { settings ->
                    SettingsItem(settings.icon, settings.option) {
                        when (settings.option) {
                            "Cambiar contraseña" -> {
                                navController.navigate(Screens.Password.route)
                            }
                            "Cambiar tema" -> {
                                navController.navigate(Screens.Theme.route)
                            }
                        }
                    }
                }
            }
        }
    }
}



@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun SettingsScreenPreview() {
    val student = Student(
        id = 1,
        fullName = "Juan Francisco",
        dateOfBirth = "2004-06-24",
        institutionalEmail = "jom77268@lasallebajio.edu.mx",
        career = "ISSC",
        photo = "https://em-content.zobj.net/source/apple/237/ghost_1f47b.png",
        currentSemester = "1",
        subjects = listOf(
            Subject(id = 1, subjectName = "PROGRAMACIÓN PARA PLATAFORMA OS X", partialGrades = listOf(8.1f, 10.0f, 7.0f)),
            Subject(id = 2, subjectName = "DESARROLLO INTEGRAL PARA APLICACIONES EMPRESARIALES", partialGrades = listOf(7.8f, 6.7f, 8.0f)),
            Subject(id = 3, subjectName = "TALLER DE DESARROLLO MÓVIL PARA PLATAFORMA WINDOWS", partialGrades = listOf(10.0f, 8.0f, 9.0f)),
            Subject(id = 4, subjectName = "FUNDAMENTOS DE REDES Y RUTEO", partialGrades = listOf(9.2f, 8.2f, 9.5f)),
            Subject(id = 5, subjectName = "IMPLEMENTACIÓN E INTEGRACIÓN DE SERVIDORES PARA EL DESARROLLO DE SOFTWARE", partialGrades = listOf(4.9f, 7.8f, 9.8f)),
            Subject(id = 6, subjectName = "RELIGIÓN, CULTURA Y TRASCENDENCIA", partialGrades = listOf(8.3f, 8.0f, 10.0f)),
            Subject(id = 7, subjectName = "LENGUA EXTRANJERA III - INGLÉS IV", partialGrades = listOf(5.9f, 6.2f, 10.0f))
        ),
        pastSemesters = listOf(0f),
        tution = listOf(
            Tuition(1, "PRIMER PAGO DE COLEGIATURA", "agosto 16 de 2024", "57 - AGO-DIC 2024", 15000, true, "CPAL00020769"),
            Tuition(2, "SEGUNDO PAGO DE COLEGIATURA", "septiembre 16 de 2024", "57 - AGO-DIC 2024", 15000, true, "CPAL00020770")
        )
    )

    val navController = rememberNavController()

    LaSalleAppTheme {
        SettingsScreen(innerPadding = PaddingValues(), student = student, navController = navController)
    }
}
