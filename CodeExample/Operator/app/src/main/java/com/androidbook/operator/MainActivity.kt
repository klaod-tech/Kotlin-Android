package com.androidbook.operator

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var x: Int = 4
        var y: Int = 2

        Log.d("코틀린 : 산술 연산자 ","x + y = " +  (x + y))
        Log.d("코틀린 : 산술 연산자 ","x - y = " +  (x - y))
        Log.d("코틀린 : 산술 연산자 ","x / y = " +  (x / y))
        Log.d("코틀린 : 산술 연산자 ","x * y = " +  (x * y))
        Log.d("코틀린 : 산술 연산자 ","x % y = " +  (x % y))

        /*
        var x: Int = 4
        var y: Int = 2

        Log.d("코틀린 : 비교 연산자 ","x > y = " +  (x > y))
        Log.d("코틀린 : 비교 연산자 ","x < y = " +  (x < y))
        Log.d("코틀린 : 비교 연산자 ","x >= y = " +  (x >= y))
        Log.d("코틀린 : 비교 연산자 ","x <= y = " +  (x <= y))
        Log.d("코틀린 : 비교 연산자 ","x == y = " +  (x == y))
        Log.d("코틀린 : 비교 연산자 ","x != y = " +  (x != y))
        */

        /*
        var x: Int = 5
        var y: Int = 10

        y += x
        Log.d("코틀린 : 할당 연산자 ","y += x => y = " + y )

        y -= x
        Log.d("코틀린 : 할당 연산자 ","y -= x => y = " +  y)

        y *= x
        Log.d("코틀린 : 할당 연산자 ","y += x => y = " +  y)

        y /= x
        Log.d("코틀린 : 할당 연산자 ","y *= x => y = " +  y)

        y %= x
        Log.d("코틀린 : 할당 연산자 ","y %= x => y = " +  y)
        */

        /*
        var x: Int = 1
        Log.d("코틀린 : 증감 연산자 ","++x = " +  (++x))
        Log.d("코틀린 : 증감 연산자 ","--x = " +  (--x))
        */

        /*
        var x: Boolean = true
        var y: Boolean = false
        Log.d("코틀린 : 논리 연산자 ","x && y = " +  (x && y))
        Log.d("코틀린 : 논리 연산자 ","x || y = " +  (x || y))
        Log.d("코틀린 : 논리 연산자 ","!y = " +  (!y))
        */
    }
}
