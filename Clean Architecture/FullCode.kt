🏗 Clean Architecture Layers
...........................................................
📂 Domain Layer (Business Rules – independent of Android)
Entity (Student)
UseCase (GetStudentsUseCase)
Repository Interface
...........................................................
📂 Data Layer (Implements Repository – talks to DB/Network)
Repository Implementation
Fake Data Source
...........................................................
📂 Presentation Layer (UI + ViewModel – Android dependent)
ViewModel
UI (Activity/Compose)
...........................................................

CODE:
1. Domain Layer

// Student.kt (Entity)
package domain

data class Student(
    val id: Int,
    val name: String,
    val rollNumber: Int
)

// StudentRepository.kt (Abstraction)
package domain

interface StudentRepository {
    fun getStudents(): List<Student>
}

// GetStudentsUseCase.kt (Business Logic)
package domain

class GetStudentsUseCase(private val repository: StudentRepository) {
    operator fun invoke(): List<Student> {
        return repository.getStudents()
    }
}

2. Data Layer
// FakeStudentRepository.kt (Implementation)
package data

import domain.Student
import domain.StudentRepository

class FakeStudentRepository : StudentRepository {
    override fun getStudents(): List<Student> {
        return listOf(
            Student(1, "Abhishek", 101),
            Student(2, "Namita", 102),
            Student(3, "Amisha", 103)
        )
    }
}

3. Presentation Layer

// StudentViewModel.kt
package presentation

import androidx.lifecycle.ViewModel
import domain.GetStudentsUseCase
import domain.Student

class StudentViewModel(
    private val getStudentsUseCase: GetStudentsUseCase
) : ViewModel() {

    fun loadStudents(): List<Student> {
        return getStudentsUseCase()
    }
}

// MainActivity.kt (Using Jetpack Compose for simplicity)
package presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import data.FakeStudentRepository
import domain.GetStudentsUseCase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Dependency Injection manually
        val repository = FakeStudentRepository()
        val useCase = GetStudentsUseCase(repository)
        val viewModel = StudentViewModel(useCase)

        val students = viewModel.loadStudents()

        setContent {
            StudentListScreen(students)
        }
    }
}

@Composable
fun StudentListScreen(students: List<domain.Student>) {
    Column {
        students.forEach { student ->
            Text(text = "${student.name} - Roll: ${student.rollNumber}")
        }
    }
}

@Preview
@Composable
fun PreviewStudentList() {
    StudentListScreen(
        listOf(
            domain.Student(1, "Preview Student", 999)
        )
    )
}




