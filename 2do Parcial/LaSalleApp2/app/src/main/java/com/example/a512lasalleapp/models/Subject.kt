package com.example.a512lasalleapp.models

data class Subject(
    val id: Int,
    val subjectName: String,
    val partialGrades: List<Float>
) {
    // PROMEDIO
    val semesterAverage: Float
        get() = if (partialGrades.isNotEmpty()) {
            partialGrades.average().toFloat()
        } else 0f
}

