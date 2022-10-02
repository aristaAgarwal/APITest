package com.example.firstapp.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firstapp.api.RetrofitCall
import com.example.firstapp.model.ProductsListDO

class viewModel(): ViewModel() {

    private var api = RetrofitCall().service
    private val _apiCaller = MutableLiveData<ProductsListDO>()
    val apiCaller: LiveData<ProductsListDO>
    get() = _apiCaller

    fun getProducts(){
        try{
            _apiCaller.value = api.listProducts()
            Log.e("ViewModel",_apiCaller.value.toString())
        }
        catch (ex: Exception){
            Log.e("ViewModel","Catch mai hai abhi")
        }
    }
}