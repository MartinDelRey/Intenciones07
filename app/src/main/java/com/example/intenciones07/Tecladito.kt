package com.example.intenciones07

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class Tecladito : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tecladito)
        lateinit var numeros: TextView

        val btn1: Button = findViewById(R.id.btnNum1)
        val btn2: Button = findViewById(R.id.btnNum2)
        val btn3: Button = findViewById(R.id.btnNum3)
        val btn4: Button = findViewById(R.id.btnNum4)
        val btnEliminar: Button = findViewById(R.id.btnEliminar)
        val btnLimpiar: Button = findViewById(R.id.btnLimpiar)
         numeros = findViewById(R.id.txtNumeros)


        btn1.setOnClickListener {
            numeros.text = numeros.text.toString() + "1"

        }
        btn2.setOnClickListener {
            numeros.text = numeros.text.toString() + "2"

        }
        btn3.setOnClickListener {
            numeros.text = numeros.text.toString() + "3"

        }
        btn4.setOnClickListener {
            numeros.text = numeros.text.toString() + "4"

        }
        btnEliminar.setOnClickListener {
            val filaactual = numeros.text.toString()
            if (filaactual.isNotEmpty()) {
                numeros.text = filaactual.substring(0, filaactual.length - 1)
            }
        }
        btnLimpiar.setOnClickListener {
            numeros.text = ""

        }

    }
}