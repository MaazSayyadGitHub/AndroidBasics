package com.example.androidbasics

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.contains
import androidx.fragment.app.FragmentManager
import com.example.androidbasics.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var binding : ActivityFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val firstFragment = FirstFragment()
        val secondFragment = SecondFragmment()

        // another way
//        supportFragmentManager.beginTransaction().replace(R.id.FLFragment, firstFragment).commit()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FLFragment, firstFragment)
            commit()
        }

        binding.fragment1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLFragment, firstFragment)
                addToBackStack("firstFragment")
                commit()
            }
        }

        binding.fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.FLFragment, secondFragment)
                addToBackStack("secondFragment")
                commit()
            }
        }



    }
}