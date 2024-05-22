package com.example.aeroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemsList: RecyclerView = findViewById(R.id.itemsList)

        val items = arrayListOf<ItemDB>()
        items.add(ItemDB("Санкт-Петербург","Москва","01.07.2024","01.07.2024",
            "15:00","16:00","Пулково","Домодедово",1.0))
        items.add(ItemDB("Санкт-Петербург","Оренбург","01.07.2024","01.07.2024","17:00","19:50","Пулково","аэропорт им. Гагарина",2.5))
        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)

    }
}