package com.apiu.contactapp_assessment.Api





import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("http://127.0.0.1:8000/api/submit/form/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun <T> buildClient(apiInterface: Class<T>): T {
        return retrofit.create(apiInterface)
    }

    fun <T> buildPostClient(postApiInterface: Class<T>): T {
        val postRetrofit = Retrofit.Builder()
            .baseUrl("http://127.0.0.1:8000/api/submit/form/") // Replace with your POST API base URL
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return postRetrofit.create(postApiInterface)
    }

}
