package com.anushka.demo.section4.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MainActivity4ViewModelFactory(private val startingTotal : Int):  ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainActivity4ViewModel::class.java)){
            return MainActivity4ViewModel(startingTotal) as T
        }
        throw IllegalArgumentException("Unknown View Model Class")
    }
}