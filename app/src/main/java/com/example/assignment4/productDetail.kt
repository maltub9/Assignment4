package com.example.assignment4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class productDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        var indx:Int=Globals.selectedProduct

        var prod:Product=productsSample.getProducts()[indx]


        var detailTitle=findViewById<TextView>(R.id.detailTitle)
        var detailColor=findViewById<TextView>(R.id.detailColor)
        var detailDesc=findViewById<TextView>(R.id.detailDesc)
        var detailImage=findViewById<ImageView>(R.id.detailImage)
        var detailPrice=findViewById<TextView>(R.id.detailPrice)

        detailTitle.text=prod.Title
        detailColor.text=prod.color
        detailDesc.text=prod.Description
        detailPrice.text=prod.Price.toString()
        detailImage.setImageResource(prod.image)
    }
}