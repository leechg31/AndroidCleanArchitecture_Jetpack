package com.anushka.bindingdemo1.section2

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.anushka.bindingdemo1.R
import com.anushka.bindingdemo1.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second)
        binding.student=getStudent()    //  .student는 second xml의 data student임
    }
    private fun getStudent():Student{
        return Student(1,"Alex","alex@gmail.com")
    }
}