package com.example.practicaretrofit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    var dataList = ArrayList<DataModel>() //objeto nuevo dataList
    lateinit var recyclerView: RecyclerView
    lateinit var  adapter: DataAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recycler_view)
        //establecer el adapter -> recyclerView
        recyclerView.adapter=DataAdapter(dataList,this)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        getData()


    }

   private  fun getData()
    {
        val call: Call<List<DataModel>> =ApiClient.getClient.getComments()
        call.enqueue( object: Callback<List<DataModel>>
        {
            override fun onFailure(call: Call<List<DataModel>>, t: Throwable) {
                TODO("Not yet implemented")
            }

            override fun onResponse(call: Call<List<DataModel>>,response: Response<List<DataModel>>) {
                dataList.addAll(response!!.body()!!)
                recyclerView.adapter?.notifyDataSetChanged()
            }


        }

        )

    }

}