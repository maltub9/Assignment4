package com.example.assignment4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class ShoppingCategory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_category)

        var img_parms = LinearLayout.LayoutParams(400,400)
        val name = intent.getStringExtra("Name")
        var welcome = findViewById<TextView>(R.id.welcomeCustomer)
        welcome.text="Welcome $name"
        var grid = findViewById<GridLayout>(R.id.gridView)

        var group1:ImageView= ImageView(this)
        group1.setImageResource(R.drawable.electronics)
        group1.setLayoutParams(img_parms)


        var group2:ImageView= ImageView(this)
        group2.setImageResource(R.drawable.clothing)
        group2.setLayoutParams(img_parms)

        var group3:ImageView= ImageView(this)
        group3.setImageResource(R.drawable.beauty)
        group3.setLayoutParams(img_parms)

        var group4:ImageView= ImageView(this)
        group4.setImageResource(R.drawable.food)
        group4.setLayoutParams(img_parms)

        grid.addView(group1)
        grid.addView(group2)
        grid.addView(group3)
        grid.addView(group4)

        group1.setOnClickListener{
            Toast.makeText(this, "Electronics selected", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,products_list::class.java)
            intent.putExtra("category","electronics")
            startActivity(intent)
        }

        group2.setOnClickListener{
            Toast.makeText(this, "Clothing selected", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,products_list::class.java)
            intent.putExtra("category","clothes")
            startActivity(intent)
        }

        group3.setOnClickListener{
            Toast.makeText(this, "Beauty selected", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,products_list::class.java)
            intent.putExtra("category","clothes")
            startActivity(intent)
        }

        group4.setOnClickListener{
            Toast.makeText(this, "Food selected", Toast.LENGTH_SHORT).show()
            var intent = Intent(this,products_list::class.java)
            intent.putExtra("category","clothes")
            startActivity(intent)
        }
    }
}