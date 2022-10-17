package com.king.mygitflowtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG ="jin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "onCreate:  rss-feed")
        Log.e(TAG, "onCreate:  release 1.1.5")
        Log.e(TAG, "onCreate:  release hot")

        Log.e(TAG, "onCreate:  release 2.0.0")
        Log.e(TAG, "onCreate:  release 2.0.1")

    }
}