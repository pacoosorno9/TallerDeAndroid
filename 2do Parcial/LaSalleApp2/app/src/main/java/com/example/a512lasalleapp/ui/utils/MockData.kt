package com.example.a512lasalleapp.ui.utils

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
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
import java.time.LocalDate

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
    Subject(id = 1, subjectName = "PROGRAMACIÓN PARA PLATAFORMA OS X", partialGrades = listOf()),
    Subject(id = 2, subjectName = "DESARROLLO PARA APLICACIONES EMPRESARIALES", partialGrades = listOf()),
    Subject(id = 3, subjectName = "TALLER DE DESARROLLO MÓVIL PARA WINDOWS", partialGrades = listOf()),
    Subject(id = 4, subjectName = "FUNDAMENTOS DE REDES Y RUTEO", partialGrades = listOf()),
    Subject(id = 5, subjectName = "SERVIDORES PARA EL DESARROLLO DE SOFTWARE", partialGrades = listOf()),
    Subject(id = 6, subjectName = "RELIGIÓN, CULTURA Y TRASCENDENCIA", partialGrades = listOf()),
    Subject(id = 7, subjectName = "LENGUA EXTRANJERA III - INGLÉS IV", partialGrades = listOf())
)

val settingsList = listOf(
    Settings(
        id = 1, icon = Passkey, option = "Cambiar contraseña"
    ),
    Settings(
        id = 1, icon = MoonStars, option = "Cambiar tema"
    ),
)
val studentsList = listOf(
    Student(
        id = 1,
        fullName = "Juan Francisco",
        dateOfBirth = "24 de Junio de 2004",
        institutionalEmail = "jom77268@lasallebajio.edu.mx",
        career = "ISSC",
        photo = "https://em-content.zobj.net/source/apple/237/ghost_1f47b.png",
        currentSemester = "4",
        subjects = listOf(
            Subject(id = 1, subjectName = "PROGRAMACIÓN PARA PLATAFORMA OS X", partialGrades = listOf(8.1f, 10.0f, 7.0f)),
            Subject(id = 2, subjectName = "DESARROLLO PARA APLICACIONES EMPRESARIALES", partialGrades = listOf(7.8f, 6.7f, 8.0f)),
            Subject(id = 3, subjectName = "TALLER DE DESARROLLO MÓVIL PARA WINDOWS", partialGrades = listOf(10.0f, 8.0f, 9.0f)),
            Subject(id = 4, subjectName = "FUNDAMENTOS DE REDES Y RUTEO", partialGrades = listOf(9.2f, 8.2f, 9.5f)),
            Subject(id = 5, subjectName = "SERVIDORES PARA EL DESARROLLO DE SOFTWARE", partialGrades = listOf(4.9f, 7.8f, 9.8f)),
            Subject(id = 6, subjectName = "RELIGIÓN, CULTURA Y TRASCENDENCIA", partialGrades = listOf(8.3f, 8.0f, 10.0f)),
            Subject(id = 7, subjectName = "LENGUA EXTRANJERA III - INGLÉS IV", partialGrades = listOf(5.9f, 6.2f, 10.0f))
        ),
        pastSemesters = listOf(0f),
        tution = listOf(
            Tuition(
                1,
                "PRIMER PAGO",
                "agosto 16 de 2024",
                "AGO-DIC 2024",
                15000,
                true,
                "CPAL00020769"
            ),
            Tuition(
                2,
                "SEGUNDO PAGO",
                "septiembre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                false,
                "CPAL00020770"
            ),
            Tuition(
                3,
                "TERCER PAGO",
                "octubre 16 de 2024",
                "AGO-DIC 2024",
                15000,
                false,
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
)

val tuitionList = listOf(
    Tuition(
        1,
        "PRIMER PAGO",
        "agosto 16 de 2024",
        "AGO-DIC 2024",
        15000,
        true,
        "CPAL00020769"
    ), Tuition(
        2,
        "SEGUNDO PAGO",
        "septiembre 16 de 2024",
        "AGO-DIC 2024",
        15000,
        true,
        "CPAL00020770"
    ), Tuition(
        3,
        "TERCER PAGO",
        "octubre 16 de 2024",
        "AGO-DIC 2024",
        15000,
        true,
        "CPAL00020771"
    ), Tuition(
        4,
        "CUARTO PAGO",
        "noviembre 16 de 2024",
        "AGO-DIC 2024",
        15000,
        true,
        "CPAL00020772"
    ), Tuition(
        5,
        "QUINTO PAGO",
        "diciembre 16 de 2024",
        "AGO-DIC 2024",
        15000,
        true,
        "CPAL00020773"
    ),
    )

