package com.example.user.recyclerviewsample

import android.view.View;
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.listitem_simpleview.view.*

class SimpleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(text: String) {
        itemView.text.text = text
    }



}