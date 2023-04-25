package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Ejercicio11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio11)

        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        var texto = findViewById<TextView>(R.id.texto)

        fun onClick(view: View) {
            when(view.id) {
                R.id.btn1 -> {
                    texto.setText("UNO")
                }
                R.id.btn2 -> {
                    texto.setText("DOS")
                }
                R.id.btn3 -> {
                    texto.setText("TRES")
                }
            }
        }
        btn1.setOnClickListener { onClick(it) }
        btn2.setOnClickListener { onClick(it) }
        btn3.setOnClickListener { onClick(it) }
    }

}