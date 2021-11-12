package id.icena.todoapp.domain.common

import java.io.File


// created by jpistomo
// date 11/11/21

sealed interface Error

// io error
sealed class IOError: Error

// network error
sealed class NetworkError: Error

data class ReadFileError(val file: File): IOError()

data class ErrorMessage(
    val code: Int,
    val message: String
)