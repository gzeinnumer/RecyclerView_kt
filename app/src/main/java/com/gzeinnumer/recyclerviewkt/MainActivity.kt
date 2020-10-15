package com.gzeinnumer.recyclerviewkt

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    lateinit var list: ArrayList<String>

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        type1()
        type2()
    }

    private fun type1() {
        list.add("GZeinNumer")

        val adapter = CostumAdapter(list){
            Log.d(TAG, "onCreate: $it")
        }

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rv.adapter = adapter
    }

    private fun type2() {
        list.add("GZeinNumer")

        val adapter = CostumAdapter2(list, object: CostumAdapter2.OnCallBack{
            override fun onClick(data: String) {
                Log.d(TAG, "onClick: $data")
            }
        })

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        rv.adapter = adapter
    }
}
