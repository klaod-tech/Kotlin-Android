package com.androidbook.loopcontrol

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

        for (i in 1..5) {
            Log.d("코틀린 : for 반복문 ", "반복 변수" + i)
        }

        /*
        for (i in 5 downTo 1) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
        }
        */

        /*
        for (i in 5 downTo 1 step 2) {
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
        }
        */

        /*
        var numbers = arrayOf(1, 2, 3, 4, 5)
        for (i in numbers){     // i in [1, 2, 3, 4, 5]와 같은 의미
            if(i % 2 == 1){
                Log.d("코틀린 : for 반복문 ", "반복 변수 : " + i)
            }
        }
        */

        /*
        var numbers = arrayOf(1, 2, 3, 4, 5)
        for (i in numbers.indices) {        // i in 0..4와 같은 의미
            Log.d("코틀린 : for 반복문 ", "반복 변수 : " + numbers[i])
        }
        */

        /*
        var i = 0;
        while (i <= 5) {
            Log.d("코틀린 : while 반복문 ", "반복 변수 : " + i)
            i++
        }
        */
    }
}
