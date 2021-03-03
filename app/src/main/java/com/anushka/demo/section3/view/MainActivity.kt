package com.anushka.demo.section3.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.demo.R
import com.anushka.demo.databinding.Section3ActivityMainBinding
import com.anushka.demo.section3.viewmodel.MainActivityViewModel

class MainActivity: AppCompatActivity() {
    private lateinit var binding: Section3ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        binding= DataBindingUtil.setContentView(this, R.layout.section3_activity_main)
        viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
        binding.countText.text=viewModel.getCurrentCount().toString()

        binding.button.setOnClickListener {
            binding.countText.text=viewModel.getUpdatedCount().toString()
        }
    }
}