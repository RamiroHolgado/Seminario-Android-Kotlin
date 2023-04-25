package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class ejercicio12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio12)

        val button = findViewById<Button>(R.id.btn1)
        val texto = findViewById<TextView>(R.id.tw)

        button.setOnClickListener() {
            val random = Random().nextInt(6) + 1
            texto.text = random.toString()
        }
    }


}