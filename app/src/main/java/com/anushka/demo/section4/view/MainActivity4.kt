package com.anushka.demo.section4.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.anushka.demo.R
import com.anushka.demo.databinding.Section4ActivityMainBinding
import com.anushka.demo.section4.viewmodel.MainActivity4ViewModel
import com.anushka.demo.section4.viewmodel.MainActivity4ViewModelFactory

class MainActivity4: AppCompatActivity() {
    private lateinit var binding: Section4ActivityMainBinding
    private lateinit var viewModel: MainActivity4ViewModel
    private lateinit var viewModelFactory: MainActivity4ViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.section4_activity_main)
        viewModelFactory = MainActivity4ViewModelFactory(125)
        viewModel = ViewModelProvider(this,viewModelFactory).get(MainActivity4ViewModel::class.java)

        viewModel.totalData.observe(this, Observer {
            binding.resultTextView.text = it.toString()
        })

        binding.insertButton.setOnClickListener {
            viewModel.setTotal(binding.inputEditText.text.toString().toInt())
        }
    }
}