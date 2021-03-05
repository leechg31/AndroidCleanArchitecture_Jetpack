package com.anushka.demo.section3.view

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.anushka.demo.R
import com.anushka.demo.databinding.Section3ActivitySecondBinding
import com.anushka.demo.section3.viewmodel.SecondActivityViewModel

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: Section3ActivitySecondBinding
    private lateinit var viewModel: SecondActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        binding = DataBindingUtil.setContentView(this, R.layout.section3_activity_second)
        viewModel = ViewModelProvider(this).get(SecondActivityViewModel::class.java)

        binding.apply {
            resultTextView.text = viewModel.getTotal().toString()
            insertButton.setOnClickListener() {
                viewModel.setTotal(inputEditText.text.toString().toInt())
                resultTextView.text = viewModel.getTotal().toString()
            }
        }
    }
}