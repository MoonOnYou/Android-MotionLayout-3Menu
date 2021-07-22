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
            if (motionLayout?.currentState == R.id.menu2) {
                motionLayout.setTransition(R.id.menu2, R.id.menu1)
            } else if (motionLayout?.currentState == R.id.menu3) {
                motionLayout.setTransition(R.id.menu3, R.id.menu1)
            }
            motionLayout.transitionToEnd()
        }
        findViewById<TextView>(R.id.title2).setOnClickListener {
            if (motionLayout?.currentState == R.id.menu1) {
                motionLayout.setTransition(R.id.menu1, R.id.menu2)
            } else if (motionLayout?.currentState == R.id.menu3) {
                motionLayout.setTransition(R.id.menu3, R.id.menu2)
            }
            motionLayout.transitionToEnd()
        }
        findViewById<TextView>(R.id.title3).setOnClickListener {
            if (motionLayout?.currentState == R.id.menu1) {
                motionLayout.setTransition(R.id.menu1, R.id.menu3)
            } else if (motionLayout?.currentState == R.id.menu2) {
                motionLayout.setTransition(R.id.menu2, R.id.menu3)
            }
            motionLayout.transitionToEnd()
        }
    }
}