package com.example.inlinefunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var result = tinhCong(10,{ it })
        Log.d("bbb","$result")
    }
    inline fun tinhCong (a:Int,noinline func:(Int)->Int) = sum(a)
    fun sum(a:Int) = a + 10
}