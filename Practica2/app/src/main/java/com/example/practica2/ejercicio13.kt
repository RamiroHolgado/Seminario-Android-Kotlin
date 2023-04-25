package com.example.practica2

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class ejercicio13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio13)
        var btnOcultar = findViewById<Button>(R.id.btn1)
        var btnMostrar = findViewById<Button>(R.id.btn2)
        var imagen = findViewById<ImageView>(R.id.image)

        fun onClick(view: View) {
            when(view.id) {
                R.id.btn1 -> {
                    imagen.setVisibility(View.INVISIBLE)
                }
                R.id.btn2 -> {
                    imagen.setVisibility(View.VISIBLE)
                }
            }
        }
        btnOcultar.setOnClickListener { onClick(it) }
        btnMostrar.setOnClickListener { onClick(it) }
    }
}

