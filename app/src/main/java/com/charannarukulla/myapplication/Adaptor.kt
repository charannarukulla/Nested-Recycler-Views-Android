package com.charannarukulla.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Adaptor (var context: Context,var verticallist:List<String>,var hori:List<String>):
    RecyclerView.Adapter<Adaptor.ViewHolder>()
{

    inner  class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var text=view.findViewById<TextView >(R.id.texth)
var nested=view.findViewById<RecyclerView>(R.id.rrn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
  val view=LayoutInflater.from(context).inflate(R.layout.listviews,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return  verticallist.size
    }
    val viewPool = RecyclerView.RecycledViewPool()
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.text.text= verticallist.get(position).toString()
var linearLayoutManagerchild=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
          if (position%2==0){

          holder.nested.apply {
              holder.nested.visibility=View.VISIBLE
              layoutManager=linearLayoutManagerchild
              adapter=Childadaptor(context,hori)
              setRecycledViewPool(viewPool)
          }}
        else
              holder.nested.visibility=View.GONE





    }


}
