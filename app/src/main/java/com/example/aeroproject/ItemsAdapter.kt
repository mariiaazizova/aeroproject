package com.example.aeroproject
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemsAdapter (var items: List<ItemDB>, var context: Context): RecyclerView.Adapter<ItemsAdapter.MyViewHolder>() {
    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        val textView2: TextView = view.findViewById(R.id.textView2)
        val textView3: TextView = view.findViewById(R.id.textView3)
        val textView4: TextView = view.findViewById(R.id.textView4)
        val textView5 :TextView = view.findViewById(R.id.textView5)
        val textView6: TextView = view.findViewById(R.id.textView6)
        val textView7: TextView = view.findViewById(R.id.textView7)
        val textView8: TextView = view.findViewById(R.id.textView8)
        val textView9: TextView = view.findViewById(R.id.textView9)
        val textView10: TextView = view.findViewById(R.id.textView10)



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_in_list,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView2.text = items[position].cityFrom
        holder.textView3.text = items[position].cityTo
        holder.textView4.text = items[position].dateFrom
        holder.textView5.text = items[position].dateTo
        holder.textView6.text = items[position].timeFrom
        holder.textView7.text = items[position].timeTo
        holder.textView8.text = items[position].portFrom
        holder.textView9.text = items[position].portTo
        holder.textView10.text = items[position].travelTime.toString()

    }
}