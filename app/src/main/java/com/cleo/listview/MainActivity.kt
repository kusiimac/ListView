package com.cleo.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val list = List<ChatModel>(10, {ChatModel()})
        val list = ArrayList<ChatModel>()
        list.add(ChatModel(R.drawable.cat, "Kabiito Achilles", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.bear, "Kemba Vivian", "Hi, How are you?","Yesterday"))
        list.add(ChatModel(R.drawable.puppies, "Atuganza Liz", "Let,s do it this evening","Today"))
        list.add(ChatModel(R.drawable.cat, "James Achilles", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.bear, "Jesca Mama", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.puppies, "Alex Hafa", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.cat, "Cleophas", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.fish, "Nicholas Mendi", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.cat, "Johny Robert", "Hello there! I will be coming over this evening","Yesterday"))
        list.add(ChatModel(R.drawable.dolphins, "Rogers K", "Hello there!","Yesterday"))
        list.add(ChatModel(R.drawable.bear, "Jeremial Mbuga", " I will be coming over this evening","Yesterday"))

        val myAdapter = MyAdapter(this, list)
        val listView = findViewById<ListView>(R.id.my_list)
        listView.adapter = myAdapter
        //binding.myList.adapter = myAdapter
    }
}