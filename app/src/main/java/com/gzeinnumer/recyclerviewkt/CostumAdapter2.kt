package com.gzeinnumer.recyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CostumAdapter2(
    private val userList: ArrayList<String>,
    private val listener: OnCallBack
) : RecyclerView.Adapter<CostumAdapter2.MyHolder>() {

    interface OnCallBack {
        fun onClick(data: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return MyHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.textName.text = userList[position]

        holder.itemView.setOnClickListener {
            listener.onClick(userList[position])
        }
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName = itemView.findViewById(R.id.tvName) as TextView
    }
}
