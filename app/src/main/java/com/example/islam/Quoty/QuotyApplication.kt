package com.example.islam.Quoty

import android.app.Application

class QuotyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        Domain.integrateWith(this)
    }
}