package com.anushka.demo.section3.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.demo.R
import com.anushka.demo.databinding.Section3ActivityMainBinding
import com.anushka.demo.section3.viewmodel.MainActivity3ViewModel


class MainActivity3: AppCompatActivity() {
    private lateinit var binding: Section3ActivityMainBinding
    private lateinit var viewModel: MainActivity3ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this, R.layout.section3_activity_main)
        viewModel=ViewModelProvider(this).get(MainActivity3ViewModel::class.java)

        binding.countText.text=viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener {
            binding.countText.text=viewModel.getUpdatedCount().toString()
        }
        binding.intentButton3.setOnClickListener {
            startActivity(Intent(this, SecondActivity3::class.java))
        }
    }
}