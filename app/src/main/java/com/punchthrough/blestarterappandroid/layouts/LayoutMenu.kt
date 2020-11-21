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
import com.punchthrough.blestarterappandroid.MainActivity
import com.punchthrough.blestarterappandroid.R

class LayoutMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val buttonHome: ImageView = findViewById<ImageView>(R.id.button_home)
        buttonHome.setOnClickListener {
            val intent = Intent(this@LayoutMenu, HomeActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonRoom: ImageView = findViewById<ImageView>(R.id.button_rooms)
        buttonRoom.setOnClickListener {
            val intent = Intent(this@LayoutMenu, RoomActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonRadar: ImageView = findViewById<ImageView>(R.id.button_radar)
        buttonRadar.setOnClickListener {
            val intent = Intent(this@LayoutMenu, MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonPerfil: ImageView = findViewById<ImageView>(R.id.button_perfil)
        buttonPerfil.setOnClickListener {
            val intent = Intent(this@LayoutMenu, PerfilActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }
    }
}