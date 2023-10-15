package com.chhayakant.mykotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class NewActivity : AppCompatActivity(){
   lateinit var etMobileNumber:EditText
   lateinit var btnLogin:Button
   lateinit var txtForgetPassword:TextView
   lateinit var txtRegister:TextView
   lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
        title = "Log in"
        etMobileNumber = findViewById(R.id.etMobileNumber)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgetPassword = findViewById(R.id.txtForgetpassword)
        txtRegister = findViewById(R.id.txtRegister)

        btnLogin.setOnClickListener {
            Toast.makeText(
                this@NewActivity, "login successfully", Toast.LENGTH_LONG
            ).show()
            val intent=Intent(this@NewActivity,MainActivity::class.java)
            startActivity(intent)
        }

        }
    }




