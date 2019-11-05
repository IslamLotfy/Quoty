package com.example.islam.Quoty

import com.example.islam.Quoty.datamodel.QuoteGetResponse
import retrofit2.http.GET

interface QuoteAPIService {
    @GET("qotd")
    suspend fun getTodayQuote(): QuoteGetResponse

}