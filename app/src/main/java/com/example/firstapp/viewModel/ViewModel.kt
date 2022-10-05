package com.example.firstapp.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.firstapp.api.RestApiService
import com.example.firstapp.model.ProductsListDO
import kotlinx.coroutines.launch

class ViewModel(): ViewModel() {

    val api = RestApiService().productsApi
    private val _apiCaller = MutableLiveData<ProductsListDO>()
    val apiCaller: LiveData<ProductsListDO>
        get() = _apiCaller

    fun getProducts(){
        viewModelScope.launch {
            val result = api.listProducts()
            _apiCaller.postValue(result.body())
        }
    }
}