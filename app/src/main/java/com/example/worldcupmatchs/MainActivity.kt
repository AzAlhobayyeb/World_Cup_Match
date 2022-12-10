package com.example.worldcupmatchs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupmatchs.adapter.MatchsAdapter
import com.example.worldcupmatchs.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val datset = DataSource().matchsData()

        val recyclerView = findViewById<RecyclerView>(R.id.view_recycle)

        val adapter = MatchsAdapter(this, datset)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)


    }
}