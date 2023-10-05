package com.example.databindingmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData

class CounterViewModel : ViewModel() {
    private val _counter = MutableLiveData<Int>()
    val counter: LiveData<Int> = _counter

    init {
        _counter.value = 0
    }

    fun incrementCounter() {
        _counter.value = _counter.value?.plus(1)
    }

    fun decrementCounter() {
        _counter.value = _counter.value?.minus(1)
    }
}
