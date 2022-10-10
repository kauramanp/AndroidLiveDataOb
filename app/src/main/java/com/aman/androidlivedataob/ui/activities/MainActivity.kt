package com.aman.androidlivedataob.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.aman.androidlivedataob.databinding.ActivityMainBinding
import com.aman.androidlivedataob.viewModel.LiveDataViewModel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var liveDataViewModel: LiveDataViewModel
    var color = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        liveDataViewModel = ViewModelProvider(this)[LiveDataViewModel::class.java]

        binding.btnBlue.setOnClickListener {
            liveDataViewModel.color.setValue(1)
        }
        binding.btnGreen.setOnClickListener {
            liveDataViewModel.color.setValue(2)
        }
        binding.btnRed.setOnClickListener {
            liveDataViewModel.color.setValue(3)
        }
    }
}