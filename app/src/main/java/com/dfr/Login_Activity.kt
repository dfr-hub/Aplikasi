package com.dfr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.dfr.ujikom.R
import com.dfr.ujikom.databinding.ActivityLoginBinding

class Login_Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)
        initButton()
    }

    private fun initButton() {
        binding.btnLogin.setOnClickListener{
            startActivity(Intent(this, List_Food::class.java))
            Toast.makeText(applicationContext, "Anda Berhasil Login", Toast.LENGTH_SHORT).show()
        }

        binding.btnlogin1.setOnClickListener(){
            Toast.makeText(applicationContext, "Anda Harus Login Terlebih Dahulu",Toast.LENGTH_SHORT).show()
        }
        binding.btnRegister.setOnClickListener(){
            Toast.makeText(applicationContext, "Anda Harus Login Terlebih Dahulu", Toast.LENGTH_SHORT).show()
        }
    }
}