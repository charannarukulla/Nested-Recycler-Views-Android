package com.charannarukulla.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL

class MainActivity : AppCompatActivity() {
    lateinit var  rr:RecyclerView
   lateinit var adaptor:Adaptor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rr=findViewById(R.id.rr)
        rr.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        adaptor= Adaptor(this,verticallist = vertical,hori = hori)
        rr.setHasFixedSize(true)
        rr.adapter=adaptor
        adaptor.notifyDataSetChanged()


    }
}