package com.example.practicaretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DataAdapter(private var dataList: List<DataModel>, private val context: Context) : RecyclerView.Adapter<DataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataAdapter.ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.listitem,parent,false))

    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: DataAdapter.ViewHolder, position: Int) {

       var dataModel= dataList.get(position)
       holder.emailTextView.text=dataModel.email //muuy importante
        //.text es equivalente al getText() en Java
    }

    class ViewHolder(itemLayoutView: View):RecyclerView.ViewHolder(itemLayoutView)
    {
       lateinit var emailTextView: TextView

        init {

            emailTextView=itemLayoutView.findViewById(R.id.email)
        }

    }

    /*
       class ViewHolder Recycler.ViewHolder
       {
            class ViewHolder constructor(itemView)
            {


            }

       }


        class ViewHolder hija
       {
            class ViewHolder constructor(itemLayoutView: View)
            {
               super(itemLayoutView)
            }

       }


     */


}





