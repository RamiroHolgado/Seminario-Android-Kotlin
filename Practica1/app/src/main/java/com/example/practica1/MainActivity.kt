package com.example.practica1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBtnClick(v: View) {
        val i = Intent(this, NuevaActivity2::class.java)
        i.putExtra("msg", "ANDROID")
        startActivity(i)

    }

    fun abrirWeb(v: View) {
        val i2 = Intent()
        i2.action = Intent.ACTION_VIEW;
        i2.data = Uri.parse("https://google.com")
        startActivity(i2)
    }

    fun ej18c(v: View) {
        val i = Intent(this, ej18c::class.java)
        startActivity(i)
    }

    fun ej19(v: View) {
        val i = Intent(this, ej19Contador::class.java)
        startActivity(i)
    }

    fun ej23(v: View) {
        val i = Intent(this, LifeCycleActivity::class.java)
        startActivity(i)
    }

    fun ej25(v: View) {
        val i = Intent(this, ej25main::class.java)
        startActivity(i)
    }
}