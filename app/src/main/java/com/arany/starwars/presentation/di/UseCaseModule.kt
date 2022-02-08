package com.arany.starwars.presentation.di

import com.arany.starwars.domain.repository.CharacterRepository
import com.arany.starwars.domain.usecase.CharacterSearchUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    @Singleton
    fun provideCharacterSearchUseCase(characterRepository: CharacterRepository): CharacterSearchUseCase{
        return CharacterSearchUseCase(characterRepository)
    }
}