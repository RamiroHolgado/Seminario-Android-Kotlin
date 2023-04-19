package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ej25segunda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej25segunda)
        var texto = findViewById<TextView>(R.id.texto)
        texto.setText(intent?.getStringExtra("fecha"))
    }
}