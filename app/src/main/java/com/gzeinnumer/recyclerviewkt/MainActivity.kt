package com.gzeinnumer.recyclerviewkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById(R.id.rv) as RecyclerView

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        val users = ArrayList<User>()

        users.add(User("GZeinNumer","Balaibaru"))

        val adapter = CostumAdapter(users)

    }
}
