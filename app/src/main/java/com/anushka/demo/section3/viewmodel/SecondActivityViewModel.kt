package com.anushka.demo.section3.viewmodel

import androidx.lifecycle.ViewModel

class SecondActivityViewModel:ViewModel() {
    private var total = 0

    fun getTotal(): Int {
        return total
    }

    fun setTotal(input: Int) {
        total+=input
    }
}