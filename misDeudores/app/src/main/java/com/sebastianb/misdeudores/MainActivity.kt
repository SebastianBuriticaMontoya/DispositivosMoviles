package com.sebastianb.misdeudores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object{
        private const val EMPTY = ""
        private const val SPACE = " "
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton_enviar.setOnClickListener {

            var nombre = Nombre_edit_text.text.toString()
            var correo = Email_text.text.toString()
            var telefono = editTextPhone.text.toString()
            var contrasena = editTextTextPassword.text.toString()
            var repcontrasena = editTextTextPassword2.text.toString()
            var genero = if(masculino_radiobutton.isChecked) getString(R.string.masculino) else getString(R.string.femenino)

            var pasatiempo = EMPTY

            if(futbol_checkBox.isChecked) pasatiempo += getString(R.string.futbol)+ SPACE
            if(nadar_checkBox.isChecked) pasatiempo += getString(R.string.nadar)+ SPACE
            if (video_checkBox.isChecked) pasatiempo += getString(R.string.videojuegos)

            val ciudad_nacimiento = ciudad_nacimiento_spinner.selectedItem

            respuesta_text_view.text = resources.getString(R.string.respuesta, nombre, correo, telefono, genero,pasatiempo, ciudad_nacimiento)


        }
    }

    override fun onStart() {
        super.onStart()
        Log.d('Método', 'onStart')
    }

    override fun onResume() {
        super.onResume()
    }
}