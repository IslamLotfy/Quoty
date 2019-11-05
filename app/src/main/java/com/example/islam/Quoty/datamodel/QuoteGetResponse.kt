package com.example.islam.Quoty.datamodel


import com.google.gson.annotations.SerializedName

data class QuoteGetResponse(
    @SerializedName("qotd_date")
    val qotdDate: String,
    @SerializedName("quote")
    val quote: Quote
)