package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.example.firstapp.model.ProductsListDO
import com.example.firstapp.viewModel.ViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<ViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.getProducts()
        viewModel.apiCaller.observe(
            this
        ) { data ->
            if (data is ProductsListDO) {

                data.products.forEach{

                    Log.e("mainActivity", it.toString())
                }
            }
        }
    }
}