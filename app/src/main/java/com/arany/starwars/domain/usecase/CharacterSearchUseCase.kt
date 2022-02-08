package com.arany.starwars.domain.usecase

import com.arany.starwars.domain.repository.CharacterRepository

class CharacterSearchUseCase(private val characterRepository: CharacterRepository) {
    suspend fun execute(searchQuery: String) = characterRepository.searchCharacter(searchQuery)
}