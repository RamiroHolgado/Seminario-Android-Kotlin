package com.example.practica1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts

class ej19Contador : AppCompatActivity() {
    lateinit var contador: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ej19)
        contador = findViewById<TextView>(R.id.contador)
    }

    var getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result ->
        if (result.resultCode == RESULT_OK) {
            if (result.data?.getBooleanExtra("error", false) == true) {
                Toast.makeText(this, "error", Toast.LENGTH_SHORT).show()
            }
            contador.setText(result.data?.getStringExtra("contador"))
        }
    }


    fun operaciones(v: View) {
        val i = Intent(this, ej19Operaciones::class.java)
        i.putExtra("contador", contador.text.toString().toInt())
        getResult.launch(i)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("contador", contador.text.toString().toInt())
    }

    var contSave = 0;
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        contSave = savedInstanceState.getInt("contador")
        contador.setText(contSave.toString())
    }
}