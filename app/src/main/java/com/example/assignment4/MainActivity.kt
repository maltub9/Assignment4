package com.example.assignment4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var users= mutableListOf<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        users.add(User("Malek","Tubaishat","maltub","abcd1234"))
        users.add(User("John","Smith","smith","1234"))
        users.add(User("Smith","John","john","4321"))
        users.add(User("Kelly","Jones","kelly","abcd"))
        users.add(User("Ginna","Sanders","ginna","xyz1"))

        var sing_in= findViewById<Button>(R.id.sign_in)
        var create= findViewById<Button>(R.id.createButton)
        var username = findViewById<EditText>(R.id.userName)
        var password = findViewById<EditText>(R.id.passWord)

        sing_in.setOnClickListener{
        var loged = false
        var name = ""

            for (usr in users)
            {
                if(usr.username==username.text.toString()&&usr.password==password.text.toString())
                {
                    loged = true
                    name = usr.firstname + " " + usr.lastname
                    break
                }
            }

            if(loged)
            {
                //open group activity
                val intent = Intent(this, ShoppingCategory::class.java)
                intent.putExtra("Name", name)
                startActivity(intent)

            }
            else
            {
                //show wrong password
                Toast.makeText(this, "Wrong username/password", Toast.LENGTH_SHORT).show()
            }
        }

        create.setOnClickListener{
            val intent = Intent(this, Register::class.java)
            startActivityForResult(intent,1)
        }
    }

    public override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, intent);

        if (requestCode == 1) { if (resultCode == Activity.RESULT_OK) {
            var d = data?.getStringArrayExtra("user")
            users.add(User(d?.get(0).toString(),d?.get(1).toString(),d?.get(2).toString(),d?.get(3).toString()))
    } } }

}