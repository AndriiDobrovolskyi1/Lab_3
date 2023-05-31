package com.andrii.lab_3.data

import com.andrii.lab_3.network.ApiClient

object HomeRepository {
    suspend fun fetchCharacters(page:Int):List<Character>{
        try {
            val response = ApiClient.apiService.fetchCharacters(page.toString())
            return response.results
        } catch(e:Exception){
            throw e
        }
    }
}