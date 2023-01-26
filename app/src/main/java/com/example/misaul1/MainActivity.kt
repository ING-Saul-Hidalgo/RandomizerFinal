package com.example.misaul1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1 = findViewById<Button>(R.id.button1)
        val btn2 = findViewById<Button>(R.id.buttonx)

        btn1.setOnClickListener{
            startActivity(Intent(
                this,
                MainActivity2::class.java))
        }
        btn2.setOnClickListener{
            startActivity(Intent(
                this,
               MainActivity3 ::class.java))
        }
    }
}