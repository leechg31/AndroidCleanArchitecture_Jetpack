package com.anushka.demo.section3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ThirdActivity3ViewModelFactory(private val startingTotal: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ThirdActivity3ViewModel::class.java)) {
            return ThirdActivity3ViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }

}