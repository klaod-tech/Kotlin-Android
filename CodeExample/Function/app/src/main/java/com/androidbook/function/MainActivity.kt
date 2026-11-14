package com.androidbook.function

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

        var num1 = 3
        var num2 = 5
        var result = mul(num1, num2)
        Log.d("코틀린 : 사용자 정의 함수 ", "$num1 * $num2  =  $result")

        /*//2-28
        var num1 = 3
        var result = mul(num2) //mul() 함수의 두 번째 매개변수 b는 생략되어 기본값인 5가 사용됨
        Log.d("코틀린 : 사용자 정의 함수 ", "$num1 * 5 = $result")
        */

        /*//2-29
        var num1 = 3
        var num2 = 5
        mul(num1, num2)     //반환값을 사용하지 않고 단순 출력만 수행
        */

        /*//2-30
        var result = mul(a = 3, b = 5)  //이름 있는 인자 사용
        Log.d("코틀린 : 사용자 정의 함수 ", "3 * 5 = $result")
        */

        /*//2-31
        var num1 = 26
        var num2 = 3
        var result = num1.rem(num2)
        Log.d("코틀린 : 표준 라이브러리 함수 ", "$num1 % $num2 = $result")
        */
    }

    fun mul(a: Int, b: Int): Int {
        var number = a * b
        return number
    }

    /*//2-28
    fun mul(a: Int, b: Int = 5): Int {
        var number = a * b
        return number
    }
    */

    /*//2-29
    //반환값이 없는 함수(Unit형)이므로 결과만 로그 출력
    fun mul(a: Int, b: Int = 5): Unit {
        var number = a * b
        return number
    }
    */

    /*//2-30
    fun mul(a: Int, b: Int): Int {
        var number = a * b
        return number
    }
    */
}
