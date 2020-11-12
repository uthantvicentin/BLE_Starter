package com.punchthrough.blestarterappandroid.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.punchthrough.blestarterappandroid.MainActivity
import com.punchthrough.blestarterappandroid.R

class ScreenLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_login)
<<<<<<< HEAD
=======

        val buttonContinue: ImageView = findViewById<ImageView>(R.id.buttonContinue)
        buttonContinue.setOnClickListener {
            val intent = Intent(this@ScreenLoginActivity, MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
        }
>>>>>>> remotes/origin/dev
    }
}