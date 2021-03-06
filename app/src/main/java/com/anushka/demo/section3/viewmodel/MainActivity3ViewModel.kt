package com.anushka.demo.section3.viewmodel

import androidx.lifecycle.ViewModel

class MainActivity3ViewModel: ViewModel() {
    private var count = 0

    fun getCurrentCount():Int{
        return count
    }

    fun getUpdatedCount():Int{
        return ++count
    }
}