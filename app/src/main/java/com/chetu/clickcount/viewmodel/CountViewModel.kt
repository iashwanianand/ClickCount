package com.chetu.clickcount.viewmodel

import androidx.lifecycle.ViewModel

class CountViewModel : ViewModel() {

    var clickCount = 0

    fun getCount(): Int {
        return clickCount
    }

    fun addCount(): Int {
        return ++clickCount
    }

    fun resetCount(): Int {
        clickCount = 0
        return clickCount
    }
}