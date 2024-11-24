package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.databinding.ActivityMainBinding
import com.example.androidbasics.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
//
        binding.btnGoBack.setOnClickListener {
            finish()
        }
//
        binding.nextActivity.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

//        val Name = intent.getStringExtra("Name")
//        val Age = intent.getStringExtra("Age")
//        val Country = intent.getStringExtra("Country")
        val person = intent.getParcelableExtra<SamplePerson>("person")

        binding.tvPerson.text = "Name - ${person?.name}, Age - ${person?.age}, Country - ${person?.country}"
    }
}