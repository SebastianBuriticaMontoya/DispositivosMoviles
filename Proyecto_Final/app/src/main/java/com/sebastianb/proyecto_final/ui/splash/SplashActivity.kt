package com.sebastianb.proyecto_final.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sebastianb.proyecto_final.R
import com.sebastianb.proyecto_final.ui.login.LoginActivity
import java.util.*
import kotlin.concurrent.timerTask

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val timer = Timer()
        timer.schedule( timerTask {
            goTologinActivity()
        } , 2000
        )
    }

    fun goTologinActivity(){
        var intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}