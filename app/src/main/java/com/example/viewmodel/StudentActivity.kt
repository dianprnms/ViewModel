package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodel.databinding.ActivityStudentBinding
import com.example.viewmodel.databinding.ActivityUsingViewModelBinding

class StudentActivity : AppCompatActivity() {
    lateinit var studenVm :StudentViewModel
    lateinit var studentAdapter: StudentAdapter
    lateinit var binding: ActivityStudentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initStudent()

        studenVm = ViewModelProvider(this). get(StudentViewModel::class.java)

        studenVm.getStudentList()
        studenVm.studentList.observe(this, Observer {
            studentAdapter.setStudentData(it as ArrayList<DataStudent>)
        })

    }

    fun initStudent(){
        studentAdapter = StudentAdapter(ArrayList())
        binding.rvStudent.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.adapter = studentAdapter
    }


}