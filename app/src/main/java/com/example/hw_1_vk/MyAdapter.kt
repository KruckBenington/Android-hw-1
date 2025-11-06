package com.example.hw_1_vk

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MyAdapter() : RecyclerView.Adapter<MyViewHolder>() {


    private val items: ArrayList<NumberData> = ArrayList<NumberData>()

    fun addItem() {
        val number = items.count() + 1
        items.add(NumberData(number = number))
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.square, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val index = items[position]

        val colorToSet = if (position % 2 == 1) ButtonColor.Blue else ButtonColor.Red
        holder.setColor(colorToSet)

        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.count()
    }

}

