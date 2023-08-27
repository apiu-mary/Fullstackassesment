//package com.apiu.contactapp_assessment.Viewmodel
//
//import androidx.lifecycle.MutableLiveData
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.apiu.contactapp_assessment.Repository.Repository
//import com.apiu.contactapp_assessment.model.Product
//import kotlinx.coroutines.launch
//
//class ProductViewmodel:ViewModel() {
//    private val productsRepo=Repository()
//    val productsLiveData=MutableLiveData<List<Product>>()
//    val errLiveData=MutableLiveData<String>()
//    fun createProduct(product: Product) {
//        viewModelScope.launch {
//            val response=
//                productsRepo.createProduct() // Assuming createProduct() is your API call method
//            if (response.isSuccessful) {
//                // Handle successful response if needed
//            } else {
//                errLiveData.postValue(response.errorBody()?.string())
//            }
//        }
//    }
//}
//
//
//
//
//
