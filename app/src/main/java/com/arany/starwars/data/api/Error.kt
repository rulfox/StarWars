package com.arany.starwars.data.api

import okhttp3.ResponseBody

data class Error(
    val errorBody: ResponseBody?,
    val exception: Exception?
)