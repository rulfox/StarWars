package com.arany.starwars.data.model.character


import com.google.gson.annotations.SerializedName

data class CharacterWrapper(
    @SerializedName("count")
    val count: Int?,
    @SerializedName("next")
    val next: String?,
    @SerializedName("previous")
    val previous: String?,
    @SerializedName("results")
    val results: List<Character>?
)