package com.sebastianb.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    private var operacion: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_0.setOnClickListener { numeropresionado( "0") }
        boton_1.setOnClickListener { numeropresionado( "1") }
        boton_2.setOnClickListener { numeropresionado( "2") }
        boton_3.setOnClickListener { numeropresionado( "3") }
        boton_4.setOnClickListener { numeropresionado( "4") }
        boton_5.setOnClickListener { numeropresionado( "5") }
        boton_6.setOnClickListener { numeropresionado( "6") }
        boton_7.setOnClickListener { numeropresionado( "7") }
        boton_8.setOnClickListener { numeropresionado( "8") }
        boton_9.setOnClickListener { numeropresionado( "9") }

        boton_mas.setOnClickListener { operacionpresionada(SUMA) }
        boton_menos.setOnClickListener { operacionpresionada(RESTA) }
        boton_por.setOnClickListener { operacionpresionada(MULTIPLICACION) }
        boton_division.setOnClickListener { operacionpresionada(DIVISION) }

        boton_borrar.setOnClickListener {
            num1 = 0.0
            num2 = 0.0
            texto_resultado.text = "0"
            operacion = NO_OPERACION
        }

        boton_igual.setOnClickListener {
            var resultado = when(operacion){
                SUMA-> num1+num2
                RESTA-> num1-num2
                MULTIPLICACION-> num1*num2
                DIVISION-> num1/num2
                else -> 0
            }
            texto_resultado.text = resultado.toString()
        }
    }
    private fun numeropresionado(digito: String) {
        texto_resultado.text = "${texto_resultado.text}$digito"
        if (operacion == NO_OPERACION){
            num1=texto_resultado.text.toString().toDouble()
        }
        else{
            num2=texto_resultado.text.toString().toDouble()
        }
    }
    private fun operacionpresionada(operacion: Int){
        this.operacion = operacion
        texto_resultado.text= "0"
    }

    companion object{
        const val SUMA = 1
        const val RESTA = 2
        const val MULTIPLICACION = 3
        const val DIVISION = 4
        const val NO_OPERACION = 0

    }
}