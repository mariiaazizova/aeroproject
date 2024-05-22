package com.example.aeroproject
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.aeroproject.databinding.ItemInListBinding

class ItemsAdapter (var items: List<ItemDB>): RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: ItemInListBinding):RecyclerView.ViewHolder(binding.root){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemInListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.textView2.text = items[position].cityFrom
        holder.binding.textView2.text = items[position].cityFrom
        holder.binding.textView3.text = items[position].cityTo
        holder.binding.textView4.text = items[position].dateFrom
        holder.binding.textView5.text = items[position].dateTo
        holder.binding.textView6.text = items[position].timeFrom
        holder.binding.textView7.text = items[position].timeTo
        holder.binding.textView8.text = items[position].portFrom
        holder.binding.textView9.text = items[position].portTo
        holder.binding.textView10.text = items[position].travelTime.toString()

    }
}