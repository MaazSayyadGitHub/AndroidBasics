package com.example.androidbasics

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidbasics.databinding.ActivitySpinnerBinding


class SpinnerActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySpinnerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySpinnerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // this is custom spinner adapter
        val customList = listOf("First", "Second", "Third", "Fourth")
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, customList)
        binding.spMonths.adapter = adapter

        // itemSelected Listener for spinner with anonymous class
        binding.spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@SpinnerActivity, "${adapterView?.getItemAtPosition(position)}", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                // There will be no case such that, like there is no item selected
            }

        }

    }
}