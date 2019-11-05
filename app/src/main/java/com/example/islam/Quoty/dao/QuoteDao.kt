package com.example.islam.Quoty.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.islam.Quoty.datamodel.Quote

@Dao
interface QuoteDao {

    @Insert
    fun insertCity(quote: Quote)
    @Query("Delete FROM quote_table")
    fun deleteAllCities():Int
    @Query ("SELECT * FROM quote_table WHERE id=:city_id")
    fun getQuoteById(city_id: Int): Quote
    @Query ("SELECT * FROM quote_table")
    fun getAllQuotes(): List<Quote>

}