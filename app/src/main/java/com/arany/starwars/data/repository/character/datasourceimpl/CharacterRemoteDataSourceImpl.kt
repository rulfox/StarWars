package com.arany.starwars.data.repository.character.datasourceimpl

import com.arany.starwars.data.model.character.CharacterWrapper
import com.arany.starwars.data.api.ApiService
import com.arany.starwars.data.repository.character.datasource.CharacterRemoteDataSource
import retrofit2.Response
import javax.inject.Inject

class CharacterRemoteDataSourceImpl @Inject constructor(val apiService: ApiService): CharacterRemoteDataSource {
    override suspend fun getCharacters(searchQuery: String): Response<CharacterWrapper> {
        return apiService.getCharacters(searchQuery)
    }
}