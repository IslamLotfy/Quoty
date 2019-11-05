package com.example.islam.Quoty.datamodel

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "quote_table")
data class Quote(
    @SerializedName("author")
    var author: String = "",
    @SerializedName("author_permalink")
    var authorPermalink: String = "",
    @SerializedName("body")
    var body: String = "",
    @SerializedName("dialogue")
    var dialogue: Boolean = false,
    @SerializedName("downvotes_count")
    var downvotesCount: Int = 0,
    @SerializedName("favorites_count")
    var favoritesCount: Int = 0,
    @PrimaryKey
    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("private")
    var `private`: Boolean = false,
    @Ignore
    @SerializedName("tags")
    var tags: List<String> = listOf(),
    @SerializedName("upvotes_count")
    var upvotesCount: Int = 0,
    @SerializedName("url")
    var url: String = ""
)