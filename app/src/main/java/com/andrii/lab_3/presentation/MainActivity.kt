package com.andrii.lab_3.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andrii.lab_3.R
import com.andrii.lab_3.databinding.ActivityMainBinding
import com.andrii.lab_3.databinding.FragmentHomeBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}