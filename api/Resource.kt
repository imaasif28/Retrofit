package com.aasif.posaasif.ui.data.api

import okhttp3.ResponseBody

sealed class Resource<out T>() {
    class SUCCESS<out T>(val data: T) : Resource<T>()

    object LOADING : Resource<Nothing>()

    class FAILURE<T>(
        val isNetworkError: Boolean?,
        val errorCode: Int?,
        val errorBody: ResponseBody?
    ) : Resource<Nothing>()
}
