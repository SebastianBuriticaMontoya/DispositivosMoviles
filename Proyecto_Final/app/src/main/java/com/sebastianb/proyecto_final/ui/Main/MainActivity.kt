package com.sebastianb.proyecto_final.ui.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.sebastianb.proyecto_final.R
import com.sebastianb.proyecto_final.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var correo_enviado = " "
    var contrasena_enviada = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dato_recibido = intent.extras
         correo_enviado = dato_recibido?.getString("correo").toString()
         contrasena_enviada = dato_recibido?.getString("contrasena").toString()


        text_correo_main.text = correo_enviado.toString()
        text_contrasena_main.text = contrasena_enviada.toString()

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("correo", correo_enviado)
        intent.putExtra("contrasena", contrasena_enviada)
        startActivity(intent)
        finish()
        return super.onOptionsItemSelected(item)
    }
}