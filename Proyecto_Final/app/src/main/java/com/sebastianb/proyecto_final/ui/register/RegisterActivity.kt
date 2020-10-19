package com.sebastianb.proyecto_final.ui.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sebastianb.proyecto_final.R
import com.sebastianb.proyecto_final.ui.Main.MainActivity
import com.sebastianb.proyecto_final.ui.login.LoginActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_login.boton_registrar
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

  var correo = " "
  var contrasena = " "

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        boton_registrar.setOnClickListener(){
            var nombre = edit_nombre.text.toString()
            var cedula = edit_cedula.text.toString()
            var contracontra = edit_repe_contra.text.toString()
            var telefono = edit_telefono.text.toString()
            correo = edit_correo_register.text.toString()
            contrasena = edit_contrasena_register.text.toString()

            if (contrasena.length<6){
                Toast.makeText(this, "Las contraseña es muy corta", Toast.LENGTH_SHORT).show()
            }
            else{
                if (contrasena!=contracontra){
                    Toast.makeText(this, "Las contraseñas no coinciden", Toast.LENGTH_SHORT).show()
                }
                else{
                    if (nombre.isEmpty() || cedula.isEmpty() || contracontra.isEmpty() || telefono.isEmpty() || correo.isEmpty() || contrasena.isEmpty()){
                        Toast.makeText(this, "Los campos no pueden estar vacios", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        goTologinActivity()
                    }
                }
            }
        }
    }

    private fun goTologinActivity() {
      val intent = Intent(this, LoginActivity::class.java)
        intent.putExtra("correo", correo)
        intent.putExtra("contrasena", contrasena)
        startActivity(intent)
        finish()
    }
}

