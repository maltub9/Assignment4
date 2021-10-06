package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class products_list : AppCompatActivity() {

    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)

        listView = findViewById<ListView>(R.id.productsList)

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

    }
}