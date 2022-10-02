package com.example.firstapp.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class RetrofitCall {

    companion object {
        const val URL_COUNTRY_API = "https://dummyjson.com/products"

        val retro =  Retrofit.Builder()
            .baseUrl(URL_COUNTRY_API)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }
    val service = retro.create(ProductService::class.java)
}