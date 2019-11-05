package com.example.islam.Quoty

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private val retrofit: Retrofit by lazy {
    Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://favqs.com/api/")
            .build()
}

val quoteAPIService by lazy {
    retrofit.create(QuoteAPIService::class.java)
}