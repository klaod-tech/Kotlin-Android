package com.androidbook.oop

import android.util.Log

class Person{
    var name: String
    var age: Int
    //기본 생성자 초기화 블록
    init {
        println("기본 생성자 초기화")
    }
    // 보조 생성자
    constructor(pname: String, page: Int) {
        this.name = pname     //this는 클래스 자신을 가리킴
        this.age = page
        //객체 생성 시 로그 출력
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Person 이름: $name")
        Log.d("코틀린 : 객체 지향 프로그래밍 ", "Person 나이 : $age")
    }
}
