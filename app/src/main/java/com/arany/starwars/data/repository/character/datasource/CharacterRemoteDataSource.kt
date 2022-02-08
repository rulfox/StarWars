package com.arany.starwars.data.repository.character.datasource

import com.arany.starwars.data.model.character.CharacterWrapper
import retrofit2.Response

interface CharacterRemoteDataSource {
    suspend fun getCharacters(searchQuery: String): Response<CharacterWrapper>
}