package com.king.mygitflowtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG ="jin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "onCreate:  develop 修改了。。。")
        Log.e(TAG, "onCreate:  develop 修改了222。。。")
        Log.e(TAG, "onCreate:  release...。")


    }
}