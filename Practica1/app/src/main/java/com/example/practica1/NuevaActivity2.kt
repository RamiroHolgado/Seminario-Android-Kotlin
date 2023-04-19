package com.example.practica1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class NuevaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nueva2)
        Log.d("APP_DE_PRUEBA", "Este es mi mensaje de debug");
        val msg = intent.extras?.getString("msg")
        Log.d("MENSAJE PASADO COMO PARAMETRO",msg.toString())
    }
}