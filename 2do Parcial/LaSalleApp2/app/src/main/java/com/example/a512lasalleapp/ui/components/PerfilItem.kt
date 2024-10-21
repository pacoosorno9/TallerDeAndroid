package com.example.a512lasalleapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.a512lasalleapp.R
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.models.Tuition
import com.example.a512lasalleapp.ui.screens.HomeScreen
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Cake2

@Composable
fun PerfilItem(student: Student) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 30.dp),
    ) {
        Column(
            horizontalAlignment = Alignment.Start
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier
                        .padding(vertical = 10.dp),
                    text = student.fullName,
                    style = MaterialTheme.typography.titleLarge
                )
                AsyncImage(
                    model = ImageRequest.Builder(LocalContext.current)
                        .placeholder(R.drawable.student_1)
                        .build(),
                    contentDescription = "ProfileImage",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape),
                    contentScale = ContentScale.Crop
                )
            }
            Row(
                modifier = Modifier
                    .padding(vertical = 10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                androidx.compose.material3.Icon(
                    imageVector = Cake2,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Text(
                    text = student.dateOfBirth,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                androidx.compose.material3.Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = null,
                    modifier = Modifier.size(40.dp),
                    tint = MaterialTheme.colorScheme.primary
                )
                Spacer(
                    modifier = Modifier
                        .width(20.dp)
                )
                Text(
                    text = student.institutionalEmail,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Preview(
)
@Composable
fun PerfilItemPreview() {
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
            Subject(id = 2, subjectName = "DESARROLLO INTEGRAL PARA APLICACIONES EMPRESARIALES", partialGrades = listOf(7.8f, 6.7f, 8.0f)),
            Subject(id = 3, subjectName = "TALLER DE DESARROLLO MÓVIL PARA PLATAFORMA WINDOWS", partialGrades = listOf(10.0f, 8.0f, 9.0f)),
            Subject(id = 4, subjectName = "FUNDAMENTOS DE REDES Y RUTEO", partialGrades = listOf(9.2f, 8.2f, 9.5f)),
            Subject(id = 5, subjectName = "IMPLEMENTACIÓN E INTEGRACIÓN DE SERVIDORES PARA EL DESARROLLO DE SOFTWARE", partialGrades = listOf(4.9f, 7.8f, 9.8f)),
            Subject(id = 6, subjectName = "RELIGIÓN, CULTURA Y TRASCENDENCIA", partialGrades = listOf(8.3f, 8.0f, 10.0f)),
            Subject(id = 7, subjectName = "LENGUA EXTRANJERA III - INGLÉS IV", partialGrades = listOf(5.9f, 6.2f, 10.0f))
        ),
        pastSemesters = listOf(0f),
        tution = listOf(
            Tuition(
                1,
                "PRIMER PAGO DE COLEGIATURA",
                "agosto 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020769"
            ),
            Tuition(
                2,
                "SEGUNDO PAGO DE COLEGIATURA",
                "septiembre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020770"
            ),
            Tuition(
                3,
                "TERCER PAGO DE COLEGIATURA",
                "octubre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020771"
            ),
            Tuition(
                4,
                "CUARTO PAGO DE COLEGIATURA",
                "noviembre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020772"
            ),
            Tuition(
                5,
                "QUINTO PAGO DE COLEGIATURA",
                "diciembre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020773"
            ),
        )
    )
    LaSalleAppTheme {
        PerfilItem(student = student)
    }
}