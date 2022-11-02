package com.example.practiceapplication

import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.practiceapplication.databinding.RecyclerListBinding

class StudentAdapter(val students:Array<Student>)
    : RecyclerView.Adapter<StudentAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val binding = RecyclerListBinding.inflate(LayoutInflater.from(parent.context))
        return Holder(binding)

    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(students[position])
    }

    override fun getItemCount() = students.size

    class Holder(private val binding: RecyclerListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(student: Student) {
            binding.imageView.setImageResource(
                when (student.gender) {
                    EGender.MALE -> R.drawable.male
                    EGender.FEMALE -> R.drawable.female
                    EGender.LGBT -> R.drawable.lgbt
                })
            binding.txtNumber.text = student.Id
            binding.txtName2.text=student.name
            binding.txtAb.text=student.attend.toString()
            binding.txtAtten.text=student.absence.toString()

            binding.root.setOnClickListener{
                Toast.makeText(binding.root.context,"이름 : ${student.name} 학번 : ${student.Id}\n 출석 : ${student.attend}, 결석 : ${student.absence}",
                Toast.LENGTH_SHORT).show()
            }

        }
    }
}