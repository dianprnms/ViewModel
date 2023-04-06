package com.example.viewmodel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(var listStudent : ArrayList<DataStudent>):RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){
        var name = itemView.findViewById<TextView>(R.id.nama)
        var tanggal = itemView.findViewById<TextView>(R.id.tgl)
        var img = itemView.findViewById<ImageView>(R.id.img)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         var view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var data = listStudent[position]
        holder.name.text = data.nama
        holder.tanggal.text = data.tanggal
        holder.img.setImageResource(data.img)

    }

    fun setStudentData(listStudent: ArrayList<DataStudent>){
        this.listStudent = listStudent
    }

}