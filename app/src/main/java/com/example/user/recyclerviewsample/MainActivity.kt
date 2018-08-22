package com.example.user.recyclerviewsample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val dataList = ArrayList<String>()
    private val adapter = SimpleAdapter(dataList)
    private val layoutManager = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..100) {
            dataList.add("" + i)
        }

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }
}
