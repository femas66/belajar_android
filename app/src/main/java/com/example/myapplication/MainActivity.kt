package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var et_username = findViewById<EditText>(R.id.etUsername)
        var et_password = findViewById<EditText>(R.id.etPassword)
        var btn_login = findViewById<Button>(R.id.btnLogin)

        btn_login.setOnClickListener {
            val username = et_username.text.toString()
            val password = et_password.text.toString()

            val username_benar = "femas"
            val password_benar = "femas12"
//            Toast.makeText(this, "${username} ${password}", Toast.LENGTH_LONG).show()
            if (username == username_benar && password == password_benar) {
                var intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
            }
            else {
                Toast.makeText(this@MainActivity, "Gagal", Toast.LENGTH_SHORT).show()
            }

        }


    }
}