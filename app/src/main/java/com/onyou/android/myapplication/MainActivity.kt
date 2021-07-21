package com.onyou.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val motionLayout = findViewById<MotionLayout>(R.id.motion_container)

        findViewById<TextView>(R.id.title1).setOnClickListener {
            motionLayout.setTransition(R.id.menu1, R.id.menu2)
        }
        findViewById<TextView>(R.id.title2).setOnClickListener {
            motionLayout.setTransition(R.id.menu2, R.id.menu3)
        }
        findViewById<TextView>(R.id.title3).setOnClickListener {
            motionLayout.setTransition(R.id.menu3, R.id.menu1)
        }
    }
}