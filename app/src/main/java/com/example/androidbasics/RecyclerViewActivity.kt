package com.example.androidbasics

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.androidbasics.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerViewBinding


    @RequiresApi(35)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*
        // with array
        var arrList = arrayOf(Todo("Going Home", false))
         */

        // with list
        var arrTodoList = mutableListOf(
            Todo("Waking Up on 5am", false),
            Todo("Doing 4 hr Deep Work", false),
            Todo("Evening Gym", true),
            Todo("Meditate for 20 min", false),
            Todo("Meditate for 20 min", false),
            Todo("Meditate for 20 min", false)
        )


        binding.rvTodos.layoutManager = LinearLayoutManager(this)
        val adapter = TodoAdapter(arrTodoList)
        binding.rvTodos.adapter = adapter

        binding.btnAddTodo.setOnClickListener {
            val newTodo = binding.etTodo.text.toString()
            binding.etTodo.text.clear()
            if(newTodo.isNotEmpty()){
                val newTodoTitle = Todo(newTodo, true)
                arrTodoList.add(0, newTodoTitle)
                adapter.notifyDataSetChanged()

            }
        }


    }
}