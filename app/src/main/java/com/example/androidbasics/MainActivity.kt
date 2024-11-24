package com.example.androidbasics

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.trackPipAnimationHintView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbasics.databinding.ActivityMainBinding
import java.util.Collections

class MainActivity : AppCompatActivity() {
    val Tag = "MyTag"

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val btnApply = findViewById<Button>(R.id.btnApply)
//        btnApply.setOnClickListener {
//            val fisrtName = findViewById<EditText>(R.id.etFirstName).text.toString()
//            val lastName = findViewById<EditText>(R.id.etLastName).text.toString()
//            val birthDate = findViewById<EditText>(R.id.etDate).text.toString()
//            val country = findViewById<EditText>(R.id.etCountry).text.toString()
//
//            Log.i("MyApp", "$fisrtName $lastName, DOB - $birthDate, country - $country")
//        }
//        val btnCount = findViewById<Button>(R.id.btnAdd)
//        val tvCount = findViewById<TextView>(R.id.tvCount)
//        var count = 0
//        btnCount.setOnClickListener {
//            count++
//            tvCount.text = "Lets Count Together : $count"
//        }

//        val btnAdd = findViewById<Button>(R.id.btnAdd)
//        btnAdd.setOnClickListener {
//            val etFirstNum = findViewById<EditText>(R.id.etFirstNum)
//            val etSecondNum = findViewById<EditText>(R.id.etSecondNum)
//            val tvRes = findViewById<TextView>(R.id.tvRes)
//            val num1 = etFirstNum.text.toString().toInt()
//            val num2 = etSecondNum.text.toString().toInt()
//            val res = num1 + num2
//            tvRes.text = res.toString()
//        }

//        val imageView = findViewById<ImageView>(R.id.imageView)
//        val btnAdd = findViewById<Button>(R.id.btnAdd)
//
//        btnAdd.setOnClickListener {
//            imageView.setImageResource(R.drawable.sample)
//        }

        // Radio buttons and checkbox

        binding.btnOrder.setOnClickListener {
            val checkedMeatRadioGroupId = binding.rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioGroupId) // radioBtn

            val cheese = binding.cbCheese.isChecked
            val onions = binding.cbOnions.isChecked
            val salad = binding.cbSalad.isChecked


            val orderString = "You have Ordered a burger with \n" +
                    "${meat.text}" +
                    (if (cheese) "\nCheese" else "") +
                    (if (onions) "\nOnions" else "") +
                    (if (salad) "\nSalad" else "")

            binding.tvResult.text = orderString.toString()

        }




//        Log.i(Tag, "in OnCreate")

//        val list = listOf(5, 3, 6, 7, 9, 1)
//        sortList(list)
//        println(list)
    }

    // checking errors code.
//    private fun sortList(list : List<Int>){
//        for (i in 0..< list.size - 1){
//            for (j in 0..< list.size - 1){
//                if (list[j] > list[j + 1]){
//                    Collections.swap(list, j, j + 1)
//                }
//            }
//        }
//    }

//    override fun onStart() {
//        super.onStart()
//        Log.i(Tag, "in OnStart")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i(Tag, "in OnResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.i(Tag, "in OnPause")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.i(Tag, "in OnStop")
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        Log.i(Tag, "in OnRestart")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.i(Tag, "in OnDestroy")
//    }
}