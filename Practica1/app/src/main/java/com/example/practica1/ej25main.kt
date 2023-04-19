package com.example.practica1

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.time.LocalTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.Date

class ej25main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej25main)
    }

    fun btnHora(v: View) {
        val horaActual = LocalTime.now(ZoneId.of("America/Argentina/Buenos_Aires"))
        Log.d("Hora", horaActual.toString().dropLast(4))
    }

    fun btnFecha(v: View) {
        val fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
        Log.d("fecha ", fechaActual.toString())
        val i = Intent(this, ej25segunda::class.java)
        i.putExtra("fecha", fechaActual)
        startActivity(i)
    }
}