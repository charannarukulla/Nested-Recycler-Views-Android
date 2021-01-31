package com.charannarukulla.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Childadaptor (var context: Context,  var hori:List<String>):
    RecyclerView.Adapter<Childadaptor.ViewHolder>()
{
    inner  class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var text=view.findViewById<TextView >(R.id.texthchild)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Childadaptor.ViewHolder {
         var view=LayoutInflater.from(context).inflate(R.layout.listchild,parent,false)
        return  ViewHolder(view)
    }

    override fun getItemCount(): Int {
     return    hori.size
    }

    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.text.text= hori.get(position).toString()
    }


}
