package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class products_list : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_list)

        var listView: ListView= ListView(this)
        var recycler:RecyclerView= RecyclerView(this)

        var container = findViewById<LinearLayout>(R.id.listContainer)

        Toast.makeText(this, intent.getStringExtra("category"), Toast.LENGTH_SHORT).show()
        var samples:productsSample= productsSample()

        var productsList=samples.getProducts()

        if(intent.getStringExtra("category")=="electronics")
        {

            var cards = mutableListOf<View>()

            for (i in 0 until productsList.size) {
                val product = productsList[i]
                cards.add(createCard(product))
            }

            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cards)
            //recycler.adapter = adapter


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

    private fun createCard(product: Product): View {
        var layout:LinearLayout= LinearLayout(this)
        var layoutContent:LinearLayout= LinearLayout(this)
        layout.orientation=LinearLayout.HORIZONTAL
        layoutContent.orientation=LinearLayout.VERTICAL

        var image:ImageView= ImageView(this)
        var titleView:TextView= TextView(this)
        var priceView:TextView=TextView(this)
        var colorView:TextView=TextView(this)

        when(product.image){
            "p1"->{
                image.setImageResource(R.drawable.p1)
            }
            "p2"->{
                image.setImageResource(R.drawable.p2)
            }
            "p3"->{
                image.setImageResource(R.drawable.p3)
            }
            "p4"->{
                image.setImageResource(R.drawable.p4)
            }
        }
        titleView.text=product.Title
        priceView.text=product.Price.toString()
        colorView.text=product.color

        layoutContent.addView(titleView)
        layoutContent.addView(priceView)
        layoutContent.addView(colorView)

        layout.addView(image)
        layout.addView(layoutContent)

        return  layout
    }
}