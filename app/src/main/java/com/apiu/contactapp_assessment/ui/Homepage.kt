package com.apiu.contactapp_assessment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apiu.contactapp_assessment.databinding.ActivityHomepageBinding
import com.apiu.contactapp_assessment.databinding.ActivityMainBinding

class Homepage : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomepageBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}