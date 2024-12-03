package com.example.androidbasics

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbasics.databinding.ActivityImplicitIntentsBinding

class ImplicitIntents : AppCompatActivity() {

    private lateinit var binding: ActivityImplicitIntentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImplicitIntentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTakePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*" // this * will look for all type of image files in Gallery or image/jpeg, image/png etc.
                startActivityForResult(it, 0)
            }
        }



    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, intent: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent)
        if (requestCode == 0 && resultCode == Activity.RESULT_OK){
            val uri = intent?.data
            binding.imgPhoto.setImageURI(uri)
        }
    }
}