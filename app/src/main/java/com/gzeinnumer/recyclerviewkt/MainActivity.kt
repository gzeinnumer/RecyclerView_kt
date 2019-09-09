package com.gzeinnumer.recyclerviewkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var rv:RecyclerView? =null
    val users: ArrayList<User>? =  null

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv = findViewById(R.id.rv) as RecyclerView

        rv!!.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //cara 1
//        if (users != null) {
//            users.add(User("GZeinNumer","Balaibaru"))
//        }

        //cara 2
        users?.add(User("GZeinNumer","Balaibaru"))

        val adapter = CostumAdapter(this,users!!)

        rv!!.adapter = adapter
    }
}
