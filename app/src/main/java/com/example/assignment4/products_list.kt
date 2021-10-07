package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text
import android.view.View as View1

class products_list : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_list)

        var listView: ListView= ListView(this)
        var recycler:RecyclerView= RecyclerView(this)

        var container = findViewById<LinearLayout>(R.id.listContainer)

        Toast.makeText(this, intent.getStringExtra("category"), Toast.LENGTH_SHORT).show()


        if(intent.getStringExtra("category")=="electronics")
        {
            var layoutManager:RecyclerView.LayoutManager?= LinearLayoutManager(this)
            var adapter:RecyclerView.Adapter<ProductsAdapter.ViewHolder>?=null

            var rView:RecyclerView= RecyclerView(this)
            rView.layoutManager=layoutManager

            adapter=ProductsAdapter()
            rView.adapter=adapter

            container.addView(rView)
        }
        else
        {
            val productsList = listOf<String>("beanie","boot","caftan","coat","dress","gloves","hoodie","jeans","miniskirt","outerwear","outfit","pajamas","shirt","scarf","school uniform","T-shirt","underwear","undershirt","vest")

            val listItems = arrayOfNulls<String>(productsList.size)

            for (i in 0 until productsList.size) {
                val product = productsList[i]
                listItems[i] = product
            }

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
            listView.adapter = adapter

            listView.setOnItemClickListener { parent, view, position, id ->

                Toast.makeText(this, listItems[position],Toast.LENGTH_SHORT).show()
            }

            container.addView(listView)
        }


    }


}