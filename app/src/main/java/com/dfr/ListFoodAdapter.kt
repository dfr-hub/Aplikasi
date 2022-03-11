package com.dfr

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dfr.ujikom.R


class ListFoodAdapter(private val ListFood: ArrayList<FoodModel>) :
RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    inner class ListViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var FotoMakanan: ImageView = itemView.findViewById(R.id.iv_makanan)
        var NamaMakanan: TextView = itemView.findViewById(R.id.tv_nama_makanan)
        var HargaMakanan: TextView = itemView.findViewById(R.id.tv_harga_makanan)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListFoodAdapter.ListViewHolder {

        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_row_list_food, parent, false)
        return ListViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListFoodAdapter.ListViewHolder, position: Int) {
        val list = ListFood[position]

        holder.NamaMakanan.text = list.namaMakanan
        holder.HargaMakanan.text = list.HargaMakanan

        Glide.with(holder.itemView.context)
            .load(list.FotoMakanan)
            .into(holder.FotoMakanan)

    }

    override fun getItemCount(): Int {
        return ListFood.size
    }

}