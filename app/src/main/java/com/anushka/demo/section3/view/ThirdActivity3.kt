package com.anushka.demo.section3.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.demo.R
import com.anushka.demo.databinding.Section3ActivityThirdBinding
import com.anushka.demo.section3.viewmodel.ThirdActivity3ViewModel
import com.anushka.demo.section3.viewmodel.ThirdActivity3ViewModelFactory

class ThirdActivity3 : AppCompatActivity() {
    private lateinit var binding: Section3ActivityThirdBinding
    private lateinit var viewModel: ThirdActivity3ViewModel
    private lateinit var viewModelFactory: ThirdActivity3ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.section3_activity_third)
        viewModelFactory = ThirdActivity3ViewModelFactory(125)
        viewModel = ViewModelProvider(this, viewModelFactory).get(ThirdActivity3ViewModel::class.java)

        binding.resultTextView2.text = viewModel.getTotal().toString()
        binding.insertButton2.setOnClickListener {
            viewModel.setTotal(binding.inputEditText2.text.toString().toInt())
            binding.resultTextView2.text = viewModel.getTotal().toString()
        }
    }
}