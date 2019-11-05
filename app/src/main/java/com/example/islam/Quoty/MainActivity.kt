package com.example.islam.Quoty

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.islam.Quoty.dao.QuoteDao
import com.example.islam.eventfinder.R
import io.reactivex.disposables.Disposable

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private var disposable: Disposable? = null

    private val quoteRemoteDataSource: QuoteAPIService = quoteAPIService
    private val quoteLocalDataSource: QuoteDao = quoteDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.setOnClickListener {



        }

        fab.setOnClickListener { view ->
            getQuote()
        }

    }

    private fun getQuote() {
       GlobalScope.launch{
           val quote = quoteRemoteDataSource.getTodayQuote().quote
           Log.e("quooote",quote.toString())
       }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
