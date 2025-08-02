package com.spark.features.home

import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CounterScreen(
    modifier: Modifier = Modifier,
    counterScreenViewModel: CounterScreenViewModel
) {
    val count = counterScreenViewModel.counter.value

    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(24.dp),

        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Count: $count", style = MaterialTheme.typography.headlineMedium)

            Spacer(modifier = Modifier.height(16.dp))

            Button(onClick = { counterScreenViewModel.increment() }) {
                Text("Increment")
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { counterScreenViewModel.decrement() }) {
                Text("Decrement")
            }
        }


    }

}
