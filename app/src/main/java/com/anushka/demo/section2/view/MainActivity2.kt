package com.anushka.demo.section2.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.anushka.demo.R
import com.anushka.demo.databinding.Section2ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: Section2ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.section2_activity_main)

        binding.intentButton1.setOnClickListener {
            startActivity(Intent(this, SecondActivity2::class.java))
        }
        binding.submitButton.setOnClickListener {
            displayGreeting()
        }
    }

    private fun displayGreeting() {
        binding.apply {
            if (progressBar.visibility == View.GONE) {
                progressBar.visibility = View.VISIBLE
                submitButton.text = "Stop"
            } else {
                progressBar.visibility = View.GONE
                submitButton.text = "Start"
            }
            greetingTextView.text = "Hello! " + nameEditText.text
        }
    }

}

