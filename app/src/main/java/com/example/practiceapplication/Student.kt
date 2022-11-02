package com.example.practiceapplication
enum class EGender {
    MALE, FEMALE, LGBT
}
class Student (val name:String,
               val Id:String,
               val gender:EGender,
               val attend:Int,
               val absence:Int){
}