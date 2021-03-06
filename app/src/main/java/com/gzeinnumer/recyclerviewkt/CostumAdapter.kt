package com.gzeinnumer.recyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CostumAdapter(
    private val list: ArrayList<String>,
    private val listener: (String) -> Unit
) : RecyclerView.Adapter<CostumAdapter.MyHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.textName.text = list[position]
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName = itemView.findViewById(R.id.tvName) as TextView
    }
}