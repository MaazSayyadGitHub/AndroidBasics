package com.example.androidbasics

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
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
import java.io.Serializable
import java.util.ArrayList
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

//        binding.btnOrder.setOnClickListener {
//            val checkedMeatRadioGroupId = binding.rgMeat.checkedRadioButtonId
//            val meat = findViewById<RadioButton>(checkedMeatRadioGroupId) // radioBtn
//
//            val cheese = binding.cbCheese.isChecked
//            val onions = binding.cbOnions.isChecked
//            val salad = binding.cbSalad.isChecked
//
//
//            val orderString = "You have Ordered a burger with \n" +
//                    "${meat.text}" +
//                    (if (cheese) "\nCheese" else "") +
//                    (if (onions) "\nOnions" else "") +
//                    (if (salad) "\nSalad" else "")
//
//            binding.tvResult.text = orderString.toString()
//
//        }


        // Toast
//        binding.btnShow.setOnClickListener {
//            Toast(this).apply {
//                duration = Toast.LENGTH_LONG
//                view = layoutInflater.inflate(R.layout.custom_toast, null)
//                show()
//            }
//
//        }

        // Intents and passing data
//        binding.btnOpenActivity.setOnClickListener {
////            Intent(this, SecondActivity::class.java).also {
////                startActivity(it)
////            }
//            val intents = Intent(this, SecondActivity::class.java)
//            startActivity(intents)
//        }

        // Passing Data/Classes (Serializable/Parcelable) between Activities.
//        binding.sendData.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
////            intent.putExtra("Name", binding.etName.text.toString())
////            intent.putExtra("Age", binding.etAge.text.toString())
////            intent.putExtra("Country", binding.etCountry.text.toString())
//
//            val person = SamplePerson(binding.etName.text.toString(), binding.etAge.text.toString().toInt(), binding.etCountry.text.toString())
//            intent.putExtra("person", person)
//
//            startActivity(intent)
//        }

        // goto permission activity
        //
        binding.sendData.setOnClickListener {
            startActivity(Intent(this, RecyclerViewActivity::class.java))
        }






//        Log.i(Tag, "in OnCreate")

//        val list = listOf(5, 3, 6, 7, 9, 1)
//        sortList(list)
//        println(list)
    }

    // menu bar item
    /*
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_contact -> Toast.makeText(this, "You Clicked on Add Contacts", Toast.LENGTH_SHORT).show()
            R.id.menu_fav -> Toast.makeText(this, "You Clicked on Favorites", Toast.LENGTH_SHORT).show()
            R.id.menu_close -> finish() // we will close app here
            R.id.menu_setting -> Toast.makeText(this, "You Clicked on Setting", Toast.LENGTH_SHORT).show()
            R.id.menu_feedback -> Toast.makeText(this, "You Clicked on Feedback", Toast.LENGTH_SHORT).show()
        }
        return true
    }
     */

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