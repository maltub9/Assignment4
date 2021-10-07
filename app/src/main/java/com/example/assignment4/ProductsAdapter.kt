package com.example.assignment4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent as Intent1

class ProductsAdapter:RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemPrice.text=productsSample.getProducts()[position].Price.toString()
        holder.itemColor.text=productsSample.getProducts()[position].color.toString()
        holder.itemTitle.text=productsSample.getProducts()[position].Title.toString()
        holder.itemImage.setImageResource(productsSample.getProducts()[position].image)
    }

    override fun getItemCount(): Int {
        return productsSample.getProducts().size
    }

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var itemImage:ImageView
        var itemTitle:TextView
        var itemColor:TextView
        var itemPrice:TextView

        init {
            itemImage=itemView.findViewById(R.id.itemImage)
            itemTitle=itemView.findViewById(R.id.itemTitle)
            itemColor=itemView.findViewById(R.id.itemColor)
            itemPrice=itemView.findViewById(R.id.itemPrice)

            itemView.setOnClickListener{
                val pos:Int=adapterPosition
                //Toast.makeText(itemView.context, pos.toString(), Toast.LENGTH_SHORT).show()
                var intent = Intent1(itemView.context, productDetail::class.java)
                val putExtra = intent.putExtra("productIndex", pos)
                Globals.selectedProduct=pos
                itemView.context.startActivity(intent)
            }
        }


    }
}