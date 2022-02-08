package com.arany.starwars.domain.repository

import com.arany.starwars.data.api.Resource
import com.arany.starwars.data.model.character.Character

interface CharacterRepository {
    suspend fun searchCharacter(searchQuery: String): Resource<List<Character>>
}