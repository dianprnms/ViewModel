package com.example.viewmodel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityUsingViewModelBinding

class UsingViewModel : AppCompatActivity() {
   lateinit var viewModel : HitungViewModel
   lateinit var binding : ActivityUsingViewModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsingViewModelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(HitungViewModel::class.java)
        binding.hasil.text = viewModel.hasil.toString()

        binding.btn.setOnClickListener {
            var pj = binding.pjg.text.toString().toInt()
            var lb = binding.lbr.text.toString().toInt()
            var tg = binding.tg.text.toString().toInt()
            viewModel.Hitung(pj, lb, tg)
            binding.hasil.text = "Hasil Luas" + viewModel.hasil.toString()
        }
    }





}