package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ej11(v: View) {
        val i = Intent(this, Ejercicio11::class.java)
        startActivity(i)
    }
    fun ej12(v: View) {
        val i = Intent(this, ejercicio12::class.java)
        startActivity(i)
    }

    fun ej13(v: View) {
        val i = Intent(this, ejercicio13::class.java)
        startActivity(i)
    }
}