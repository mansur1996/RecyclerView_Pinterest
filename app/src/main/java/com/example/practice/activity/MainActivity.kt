package com.example.practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import androidx.recyclerview.widget.*
import com.example.practice.R
import com.example.practice.adapter.ItemAdapter
import com.example.practice.helper.SpaceItemDecoration
import com.example.practice.model.Item

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
        )

        initViews()
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.addItemDecoration(SpaceItemDecoration(10))

        refreshAdapter(getAllItems())
    }

    private fun refreshAdapter(items: ArrayList<Item>){
        val adapter = ItemAdapter(this, items)
        recyclerView.adapter = adapter

    }

    private fun getAllItems() : ArrayList<Item>{
        val items : ArrayList<Item> = ArrayList()

        items.add(Item(R.drawable.img_1, "Library"))
        items.add(Item(R.drawable.img_2, "Window"))
        items.add(Item(R.drawable.img_3, "Developer"))
        items.add(Item(R.drawable.img_4, "Designer"))
        items.add(Item(R.drawable.img_5, "Restaurant"))
        items.add(Item(R.drawable.img_6, "Travel"))
        items.add(Item(R.drawable.img_1, "Library"))
        items.add(Item(R.drawable.img_2, "Window"))
        items.add(Item(R.drawable.img_3, "Developer"))
        items.add(Item(R.drawable.img_4, "Designer"))
        items.add(Item(R.drawable.img_5, "Restaurant"))
        items.add(Item(R.drawable.img_6, "Travel"))

        return items
    }
}