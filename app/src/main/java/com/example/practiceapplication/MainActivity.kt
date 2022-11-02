package com.example.practiceapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practiceapplication.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    val students = arrayOf(
        Student("풍자","2030125011",EGender.LGBT,0,10),
        Student("철수","2030125013",EGender.MALE,1,9),

        Student("영희","2030125012",EGender.FEMALE,1,9),

        Student("개똥","2030125014",EGender.MALE,2,8),
        Student("민수","2030125011",EGender.MALE,0,10),
        Student("하하","2030125011",EGender.MALE,0,10),
        Student("덕수","2030125011",EGender.FEMALE,0,10),
        Student("풍자","2030125011",EGender.FEMALE,10,0),
        Student("풍자","2030125011",EGender.LGBT,1,9),

        )

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.stuRecycler.layoutManager = LinearLayoutManager(this)
        binding.stuRecycler.adapter=StudentAdapter(students)
    }

}