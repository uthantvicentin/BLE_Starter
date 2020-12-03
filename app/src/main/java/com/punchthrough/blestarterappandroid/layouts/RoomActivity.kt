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

import RoomViewHolder
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.punchthrough.blestarterappandroid.MainActivity
import com.punchthrough.blestarterappandroid.R
import com.punchthrough.blestarterappandroid.classes.Rooms

class RoomActivity : AppCompatActivity() {
    lateinit var contacts: ArrayList<Rooms>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val buttonRoom: ImageView = findViewById<ImageView>(R.id.button_rooms)
        buttonRoom.setImageResource(R.drawable.salas_verde)

        val textRoom: TextView = findViewById<TextView>(R.id.text_room)
        textRoom.setTextColor(resources.getColor(R.color.colorButtons))

        val buttonHome: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_home)
        buttonHome.setOnClickListener {
            val intent = Intent(this@RoomActivity, HomeActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonRadar: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_radar)
        buttonRadar.setOnClickListener {
            val intent = Intent(this@RoomActivity, MainActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)
        }

        val buttonPerfil: ImageView = findViewById<ImageView>(R.id.rectangle_bottom_perfil)
        buttonPerfil.setOnClickListener {
            val intent = Intent(this@RoomActivity, PerfilActivity::class.java)
            intent.putExtra("key", "Kotlin")
            startActivity(intent)
            this.overridePendingTransition(0, 0)

        }

        // Lookup the recyclerview in activity layout
        val rvContacts = findViewById<View>(R.id.rvContacts) as RecyclerView
        // Initialize contacts
        contacts = Rooms.createContactsList(40)
        // Create adapter passing in the sample user data
        val adapter = RoomViewHolder(contacts)

        // Attach the adapter to the recyclerview to populate items
        rvContacts.adapter = adapter
        // Set layout manager to position the items
        rvContacts.layoutManager = LinearLayoutManager(this)
        // That's all
    }

    override fun onPause() {
        super.onPause()
        overridePendingTransition(0, 0)
    }
}