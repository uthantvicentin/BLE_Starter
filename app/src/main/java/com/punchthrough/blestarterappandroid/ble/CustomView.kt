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

package com.punchthrough.blestarterappandroid.ble

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View

class CustomView : View {
    private var firstPaintSquare: Paint? = null
    private var secondPaintSquare: Paint? = null
    private var bounds: RectF? = null
    private val firstxPos = FloatArray(360)
    private val firstyPos = FloatArray(360)
    private val secondxPos = FloatArray(360)
    private val secondyPos = FloatArray(360)

    constructor(context: Context?) : super(context) {
        init(null)
    }

    constructor(context: Context?, attrs: AttributeSet?) : super(
        context,
        attrs
    ) {
        init(attrs)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int
    ) : super(context, attrs, defStyleAttr) {
        init(attrs)
    }

    constructor(
        context: Context?,
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ) : super(context, attrs, defStyleAttr, defStyleRes) {
        init(attrs)
    }

    private fun init(set: AttributeSet?) {
        firstPaintSquare = Paint(Paint.ANTI_ALIAS_FLAG)
        firstPaintSquare!!.strokeWidth = 30F
        secondPaintSquare = Paint(Paint.ANTI_ALIAS_FLAG)
        secondPaintSquare!!.strokeWidth = 30F
        if (set == null) return
        firstPaintSquare!!.color = Color.BLUE
        secondPaintSquare!!.color = Color.BLUE
    }

    override fun onDraw(canvas: Canvas) {
        bounds = RectF(canvas.clipBounds)
        var angleDeg = 0
        val radius = 400f
        val firstBeaconY = 0
        val firstBeaconX = 0
        val secondBeaconY = canvas.height - 10
        val secondBeaconX = canvas.width - 10
        while (angleDeg != 360) {
            firstxPos[angleDeg] =
                radius * Math.cos(Math.toRadians(angleDeg.toDouble())).toFloat() + firstBeaconX
            firstyPos[angleDeg] =
                radius * Math.sin(Math.toRadians(angleDeg.toDouble())).toFloat() + firstBeaconY
            secondxPos[angleDeg] =
                radius * Math.cos(Math.toRadians(angleDeg.toDouble())).toFloat() + secondBeaconX
            secondyPos[angleDeg] =
                radius * Math.sin(Math.toRadians(angleDeg.toDouble())).toFloat() + secondBeaconY
            if (angleDeg > 0) {
                canvas.drawLine(
                    firstxPos[angleDeg - 1],
                    firstyPos[angleDeg - 1],
                    firstxPos[angleDeg],
                    firstyPos[angleDeg],
                    firstPaintSquare!!
                )
                canvas.drawLine(
                    secondxPos[angleDeg - 1],
                    secondyPos[angleDeg - 1],
                    secondxPos[angleDeg],
                    secondyPos[angleDeg],
                    secondPaintSquare!!
                )
            }
            angleDeg++
        }
    }

/*
    fun setPos(x: Float, y: Float) {
        circleX = x
        circleY = y
    }
*/
    companion object {
        private const val SQUARE_SIZE_DEF = 300
    }
}

