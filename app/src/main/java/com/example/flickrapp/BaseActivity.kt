package com.example.flickrapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.View


internal const val FLICKR_QUERY = "FLICK_QUERY"
internal const val PHOTO_TRANSFER = "PHOTO_TRANSFER"

@SuppressLint("Registered")
open class BaseActivity : AppCompatActivity() {
    private val TAG = "BaseActivity"

    internal fun activateToolbar(enableHome: Boolean) {
        Log.d(TAG, ".activateToolbar")

        var toolbar = findViewById<View>(R.id.toolbar) as androidx.appcompat.widget.Toolbar
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(enableHome)
    }
}