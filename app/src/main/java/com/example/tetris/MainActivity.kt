package com.example.tetris

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.GridView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gridView = findViewById<GridView>(R.id.gridView)
        var boardImage: ArrayList<ImageView> = ArrayList()
        var board = Array(20) { IntArray(10) }
        var adapter = Adapter(gridView, boardImage)

    }
}