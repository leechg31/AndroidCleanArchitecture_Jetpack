package com.anushka.demo.section3.viewmodel

import androidx.lifecycle.ViewModel

class ThirdActivity3ViewModel(startingTotal: Int): ViewModel() {
    private var total=0
    init {
        total = startingTotal
    }

    fun getTotal(): Int {
        return total
    }
    fun setTotal(input: Int) {
        total+=input
    }
}