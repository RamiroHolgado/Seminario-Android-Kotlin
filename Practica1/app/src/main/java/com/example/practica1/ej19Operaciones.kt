package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.TextureView
import android.view.View
import android.widget.TextView

class ej19Operaciones : AppCompatActivity() {
    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej19_operaciones)
        contador = intent.extras?.getInt("contador")!!
    }

    fun incrementar(v: View) {

        contador++

        val intent = Intent()
        intent.putExtra("contador", contador.toString())
        setResult(RESULT_OK, intent)
        this.finish()
    }

    fun decrementar(v: View) {
        val intent = Intent()

        if (contador !== 0) {
            contador = contador!! - 1
            intent.putExtra("error", false)
        } else
            intent.putExtra("error", true)

        intent.putExtra("contador", contador.toString())
        setResult(RESULT_OK, intent)
        this.finish()
    }

    fun cancelar(v: View) {
        this.finish()
    }

}


