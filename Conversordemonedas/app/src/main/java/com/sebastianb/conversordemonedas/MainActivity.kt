package com.sebastianb.conversordemonedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val COP= "COP"
        const val Dolar= "Dolar"
        const val Euros= "Euros"
        const val interlineado="\n"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapter = ArrayAdapter.createFromResource(this, R.array.coins,
            android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        sp_coins.adapter = adapter

        bt_convertir.setOnClickListener() {

            val unidad = et_cantidad.text.toString().toInt()
            val unidadf = unidad.toDouble()
            var valor: Double = 0.0




            if (rb_pesos.isChecked) {

                if (sp_coins.selectedItem.toString() == COP ) {

                    valor = unidadf

                }
                if (sp_coins.selectedItem.toString() == Dolar) {

                    valor = unidadf / 3376

                }
                if (sp_coins.selectedItem.toString() == Euros) {

                    valor = unidadf / 3758

                }

            }

            if (rb_dolares.isChecked) {

                if (sp_coins.selectedItem.toString() == COP) {

                    valor = unidadf * 3376

                }
                if (sp_coins.selectedItem.toString() == Dolar) {

                    valor = unidadf

                }
                if (sp_coins.selectedItem.toString() == Euros) {

                    valor = unidadf * 1.12

                }
            }

            if (rb_euros.isChecked) {

                if (sp_coins.selectedItem.toString() == COP) {

                    valor = unidadf * 3727

                }
                if (sp_coins.selectedItem.toString() == Dolar) {

                    valor = unidadf * 1.12

                }
                if (sp_coins.selectedItem.toString() == Euros) {

                    valor = unidadf

                }
            }

            var final=valor.toString()
            tv_resultado.text= final
        }
    }
}