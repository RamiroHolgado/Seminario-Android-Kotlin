package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ej18c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej18c)
    }

    fun cambiarIdioma(v: View) {
        val texto = findViewById<TextView>(R.id.textView)
        if (texto.text == "Español"){
            texto.setText("Ingles")
        } else {
            texto.setText("Español")
        }
    }
}