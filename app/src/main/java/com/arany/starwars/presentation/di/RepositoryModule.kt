package com.arany.starwars.presentation.di

import com.arany.starwars.data.repository.character.CharacterRepositoryImpl
import com.arany.starwars.data.repository.character.datasource.CharacterRemoteDataSource
import com.arany.starwars.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun providesCharacterRepository(characterRemoteDataSource: CharacterRemoteDataSource): CharacterRepository{
        return CharacterRepositoryImpl(characterRemoteDataSource)
    }
}