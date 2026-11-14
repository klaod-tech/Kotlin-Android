package com.androidbook.oop

import android.os.Bundle
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

        var myObj = Member()        //객체 생성
        myObj.name = "홍길동"       //name 속성 접근, 값 할당
        myObj.age = 20              //age 속성 접근, 값 할당,
        myObj.gender = 'M'          //gender 속성 접근, 값 할당
        myObj.printMemberInfo()     //멤버 함수 호출

        //2-34
        //var myEmp = Employee(202201, "홍길순")   //기본 생성자를 사용하여 Employee 객체 생성

        //2-35
        //var myPerson = Person("홍길순", 20)      //보조 생성자를 사용하여 Person 객체 생성

        /*//2-39
        val myDog = Dog4()

        myDog.printNames()          //this와 super로 속성 구분
        myDog.callSoundMethods()    //this와 super로 메서드 구분
        */
    }
}
