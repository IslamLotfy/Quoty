package com.example.islam.Quoty

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.islam.Quoty.dao.QuoteDao
import com.example.islam.Quoty.datamodel.Quote

@Database(entities = [Quote::class],version = 1)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun quoteDao() : QuoteDao
}