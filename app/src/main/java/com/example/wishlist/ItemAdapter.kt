package com.example.wishlist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class ItemAdapter (private val Items:  ArrayList<ItemClass>):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val urlView: TextView = itemView.findViewById(R.id.ItemUrl)
        val priceTextView: TextView = itemView.findViewById(R.id.ItemPrice)
        val nameTextView: TextView= itemView.findViewById(R.id.ItemName)

        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = Items[position]
        // Set item views based on views and data model
        holder.nameTextView.text = item.ItemName
        holder.urlView.text = item.Url
        holder.priceTextView.text = item.Price.toString()
    }

    override fun getItemCount(): Int {

        return Items.size
    }




}