package com.spark.features.home

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CounterScreenViewModel @Inject constructor() : ViewModel() {

    private val _counter: MutableState<Int> = mutableIntStateOf(0)
     val counter: State<Int> = _counter

     fun increment(){
        _counter.value++
         Log.d("srikar", "CounterScreenViewModel: ${_counter.value}")
    }
     fun decrement(){
        _counter.value--
    }

}