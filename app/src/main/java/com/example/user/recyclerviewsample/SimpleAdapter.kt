package com.example.user.recyclerviewsample

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup

class SimpleAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private val dataList: ArrayList<String>

    constructor(dataList: ArrayList<String>) : super() {
        this.dataList = dataList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.listitem_simpleview, parent, false)
        return SimpleViewHolder(itemView)
    }

    override fun getItemCount() = dataList.size

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, adapterPosition: Int) {
        (viewHolder as SimpleViewHolder).bind(dataList[adapterPosition])
    }

    override fun onViewAttachedToWindow(holder: RecyclerView.ViewHolder) {
        super.onViewAttachedToWindow(holder)
        Log.d("jm.lee", "adapter.onViewAttachedToWindow(holder = $holder)")
    }

    override fun onViewDetachedFromWindow(holder: RecyclerView.ViewHolder) {
        super.onViewDetachedFromWindow(holder)
        Log.d("jm.lee", "adapter.onViewDetachedFromWindow(holder = $holder)")
    }

    override fun onViewRecycled(holder: RecyclerView.ViewHolder) {
        super.onViewRecycled(holder)
        Log.d("jm.lee", "adapter.onViewRecycled(holder = $holder)")
    }

    override fun onFailedToRecycleView(holder: RecyclerView.ViewHolder): Boolean {
        val failedToRecyclerView = super.onFailedToRecycleView(holder)
        Log.d("jm.lee", "adapter.onFailedToRecycleView(holder = $holder) = $failedToRecyclerView")
        return failedToRecyclerView
    }

}