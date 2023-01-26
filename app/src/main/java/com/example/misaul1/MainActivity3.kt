package com.example.misaul1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {

    lateinit var  buttonlejos : Button
    lateinit var  imgv : ImageView
    lateinit var  button: Button

    private val img: IntArray = intArrayOf(R.drawable.cross,R.drawable.face)


    lateinit var  buttonRegresar2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        imgv = findViewById(R.id.imageView2)
        button = findViewById(R.id.buttontres)

        buttonlejos = findViewById(R.id.buttontres)
        buttonlejos.setOnClickListener{
            finish()
        }
    }
}