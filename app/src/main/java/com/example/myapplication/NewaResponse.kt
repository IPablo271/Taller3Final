package com.example.myapplication
import com.google.gson.annotations.SerializedName

data class NewaResponse(@SerializedName("status")val status:String,
                        @SerializedName("totalResults")val totalResults:String,
                        @SerializedName("articles")val articles:List<Articles>
)