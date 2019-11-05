package com.example.islam.Quoty

import androidx.room.Room

private val quoteDatabase: QuoteDatabase by lazy {
    Room.databaseBuilder(Domain.application, QuoteDatabase::class.java, "quotes.db").build()
}

val quoteDao by lazy {
    quoteDatabase.quoteDao()
}