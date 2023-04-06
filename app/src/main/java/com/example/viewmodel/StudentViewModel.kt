package com.example.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class StudentViewModel : ViewModel() {

    val list = arrayListOf(
        DataStudent("Dian", "21 des 2001", R.drawable.logo),
        DataStudent("Dian", "21 des 2001", R.drawable.logo),
        DataStudent("Dian", "21 des 2001", R.drawable.logo),
        DataStudent("Dian", "21 des 2001", R.drawable.logo),
        DataStudent("Dian", "21 des 2001", R.drawable.logo)
        )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudentList(){
        var stu = list
        studentList.value = stu
    }

}