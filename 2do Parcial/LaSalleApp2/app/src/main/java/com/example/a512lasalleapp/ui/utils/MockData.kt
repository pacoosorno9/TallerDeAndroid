package com.example.a512lasalleapp.ui.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import com.example.a512lasalleapp.models.BottomNavigationItem
import com.example.a512lasalleapp.models.Community
import com.example.a512lasalleapp.models.News
import com.example.a512lasalleapp.models.Settings
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.models.Tuition

val newsList = listOf(
    News(
        id = 1,
        title = "Evento de Construcción de la Paz",
        description = "La Salle Bajío realiza un foro para fomentar la construcción de la paz en la comunidad estudiantil.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_1.jpg"
    ), News(
        id = 2,
        title = "Conferencia de Liderazgo",
        description = "Una conferencia que destaca la importancia del liderazgo en la comunidad universitaria.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_2.jpg"
    ), News(
        id = 3,
        title = "Semana Cultural 2024",
        description = "Celebración anual de la Semana Cultural con diversas actividades artísticas y deportivas.",
        image = "https://www.lasallebajio.edu.mx/noticias/images/4701_3.jpg"
    )
)

val bottomNavBarItems = listOf(
    BottomNavigationItem(
        title = "Inicio", icon = Icons.Default.Home, route = Screens.Home.route
    ), BottomNavigationItem(
        title = "Calificaciones", icon = Icons.Default.Menu, route = Screens.Grades.route
    ), BottomNavigationItem(
        title = "Calendario", icon = Icons.Default.DateRange, route = Screens.Calendar.route
    ), BottomNavigationItem(
        title = "Configuracion", icon = Icons.Default.Settings, route = Screens.Settings.route
    )
)

val communities = listOf(
    Community(
        1, "https://www.lasallebajio.edu.mx/comunidad/images/tile_documentos_inspiradores.jpg"
    ),
    Community(2, "https://www.lasallebajio.edu.mx/comunidad/images/tile_boletin.jpg"),
    Community(3, "https://www.lasallebajio.edu.mx/comunidad/images/tile_cat_souv_22.jpg "),
    Community(4, "https://www.lasallebajio.edu.mx/comunidad/images/tile_tramites.jpg"),
    Community(5, "https://www.lasallebajio.edu.mx/comunidad/images/tile_blog.jpg"),
)

val subjectList = listOf(
    Subject(id = 1, subjectName = "Math", partialGrades = listOf()),
    Subject(id = 2, subjectName = "Physics", partialGrades = listOf()),
    Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf()),
    Subject(id = 4, subjectName = "Biology", partialGrades = listOf()),
    Subject(id = 5, subjectName = "History", partialGrades = listOf()),
    Subject(id = 6, subjectName = "Data Structures", partialGrades = listOf()),
    Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf()),
    Subject(id = 8, subjectName = "Database Systems", partialGrades = listOf()),
    Subject(id = 9, subjectName = "Operating Systems", partialGrades = listOf()),
    Subject(id = 10, subjectName = "Computer Networks", partialGrades = listOf()),
    Subject(id = 11, subjectName = "Software Engineering", partialGrades = listOf()),
    Subject(id = 12, subjectName = "Discrete Mathematics", partialGrades = listOf()),
    Subject(id = 13, subjectName = "Compiler Design", partialGrades = listOf()),
    Subject(id = 14, subjectName = "Artificial Intelligence", partialGrades = listOf()),
    Subject(id = 15, subjectName = "Machine Learning", partialGrades = listOf()),
    Subject(id = 16, subjectName = "Deep Learning", partialGrades = listOf()),
    Subject(id = 17, subjectName = "Web Development", partialGrades = listOf()),
    Subject(id = 18, subjectName = "Mobile App Development", partialGrades = listOf()),
    Subject(id = 19, subjectName = "Cloud Computing", partialGrades = listOf()),
    Subject(id = 20, subjectName = "Quantum Computing", partialGrades = listOf()),
    Subject(id = 21, subjectName = "Cybersecurity", partialGrades = listOf()),
    Subject(id = 22, subjectName = "Human-Computer Interaction", partialGrades = listOf()),
    Subject(id = 23, subjectName = "Parallel Computing", partialGrades = listOf()),
    Subject(id = 24, subjectName = "Computer Graphics", partialGrades = listOf()),
    Subject(id = 25, subjectName = "Game Development", partialGrades = listOf()),
    Subject(id = 26, subjectName = "Blockchain Technology", partialGrades = listOf()),
    Subject(id = 27, subjectName = "Software Testing", partialGrades = listOf()),
    Subject(id = 28, subjectName = "DevOps", partialGrades = listOf()),
    Subject(id = 29, subjectName = "Big Data", partialGrades = listOf()),
    Subject(id = 30, subjectName = "Natural Language Processing", partialGrades = listOf()),
    Subject(id = 31, subjectName = "Augmented Reality", partialGrades = listOf()),
    Subject(id = 32, subjectName = "Virtual Reality", partialGrades = listOf()),
    Subject(id = 33, subjectName = "Ethical Hacking", partialGrades = listOf()),
    Subject(id = 34, subjectName = "Internet of Things", partialGrades = listOf()),
    Subject(id = 35, subjectName = "Software Architecture", partialGrades = listOf())
)

val settingsList = listOf(
    Settings(
        id = 1, icon = Passkey, option = "Cambiar contraseña"
    ),
    Settings(
        id = 2, icon = MoonStars, option = "Cambiar tema"
    ),
)

val studentsList = listOf(
    Student(
        id = 1,
        fullName = "Alice Johnson",
        dateOfBirth = "10 de Enero de 2001",
        institutionalEmail = "alice.johnson@university.edu",
        career = "ISSC",
        currentSemester = "1",
        subjects = listOf(
            Subject(id = 1, subjectName = "Math", partialGrades = listOf(8.0f, 9.0f, 7.5f)),
            Subject(id = 2, subjectName = "Physics", partialGrades = listOf(7.0f, 8.5f, 9.0f)),
            Subject(id = 3, subjectName = "Chemistry", partialGrades = listOf(9.5f, 8.5f, 10f)),
            Subject(id = 4, subjectName = "Biology", partialGrades = listOf(7.5f, 8.0f, 7.0f)),
            Subject(id = 5, subjectName = "History", partialGrades = listOf(8.0f, 9.5f, 9.0f)),
            Subject(
                id = 6, subjectName = "Data Structures", partialGrades = listOf(7.5f, 8.0f, 8.5f)
            ),
            Subject(id = 7, subjectName = "Algorithms", partialGrades = listOf(9.0f, 9.5f, 8.5f))
        ),
        pastSemesters = listOf(0f),
        tution = listOf(
            // Primer grupo de 5 estudiantes (Periodo AGO-DIC 2024)
            Tuition(
                1,
                "PRIMER HOLA MUNDO",
                "agosto 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020769"
            ),
            Tuition(
                2,
                "SEGUNDO PAGO",
                "septiembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                false,
                "CPAL00020770"
            ),
            Tuition(
                3,
                "TERCER PAGO",
                "octubre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                false,
                "CPAL00020771"
            ),
            Tuition(
                4,
                "CUARTO PAGO DE COLEGIATURA",
                "noviembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020772"
            ),
            Tuition(
                5,
                "QUINTO PAGO DE COLEGIATURA",
                "diciembre 16 de 2024",
                "57 - AGO-DIC 2024",
                15000,
                true,
                "CPAL00020773"
            ),
        )
    ),
)