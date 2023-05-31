package com.andrii.lab_3.network

import com.andrii.lab_3.data.CharacterResponse
import com.google.gson.Gson
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


object ApiClient {
    private val BASE_URL = "https://rickandmortyapi.com/api/"


    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


    val apiService: ApiService = retrofit.create(ApiService::class.java)

}

interface ApiService {
    @GET("character")
    suspend fun fetchCharacters(@Query("page") page:String): CharacterResponse
}