/*
 * Copyright 2020 Punch Through Design LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.punchthrough.blestarterappandroid.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.punchthrough.blestarterappandroid.MainActivity
import com.punchthrough.blestarterappandroid.R

class PerfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val buttonPerfil: ImageView = findViewById<ImageView>(R.id.button_perfil)
        buttonPerfil.setImageResource(R.drawable.perfil_verde)

        val textPerfil: TextView = findViewById<TextView>(R.id.text_perfil)
        textPerfil.setTextColor(resources.getColor(R.color.colorButtons) )

        val buttonHome: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_home)
        buttonHome.setOnClickListener {
            val intent = Intent(this@PerfilActivity, HomeActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonRoom: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_room)
        buttonRoom.setOnClickListener {
            val intent = Intent(this@PerfilActivity, RoomActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonRadar: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_radar)
        buttonRadar.setOnClickListener {
            val intent = Intent(this@PerfilActivity, MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }
}