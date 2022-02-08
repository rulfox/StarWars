package com.arany.starwars.presentation.di

import com.arany.starwars.data.api.ApiService
import com.arany.starwars.data.repository.character.CharacterRepositoryImpl
import com.arany.starwars.data.repository.character.datasource.CharacterRemoteDataSource
import com.arany.starwars.data.repository.character.datasourceimpl.CharacterRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataSourceModule {
    @Provides
    @Singleton
    fun providesCharacterRemoteDataSource(apiService: ApiService): CharacterRemoteDataSource{
        return CharacterRemoteDataSourceImpl(apiService)
    }
}