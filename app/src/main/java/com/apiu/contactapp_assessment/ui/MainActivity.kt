package com.apiu.contactapp_assessment.ui

import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.apiu.contactapp_assessment.R

import com.apiu.contactapp_assessment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        onResume()

    }
    override fun onResume() {
        super.onResume()
        binding.btnsubmit.setOnClickListener {
            startActivity(Intent(this, Homepage::class.java))
            validateLogin()
        }


    }
    fun validateLogin(){
        val name = binding.etname.text.toString()
        val email = binding.etemail.text.toString()
        val message=binding.etmessage.text.toString()
        var error = false


        if (name.isBlank()) {
            binding.etname.error =getString(R.string.name_is_required)
            error = true

        }


        if (email.isBlank()) {
            binding.etemail.error =getString(R.string.email_is_required)
            error = true

        }
        if (message.isBlank()) {
            binding.etmessage.error =getString(R.string.message_is_required)
            error = true

        }

        if (!error){
            Toast.makeText(this, "login successful" , Toast.LENGTH_LONG).show()
        }


    }
}

