package com.example.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var userAdapter: ItemAdapter
    private val userList = ArrayList<ItemClass>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        userAdapter = ItemAdapter(userList)
        recyclerView.adapter = userAdapter

        val submitButton = findViewById<Button>(R.id.Submit)
        submitButton.setOnClickListener {
            val nameEditText = findViewById<EditText>(R.id.ItemNameInput)
            val UrlEditText = findViewById<EditText>(R.id.ItemUrlInput)
            val PriceEditText = findViewById<EditText>(R.id.PriceInput)

            val name = nameEditText.text.toString()
            val url = UrlEditText.text.toString()
            val price = PriceEditText.text.toString()

            val user = ItemClass(name, url, price.toDouble())
            userList.add(user)
            userAdapter.notifyDataSetChanged()
            nameEditText.setText("")
            UrlEditText.setText("")
            PriceEditText.setText("")

        }
    }
}