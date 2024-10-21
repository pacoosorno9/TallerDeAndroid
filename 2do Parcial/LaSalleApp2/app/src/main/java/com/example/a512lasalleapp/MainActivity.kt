package com.example.a512lasalleapp

import android.os.Bundle
import androidx.compose.ui.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.a512lasalleapp.ui.screens.*
import com.example.a512lasalleapp.ui.theme.LaSalleAppTheme
import com.example.a512lasalleapp.ui.utils.Screens
import com.example.a512lasalleapp.ui.utils.bottomNavBarItems
import com.exyte.animatednavbar.AnimatedNavigationBar
import com.exyte.animatednavbar.animation.indendshape.shapeCornerRadius
import androidx.compose.foundation.layout.PaddingValues
import androidx.navigation.NavController
import com.example.a512lasalleapp.models.Student
import com.example.a512lasalleapp.models.Subject
import com.example.a512lasalleapp.ui.utils.studentsList
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            var isDarkTheme by remember { mutableStateOf(false) }
            val navController = rememberNavController()
            var selectedItemIndex by rememberSaveable { mutableStateOf(0) }
            val bottomNavRoutes = listOf(
                Screens.Home.route,
                Screens.Grades.route,
                Screens.Settings.route,
                Screens.Calendar.route
            )

            val studentEmail = "jom77268@lasallebajio.edu.mx"
            val student = studentsList.find { it.institutionalEmail == studentEmail }
            val sharedPreferences = getSharedPreferences("myPrefs", MODE_PRIVATE)

            LaSalleAppTheme {
                val currentRoute = navController.currentBackStackEntryAsState().value?.destination?.route

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    bottomBar = {
                        if (currentRoute in bottomNavRoutes) {
                            AnimatedNavigationBar(
                                selectedIndex = selectedItemIndex,
                                modifier = Modifier.height(90.dp),
                                barColor = MaterialTheme.colorScheme.primary,
                                ballColor = MaterialTheme.colorScheme.primary,
                                cornerRadius = shapeCornerRadius(cornerRadius = 34.dp)
                            ) {
                                bottomNavBarItems.forEachIndexed { index, bottomNavigationItem ->
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally,
                                        verticalArrangement = Arrangement.Center,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .clickable {
                                                selectedItemIndex = index
                                                navController.navigate(bottomNavigationItem.route)
                                            }
                                    ) {
                                        Icon(
                                            imageVector = bottomNavigationItem.icon,
                                            contentDescription = bottomNavigationItem.title,
                                            tint = if (selectedItemIndex == index) Color.White else Color.White.copy(alpha = 0.5f),
                                            modifier = Modifier.size(26.dp)
                                        )
                                        Text(
                                            text = bottomNavigationItem.title,
                                            style = MaterialTheme.typography.bodySmall,
                                            color = if (selectedItemIndex == index) Color.White else Color.White.copy(alpha = 0.5f)
                                        )
                                    }
                                }
                            }
                        }
                    }
                ) { innerPadding ->
                    NavHost(
                        navController = navController,
                        startDestination = "home"
                    ) {
                        composable(route = Screens.Home.route) {
                            HomeScreen(innerPadding = innerPadding, navController = navController, context = this@MainActivity)
                        }
                        composable(route = Screens.Calendar.route) {
                            CalendarScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Grades.route) {
                            if (student != null) {
                                GradesScreen(navController, innerPadding = innerPadding, student = student)
                            } else {
                                Text("No se encontraron datos del estudiante.")
                            }
                        }
                        composable(route = Screens.Settings.route) {
                            if (student != null) {
                                SettingsScreen(innerPadding = innerPadding, student = student, navController)
                            }
                        }
                        composable(route = Screens.NewsDetail.route + "/{id}", arguments = listOf(navArgument("id") { type = NavType.IntType })) {
                            val id = it.arguments?.getInt("id", 0) ?: 0
                            NewsDetailScreen(newsId = id, innerPadding = innerPadding)
                        }
                        composable(route = Screens.Subject.route + "/{subjectId}", arguments = listOf(navArgument("subjectId") { type = NavType.IntType })) { backStackEntry ->
                            val subjectId = backStackEntry.arguments?.getInt("subjectId") ?: 0
                            val subject = student?.subjects?.find { it.id == subjectId }

                            if (subject != null) {
                                SubjectScreen(subject = subject, innerPadding)
                            }
                        }
                        composable(route = Screens.Password.route) {
                            PasswordScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Theme.route) {
                            PasswordScreen(innerPadding = innerPadding)
                        }
                        composable(route = Screens.Payments.route) {
                            // Obtener el correo del estudiante desde SharedPreferences
                            val studentEmail = sharedPreferences.getString("studentEmail", "")

                            // Buscar el estudiante por su correo en la lista de estudiantes
                            val student = studentsList.find { it.institutionalEmail == studentEmail }

                            if (student != null) {
                                // Si se encuentra el estudiante, mostrar la pantalla de pagos
                                PaymentsScreen(innerPadding = innerPadding, navController = navController, student = student)
                            }
                        }
                    }
                }
            }
        }
    }
}