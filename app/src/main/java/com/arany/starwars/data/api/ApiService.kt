package com.arany.starwars.data.api

import com.arany.starwars.data.model.character.CharacterWrapper
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("people")
    suspend fun getCharacters(@Query("search") searchQuery: String): Response<CharacterWrapper>
}