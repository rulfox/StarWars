package com.arany.starwars.data.api

import okhttp3.ResponseBody

data class Resource<T>(
    val status: Status,
    val data: T?,
    val message:String?= null,
    val code: Int?= null,
    val error: Error<T>?= null,

){
    companion object{
        fun <T> success(data: T?): Resource<T>{
            return Resource(Status.SUCCESS, data, null)
        }
        fun <T> error(errorCode: Int?, message: String, error: Error<T>): Resource<T>{
            return Resource(Status.ERROR, null, message, errorCode, error)
        }
        fun <T> loading(data:T?=null): Resource<T>{
            return Resource(Status.LOADING, data)
        }
    }
}