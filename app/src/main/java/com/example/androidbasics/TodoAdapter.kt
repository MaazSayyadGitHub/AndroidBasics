package com.example.androidbasics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(var todoList: List<Todo>) : RecyclerView.Adapter<TodoAdapter.viewHolder>(){


    inner class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title = itemView.findViewById<TextView>(R.id.tvTitle)
        val isChecked = itemView.findViewById<CheckBox>(R.id.cbDone)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_layout, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return todoList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        // we don't need this
//        holder.itemView.apply {
//
//        }
        holder.apply {
            title.text = todoList[position].title
            isChecked.isChecked = todoList[position].isChecked
        }
    }
}

