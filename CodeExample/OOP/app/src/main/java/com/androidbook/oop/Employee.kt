package com.androidbook.oop

import android.util.Log

class Employee (empId: Int , empName: String) {
    //멤버 변수
    val id: Int
    var name: String
    //초기화 블록(init 블록)
    init {
        id = empId
        name = empName
        //객체가 생성될 때 로그 출력
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Employee 아이디: $id")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Employee 이름 : $name")
    }
}
