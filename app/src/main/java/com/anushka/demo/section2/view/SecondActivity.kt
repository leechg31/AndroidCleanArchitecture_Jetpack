package com.anushka.demo.section2.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.anushka.demo.R
import com.anushka.demo.databinding.Section2ActivitySecondBinding
import com.anushka.demo.section2.data.Student

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: Section2ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.section2_activity_second)
        binding.student = getStudent()    //  .student는 second xml의 data student임
    }

    private fun getStudent(): Student {
        return Student(1, "Alex", "alex@gmail.com")
    }
}