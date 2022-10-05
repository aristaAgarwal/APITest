package com.example.firstapp.api

class RestApiService {
    var productsApi = RetrofitCall.getInstance().create(ProductService::class.java)
}