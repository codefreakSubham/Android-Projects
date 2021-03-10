package com.example.newsfresh

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.LayoutManager = LinearLayoutManager(this)
        val items = fetchData()
        val adapter = NewsListAdapter(items, this)
        recyclerView.Adapter = adapter
    }

    private fun fetchData(): ArrayList<String>{
        val list = ArrayList<String>()
        for(i in 0 until 100){
            list.add("Item $i")
        }

        return list
    }

    override fun onItemClicked(item: String) {
        Toast.makeText(this, "Clicked item is $item", Toast.LENGTH_LONG).show()
    }
}