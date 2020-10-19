package com.sebastianb.resistencias

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultado=0
        var b1=0
        var b2=0
        var b3=0
        var b4=0.0

        //Primer banda

        b1_cafe.setOnClickListener {
            b1=10
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.sienna)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }

        b1_rojo.setOnClickListener {
            b1=20
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.red)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_naranja.setOnClickListener {
            b1=30
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.orange)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_amarillo.setOnClickListener {
            b1=40
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.yellow)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_verde.setOnClickListener {
            b1=50
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.lime)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_azul.setOnClickListener {
            b1=60
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.blue)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_violeta.setOnClickListener {
            b1=70
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.purple)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_gris.setOnClickListener {
            b1=80
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.gray)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b1_blanco.setOnClickListener {
            b1=90
            resultado= (b1+b2)*b3
            banda1.setBackgroundResource(R.color.white)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }


        //Segunda banda

        b2_negro.setOnClickListener {
            b2=0
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.black)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b2_cafe.setOnClickListener {
            b2=1
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.sienna)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }

        b2_rojo.setOnClickListener {
            b2=2
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.red)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_naranja.setOnClickListener {
            b2=3
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.orange)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_amarillo.setOnClickListener {
            b2=4
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.yellow)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_verde.setOnClickListener {
            b2=5
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.lime)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_azul.setOnClickListener {
            b2=6
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.blue)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_violeta.setOnClickListener {
            b2=7
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.purple)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_gris.setOnClickListener {
            b2=8
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.gray)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }
        b2_blanco.setOnClickListener {
            b2=9
            resultado= (b1+b2)*b3
            banda2.setBackgroundResource(R.color.white)
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"

        }

        //Tercera banda

        b3_negro.setOnClickListener {
            b3=1
            banda3.setBackgroundResource(R.color.black)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_cafe.setOnClickListener {
            b3=10
            banda3.setBackgroundResource(R.color.sienna)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }

        b3_rojo.setOnClickListener {
            b3=100
            banda3.setBackgroundResource(R.color.red)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_naranja.setOnClickListener {
            b3=1000
            banda3.setBackgroundResource(R.color.orange)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_amarillo.setOnClickListener {
            b3=10000
            banda3.setBackgroundResource(R.color.yellow)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_verde.setOnClickListener {
            b3=100000
            banda3.setBackgroundResource(R.color.lime)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_azul.setOnClickListener {
            b3=1000000
            banda3.setBackgroundResource(R.color.blue)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_violeta.setOnClickListener {
            b3=10000000
            banda3.setBackgroundResource(R.color.purple)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_gris.setOnClickListener {
            b3=100000000
            banda3.setBackgroundResource(R.color.gray)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }
        b3_blanco.setOnClickListener {
            b3=1000000000
            banda3.setBackgroundResource(R.color.white)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"
        }

        b4_cafe.setOnClickListener {
            b4=1.0
            banda4.setBackgroundResource(R.color.sienna)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }

        b4_rojo.setOnClickListener {
            b4=2.0
            banda4.setBackgroundResource(R.color.red)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }

        b4_verde.setOnClickListener {
            b4=0.5
            banda4.setBackgroundResource(R.color.lime)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b4_azul.setOnClickListener {
            b4=0.25
            banda4.setBackgroundResource(R.color.blue)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b4_violeta.setOnClickListener {
            b4=0.1
            banda4.setBackgroundResource(R.color.purple)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b4_gris.setOnClickListener {
            b4=0.05
            banda4.setBackgroundResource(R.color.gray)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b4_dorado.setOnClickListener {
            b4=5.0
            banda4.setBackgroundResource(R.color.gold)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
        b4_plateado.setOnClickListener {
            b4=10.0
            banda4.setBackgroundResource(R.color.silver)
            resultado= (b1+b2)*b3
            tv_resultado.text= resultado.toString()+" "+"Ω"+" "+"±"+" "+b4+"%"
        }
    }
}