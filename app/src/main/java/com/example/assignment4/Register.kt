package com.example.assignment4

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        var firstName = findViewById<EditText>(R.id.firtName)
        var lastName = findViewById<EditText>(R.id.lastName)
        var userName = findViewById<EditText>(R.id.userName)
        var passWord = findViewById<EditText>(R.id.passWord)

        var create = findViewById<Button>(R.id.create)

        create.setOnClickListener{
            val data = Intent()

            var d = arrayOf(firstName.text.toString(),lastName.text.toString(),userName.text.toString(),passWord.text.toString())
            data.putExtra("user", d)

            setResult(Activity.RESULT_OK, data)
            finish()
        }
    }
}