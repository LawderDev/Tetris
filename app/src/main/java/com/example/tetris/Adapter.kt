package com.example.tetris

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class Adapter ( var view: View, var images: ArrayList<ImageView>) : BaseAdapter() {

    override fun getCount(): Int {
        return this.images.count()
    }

    override fun getItem(position: Int): Any {
        return this.images[position]
    }

    override fun getItemId(position: Int): Long {
        return this.images[position].id.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return view
    }
}