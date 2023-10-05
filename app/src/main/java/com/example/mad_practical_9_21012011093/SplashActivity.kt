package com.example.mad_practical_9_21012011093

import android.graphics.drawable.AnimationDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    lateinit var gunilogoanimation: AnimationDrawable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val image3 = findViewById<ImageView>(R.id.logo)
        image3.setBackgroundResource(R.drawable.guni_logo_animation)
        gunilogoanimation= image3.background as AnimationDrawable
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus){
            gunilogoanimation.start()

        }
        else{
            gunilogoanimation.stop()

        }
    }
}