package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.v(MainActivity::class.java.name,"Este es un Log v")
        Log.d(MainActivity::class.java.name,"Este es un Log d de debugger")
        Log.i(MainActivity::class.java.name,"Este es un Log i de información")
        Log.w(MainActivity::class.java.name,"Este es un Log w de warning")
        Log.e(MainActivity::class.java.name,"Este es un Log e de error")
        
    }
}