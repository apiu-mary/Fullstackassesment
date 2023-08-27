package com.apiu.contactapp_assessment.model




data class FormData(
    val name: String,
    val email: String,
    val subject: String,
    val message: String
)

data class ApiResponse(
    val message: String
)

