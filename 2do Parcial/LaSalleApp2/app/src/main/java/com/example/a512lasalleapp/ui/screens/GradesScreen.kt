package com.example.a512lasalleapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.ui.components.ScreenTemplate
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.models.Tuition
import com.example.a512lasalleapp.ui.components.SubjectItem
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme

@Composable
fun GradesScreen(navController: NavController, innerPadding: PaddingValues, student: Student) {
    // Calcular el promedio total del semestre
    val averageSemesterGrade = student.subjects.map { it.partialGrades.average() }.average()
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .padding(innerPadding)
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Calificaciones",
            style = MaterialTheme.typography.titleLarge,
            modifier = Modifier
                .padding(vertical = 16.dp)
        )
        Column(
            modifier = Modifier
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .placeholder(R.drawable.student_1)
                    .build(),
                contentDescription = "ProfileImage",
                modifier = Modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop,
            )
            Text(
                text = "Estudiante",
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = "${student.fullName}", // Mostrar carrera
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Text(
                text = "Carrera: ${student.career}", // Mostrar carrera
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Text(
                text = "Semestre Actual: ${student.currentSemester}",
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier
                    .padding(top = 10.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .border(1.dp, Color.Black)
                    .padding(10.dp),
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .border(1.dp, Color.Black)
                        .padding(8.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(text = "Materia", style = MaterialTheme.typography.bodyMedium)
                    Text(text = "Promedio", style = MaterialTheme.typography.bodyMedium)
                }

                student.subjects.forEach { subject ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .border(1.dp, Color.Black)
                            .padding(vertical = 20.dp)
                            .padding(horizontal = 8.dp)
                            .clickable { navController.navigate("subject/${subject.id}") },
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = subject.subjectName, style = MaterialTheme.typography.bodySmall)
                        Text(
                            text = "%.1f".format(subject.partialGrades.average()),
                            style = MaterialTheme.typography.bodySmall
                        )
                    }
                }

                Text(
                    text = "Promedio Total del Semestre: %.1f".format(averageSemesterGrade),
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier
                        .padding(top = 16.dp)
                )
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewGradesScreenWithTable() {
    LaSalleAppTheme {
        val navController = rememberNavController()
        val student = Student(
            id = 1,
            fullName = "Juan Francisco",
            dateOfBirth = "2004-06-24",
            institutionalEmail = "jom77268@lasallebajio.edu.mx",
            career = "ISSC",
            photo = "https://em-content.zobj.net/source/apple/237/ghost_1f47b.png",
            currentSemester = "4",
            subjects = listOf(
                Subject(id = 1, subjectName = "PROGRAMACIÓN PARA PLATAFORMA OS X", partialGrades = listOf(8.1f, 10.0f, 7.0f)),
                Subject(id = 2, subjectName = "DESARROLLO PARA APLICACIONES EMPRESARIALES", partialGrades = listOf(7.8f, 6.7f, 8.0f)),
                Subject(id = 3, subjectName = "TALLER DE DESARROLLO MÓVIL PARA WINDOWS", partialGrades = listOf(10.0f, 8.0f, 9.0f))
            ),
            pastSemesters = listOf(0f),
            tution = listOf(
                Tuition(1, "PRIMER PAGO DE COLEGIATURA", "agosto 16 de 2024", "AGO-DIC 2024", 15000, true, "CPAL00020769"),
                Tuition(2, "SEGUNDO PAGO DE COLEGIATURA", "septiembre 16 de 2024", "AGO-DIC 2024", 15000, true, "CPAL00020770")
            )
        )

        GradesScreen(navController = navController, innerPadding = PaddingValues(0.dp), student = student)
    }
}
