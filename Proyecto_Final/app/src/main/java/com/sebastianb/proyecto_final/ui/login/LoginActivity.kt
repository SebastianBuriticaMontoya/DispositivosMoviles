package com.sebastianb.proyecto_final.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sebastianb.proyecto_final.ui.Main.PrincipalActivity
import com.sebastianb.proyecto_final.R
import com.sebastianb.proyecto_final.ui.register.RegisterActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    var contrasena_de_main = " "
    var correo_de_main = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var datosrecibidos = intent.extras
        val correo_enviado = datosrecibidos?.getString("correo")
        val contrasena_enviada = datosrecibidos?.getString("contrasena")


        boton_iniciar2.setOnClickListener() {

            val contrasena_login = edit_contrasena_login.text.toString()
            val correo_login = edit_correo_login.text.toString()

            if (correo_enviado != correo_login || contrasena_enviada != contrasena_login) {
                Toast.makeText(this, "Correo o contraseña equivocada", Toast.LENGTH_SHORT).show()
            } else {
                goToMainActivity(correo_enviado, contrasena_enviada)
            }
        }

        boton_registrar.setOnClickListener() {
            goToRegisterActivity()
        }
    }


    private fun goToMainActivity(correo_enviado: String, contrasena_enviada: String) {
        val intent = Intent(this, PrincipalActivity::class.java)
        intent.putExtra("correo", correo_enviado)
        intent.putExtra("contrasena", contrasena_enviada)
        startActivity(intent)
        finish()
    }

    fun goToRegisterActivity() {
        val intent = Intent(this, RegisterActivity::class.java)
        startActivity(intent)
    }

}