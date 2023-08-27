package com.apiu.contactapp_assessment.Api

import com.apiu.contactapp_assessment.model.ApiResponse

import com.apiu.contactapp_assessment.model.FormData



import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiInterface {
    @POST("http://127.0.0.1:8000/api/submit/form/") // Adjust the endpoint URL
    suspend fun submitForm(@Body formData: FormData): Response<ApiResponse>
}
