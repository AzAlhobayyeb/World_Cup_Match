package com.example.worldcupmatchs.adapter

import android.content.Context
import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import com.example.worldcupmatchs.model.Match
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.worldcupmatchs.R


class MatchsAdapter(
    private val context: Context,
    private val dataset: List<Match>
) : RecyclerView.Adapter<MatchsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val matchName: TextView = view.findViewById(R.id.tv_name)
        val matchTime: TextView = view.findViewById(R.id.tv_time)
        val matchStadium: TextView = view.findViewById(R.id.tv_stadium)
        val matchImage1: ImageView = view.findViewById(R.id.image_1)
        val matchImage2: ImageView = view.findViewById(R.id.image_2)
        val itemView: CardView = view.findViewById(R.id.itemview)
    }

    override fun getItemCount() = dataset.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemLayot =
            LayoutInflater.from(parent.context).inflate(R.layout.item_match, parent, false)
        return ViewHolder(itemLayot)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataset[position]
        holder.matchName.text = item.name
        holder.matchTime.text = item.time
        holder.matchStadium.text = item.stadium
        holder.matchImage1.setImageResource(item.image1)
        holder.matchImage2.setImageResource(item.image2)
        holder.itemView.setOnClickListener {
            Toast.makeText(context, item.name, Toast.LENGTH_SHORT).show()
        }

    }


}