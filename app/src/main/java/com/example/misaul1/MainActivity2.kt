package com.example.misaul1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity2 : AppCompatActivity() {

    lateinit var  buttonRegresar : Button
    lateinit var  imgv : ImageView
    lateinit var  button: Button

    private val img: IntArray = intArrayOf(R.drawable.alea_1,R.drawable.alea_2,R.drawable.alea_3,R
        .drawable.alea_4,R.drawable.alea_5,R.drawable.alea_6)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imgv = findViewById(R.id.imageView)
        button = findViewById(R.id.buttondos)

        button.setOnClickListener{
            val random = kotlin.random.Random
            imgv.setImageResource(img[random.nextInt(img.size)])
        }

        buttonRegresar = findViewById(R.id.buttonR1)
        buttonRegresar.setOnClickListener{
            finish()

        }

    }
}