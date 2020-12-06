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

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.punchthrough.blestarterappandroid.R
import org.jetbrains.anko.imageResource

class RoomItemLayout : AppCompatActivity() {

    var FLAG_PINNED_BUTTON = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_item_layout)

        val button_pinned: ImageView = findViewById<ImageView>(R.id.pinned_room)
        button_pinned.setOnClickListener{
            println("ENTREI NO CLICK")
            button_pinned.setColorFilter(resources.getColor(R.color.colorGolden))
        }

    }
}