package com.androidbook.datatype

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

        var numOne = 1  // Int형 추론
        var numTwo = 3000000000 // Long형 추론
        var myByte: Byte = 1 // 명시적 Byte형 지정
        var myInt: Int = 20 // 명시적 Int형 지정
        var myLong = 25L // 명시적 Long형 지정

        Log.d("코틀린 : 정수 자료형 ","Int : " + numOne)
        Log.d("코틀린 : 정수 자료형 ","Long : " + numTwo)
        Log.d("코틀린 : 정수 자료형 ","Byte : " + myByte)
        Log.d("코틀린 : 정수 자료형 ","Int : " + myInt)
        Log.d("코틀린 : 정수 자료형 ","Long : " + myLong)

        /*
        var myFloat = 30.2F // Float형 추론
        var myDouble = 35.4 // Double형 추론

        Log.d("코틀린 : 실수 자료형 ","Float :  " + myFloat)
        Log.d("코틀린 : 실수 자료형 ","Double :  " + myDouble)
        */

        /*
        var myBoolean : Boolean = true //명시적 Boolean형 지정
        Log.d("코틀린 : 부울린 자료형 ","Boolean :  " + myBoolean)
        */

        /*
        var myChar1 : Char = 'K'   //변수 myChar1에 문자 값 ‘K’를 저장
        var myChar2 : Char = 'o'   //변수 myChar2에 문자 값 ‘o’를 저장
        var myChar3 : Char = 't'   //변수 myChar3에 문자 값 ‘t’를 저장
        var myChar4 : Char = 'l'   //변수 myChar4에 문자 값 ‘l’를 저장
        var myChar5 : Char = 'i'   //변수 myChar5에 문자 값 ‘i’를 저장
        var myChar6 : Char = 'n'   //변수 myChar6에 문자 값 ‘n’를 저장
        Log.d("코틀린 : 문자 자료형 ","Char : " + myChar1+myChar2+myChar3+myChar4+myChar5+myChar6)
        */

        /*
        var myString1 : String = "Kotlin\n"  //명시적 String형 지정
        var myString2 : String = "Java"      //명시적 String형 지정
        Log.d("코틀린 : 문자열 자료형 ","String : " + myString1)
        Log.d("코틀린 : 문자열 자료형 ","String : " + myString2)
        */

        /*
        var myArray: IntArray = intArrayOf(1,2,3,4,5) //배열 myArray에 1,2,3,4,5 저장
        Log.d("코틀린 : 배열 자료형 ","배열의 3번째 값 : " + myArray[2])
        */

        /*
        var myX: Int = 100
        var myY: Long = myX    //오류 발생
        Log.d("코틀린 : 자료형 변환 ","Int : " + myX)
        Log.d("코틀린 : 자료형 변환 ","Long : " + myY)
        */

        /*
        var myX: Int = 100
        var myY: Long = myX.toLong()
        Log.d("코틀린 : 자료형 변환 ","Int : " + myX)
        Log.d("코틀린 : 자료형 변환 ","Long : " + myY)
        */
    }
}
