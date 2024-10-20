package com.example.a512lasalleapp.models

data class Student(
    val id: Int,
    val fullName: String,
    val dateOfBirth: String,
    val institutionalEmail: String,
    val career: String,
    val currentSemester: String,
    val subjects: List<Subject>,
    val pastSemesters: List<Float>,
    val tution: List<Tuition>
) {
    val semesterAverage: Float
        get() = if (subjects.isNotEmpty()) {
            subjects.map { it.semesterAverage }.average().toFloat()
        } else 0f

    val accumulatedAverage: Float
        get() {
            val allSemesters = pastSemesters + semesterAverage
            return if (allSemesters.isNotEmpty()) {
                allSemesters.average().toFloat()
            } else 0f
        }
}

