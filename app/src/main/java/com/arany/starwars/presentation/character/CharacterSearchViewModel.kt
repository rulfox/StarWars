package com.arany.starwars.presentation.character

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.arany.starwars.data.api.Resource
import com.arany.starwars.domain.usecase.CharacterSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CharacterSearchViewModel @Inject constructor(private val characterSearchUseCase: CharacterSearchUseCase): ViewModel() {
    fun searchCharacter(searchQuery: String) = liveData {
        emit(Resource.loading())
        emit(characterSearchUseCase.execute(searchQuery))
    }
}