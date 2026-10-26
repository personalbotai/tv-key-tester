package com.personalbotai.keytester

import android.app.Activity
import android.os.Bundle
import android.view.KeyEvent
import android.widget.TextView
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout

class MainActivity : Activity() {
    private lateinit var tvCode: TextView
    private lateinit var tvName: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setBackgroundColor(Color.parseColor("#111114"))
            setPadding(50, 50, 50, 50)
        }

        val title = TextView(this).apply {
            text = "REMOTE KEY TESTER"
            textSize = 28f
            setTextColor(Color.YELLOW)
            gravity = Gravity.CENTER
        }

        tvCode = TextView(this).apply {
            text = "KeyCode: -"
            textSize = 36f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
            setPadding(0, 30, 0, 10)
        }

        tvName = TextView(this).apply {
            text = "Tekan tombol apa saja di remote..."
            textSize = 22f
            setTextColor(Color.CYAN)
            gravity = Gravity.CENTER
            setPadding(0, 10, 0, 30)
        }

        val hint = TextView(this).apply {
            text = "Tekan tombol BACK untuk keluar"
            textSize = 14f
            setTextColor(Color.GRAY)
            gravity = Gravity.CENTER
        }

        layout.addView(title)
        layout.addView(tvCode)
        layout.addView(tvName)
        layout.addView(hint)

        setContentView(layout)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        tvCode.text = "KeyCode: $keyCode"
        tvName.text = "Tombol: ${KeyEvent.keyCodeToString(keyCode)}"
        return super.onKeyDown(keyCode, event)
    }
}
