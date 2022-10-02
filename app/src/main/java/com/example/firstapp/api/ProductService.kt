package com.example.firstapp.api

import com.example.firstapp.model.ProductsListDO
import retrofit2.Call
import retrofit2.http.GET

interface ProductService {
    @GET()
    fun listProducts(): ProductsListDO
}