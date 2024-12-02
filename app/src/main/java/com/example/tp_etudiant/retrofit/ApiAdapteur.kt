package com.example.tp_etudiant.retrofit

import com.michael.rv_2024.retrofit.ApiClient
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiAdapteur { //singleton
    private const val BASE_URL="https://run.mocky.io/v3/"

    val apiClient: ApiClient =Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create()
}