package com.arany.starwars.data.api

import okhttp3.ResponseBody

data class Error<T>(
    val errorBody: ResponseBody?= null,
    val exception: Exception?= null
)