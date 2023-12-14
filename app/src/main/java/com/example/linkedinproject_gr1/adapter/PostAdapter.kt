package com.example.linkedinproject_gr1.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.linkedinproject_gr1.R
import com.example.linkedinproject_gr1.models.Post

class PostAdapter(private val context : Context , private val list : List<Post>) : BaseAdapter() {
    private val layoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int = list.size

    override fun getItem(position: Int): Any = list[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = layoutInflater.inflate(R.layout.post_item,parent,false)

        val ivPhoto = rowView.findViewById<ImageView>(R.id.ivProfile)
        val tvTitle = rowView.findViewById<TextView>(R.id.tvTitle)
        val tvDescription = rowView.findViewById<TextView>(R.id.tvDesc)
        val tvTime = rowView.findViewById<TextView>(R.id.tvPostedTime)

        ivPhoto.setImageResource(list[position].profilePicture)
        tvTitle.text = list[position].title
        tvDescription.text = list[position].desc
        tvTime.text = list[position].time

        return rowView
    }
}