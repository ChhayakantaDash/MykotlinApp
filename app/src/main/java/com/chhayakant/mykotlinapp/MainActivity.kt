package com.chhayakant.mykotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scrollview_example)
        val toolbar:Toolbar= findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title="                      Activity"
        println("on create called")
    }

    override fun onStart() {
        super.onStart()
        println("on Start called")

    }

    override fun onResume() {
        super.onResume()
        println("on creat called")
    }

    override fun onPause() {
        super.onPause()
        println("on Pause called")
    }

    override fun onStop() {
        super.onStop()
        println("on Stop called")
    }

    override fun onRestart() {
        super.onRestart()
        println("on Restart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("on Destroy called")
    }
}


