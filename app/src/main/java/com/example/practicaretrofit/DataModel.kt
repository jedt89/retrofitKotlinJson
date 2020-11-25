package com.example.practicaretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class DataModel (

     @Expose
     @SerializedName("postId")
     val postId: Integer,

     @Expose
     @SerializedName("id")
     val id: Integer,

     @Expose
     @SerializedName("name")
     val name: String,

     @Expose
     @SerializedName("email")
     val email: String,

     @Expose
     @SerializedName("body")
     val body: String

)