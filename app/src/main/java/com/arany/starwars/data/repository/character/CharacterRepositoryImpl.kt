package com.arany.starwars.data.repository.character

import com.arany.starwars.data.api.Error
import com.arany.starwars.data.api.Resource
import com.arany.starwars.data.model.character.Character
import com.arany.starwars.data.repository.character.datasource.CharacterRemoteDataSource
import com.arany.starwars.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(private val characterRemoteDataSource: CharacterRemoteDataSource) : CharacterRepository {
    override suspend fun searchCharacter(searchQuery: String): Resource<List<Character>> {
        return try {
            val response = characterRemoteDataSource.getCharacters(searchQuery)
            val characterWrapper = response.body()
            if (response.isSuccessful) {
                Resource.success(characterWrapper?.results ?: arrayListOf())
            } else {
                Resource.error(response.code(), "Please try again later", Error())
            }
        }catch (e: Exception){
            Resource.error(0, "Please try again later", Error(exception = e))
        }
    }
}