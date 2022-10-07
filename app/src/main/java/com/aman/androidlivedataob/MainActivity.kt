package com.aman.androidlivedataob

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.aman.androidlivedataob.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var activityInterface: ActivityInterface
    lateinit var activitySecondInterface: ActivitySecondInterface
    lateinit var liveDataViewModel: LiveDataViewModel
    var color = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        liveDataViewModel = ViewModelProvider(this)[liveDataViewModel::class.java]

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBlue.setOnClickListener {
            liveDataViewModel.color.setValue(1)

            System.out.print("on click")
            color = 1
            activityInterface.activityOneInterface(1)
            activitySecondInterface.activitySecondInterface(1)
        }
        binding.btnGreen.setOnClickListener {
            color = 2
            activityInterface.activityOneInterface(color)
            activitySecondInterface.activitySecondInterface(color)
        }
        binding.btnRed.setOnClickListener {
            color = 3
            activityInterface.activityOneInterface(color)
            activitySecondInterface.activitySecondInterface(color)
        }

    }

    fun changeOtherColor(){
        activitySecondInterface.activitySecondInterface(4)
    }
}