package com.gzeinnumer.recyclerviewkt

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class CostumAdapter(val contex: Context,val userList: ArrayList<User>) : RecyclerView.Adapter<CostumAdapter.MyHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.item, parent, false)
        return  MyHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val user: User =  userList[position]
        holder.textName?.text    = user.name
        holder.textAddress?.text = user.address

        holder.itemView.setOnClickListener(View.OnClickListener {
            Toast.makeText(contex,user.name,Toast.LENGTH_SHORT).show()
        })
    }

    class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val textName =  itemView.findViewById(R.id.tvName) as TextView
        val textAddress =  itemView.findViewById(R.id.tvAddress) as TextView
    }
}
