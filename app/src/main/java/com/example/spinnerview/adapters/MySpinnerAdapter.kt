package com.example.spinnerview.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.spinnerview.databinding.SpinnerItemBinding
import com.example.spinnerview.models.User

class MySpinnerAdapter(context: Context, var list: ArrayList<User>) : BaseAdapter() {

    private val inflater = LayoutInflater.from(context)

    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Any {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = SpinnerItemBinding.inflate(inflater, parent, false)

        binding.image.setImageResource(list[position].image)
        binding.title.text = list[position].title

        return binding.root
    }
}