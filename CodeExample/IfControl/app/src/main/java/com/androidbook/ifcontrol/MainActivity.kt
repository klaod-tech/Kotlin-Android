package com.androidbook.ifcontrol

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

        var num: Int = 3
        if (num > 0) {
            Log.d("코틀린 : if 조건문 ","숫자 "+ num + "은 양수")
        }

        /*
        var num: Int = 10
        if (num % 2 == 0) {
            Log.d("코틀린 : if-else 조건문 ","숫자 "+ num + "은 짝수")
        } else {
            Log.d("코틀린 : if-else 조건문 ","숫자 "+ num + "은 홀수")
        }
        */

        /*
        var num: Int = -10
        var result : String
        if (num > 0) {
            result = "숫자 "+ num + "은 양수"
        } else if (num == 0) {
            result = "숫자 "+ num + "은 0"
        } else {
            result = "숫자 "+ num + "은 음수"
        }
        Log.d("코틀린 : if-else if 조건문 ",result)
        */

        /*
        var num: Int = -10
        var result  : String
        if (num > 0) {
            if (num % 2 == 0) {
                result = "숫자 "+ num + "은 양수이고 짝수."
            } else {
                result  = "숫자 "+ num + "은 양수이고 홀수"
            }
        } else {
            if (num % 2 == 0) {
                result = "숫자 "+ num + "은 음수이고 짝수"
            } else {
                result = "숫자 "+ num + "은 음수이고 홀수"
            }
        }
        Log.d("코틀린 : 중첩 if 조건문 ",result)
        */
    }
}
