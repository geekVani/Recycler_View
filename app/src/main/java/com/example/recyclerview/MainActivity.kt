package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView
    var trackNameList = ArrayList<String>()
    var albumList = ArrayList<String>()

    lateinit var adapter: TracksAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerMusic)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)

        /* ** Diff. layout types
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        ** */

        // Track names list
        trackNameList.add("Channa Mereya")
        trackNameList.add("Gallan Gudiyan")
        trackNameList.add("Aankh Maare")
        trackNameList.add("Ae Watan")
        trackNameList.add("Apna Bana Le")
        trackNameList.add("Duniya")

        // Album name List
        albumList.add("Ae Dil Hai Mushkil")
        albumList.add("Dil Dhadakne Do")
        albumList.add("Simmba")
        albumList.add("Raazi")
        albumList.add("Bhediya")
        albumList.add("Luka Chuppi")

        // Adapter
        adapter = TracksAdapter(trackNameList, albumList, this@MainActivity)
        recyclerView.adapter = adapter
    }
}