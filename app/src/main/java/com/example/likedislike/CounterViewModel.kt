package com.example.likedislike

import android.util.Log
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    var countLike: Int = 0
    var countDislike: Int = 0

    init {
        Log.d("CounterViewModel","ViewModel created")
    }

    override fun onCleared() {
        Log.d("CounterViewModel","ViewModel destroyed")
        super.onCleared()
    }
}