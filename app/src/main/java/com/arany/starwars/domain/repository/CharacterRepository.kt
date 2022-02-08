package com.arany.starwars.domain.repository

interface CharacterRepository {
    suspend fun searchCharacter(searchQuery: String)
}