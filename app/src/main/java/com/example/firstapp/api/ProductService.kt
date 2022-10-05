package com.example.firstapp.api

import com.example.firstapp.model.ProductsListDO
import retrofit2.Response
import retrofit2.http.GET

interface ProductService {
    @GET("products")
    suspend fun listProducts(): Response<ProductsListDO>
}