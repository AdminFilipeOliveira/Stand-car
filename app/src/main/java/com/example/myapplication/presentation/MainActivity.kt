package com.example.myapplication.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    lateinit var preco: EditText
    lateinit var kmPercorrido: EditText
    lateinit var btnCalcular: Button
    lateinit var resultado: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListeneres()
    }

    fun setupView(){
        preco = findViewById(R.id.et_preco_kwh)
        btnCalcular = findViewById(R.id.btn_calcular)
        kmPercorrido = findViewById(R.id.et_km_percorrido)
        resultado = findViewById(R.id.tv_resultado)
    }

    fun setupListeneres() {
        btnCalcular.setOnClickListener {
           // calcular()
            startActivity( Intent(this, CalcularEconomiaActivity::class.java))
        }

    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km
        resultado.text = result.toString()


    }
}
// if (cbBox_1.isChecked) {
//                Log.d("compromisso", "1 fieto")
//            } else {
//                Log.d("compromisso", "1  não fieto")
//
//            }
//
//            if (cbBox_2.isChecked) {
//                Log.d("compromisso", "2 fieto")
//            } else {
//                Log.d("compromisso", "2 não fieto")
//
//            }