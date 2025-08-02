package com.spark.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.spark.app.ui.theme.PrxTheme
import com.spark.features.home.CounterScreen
import com.spark.features.home.CounterScreenViewModel

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrxTheme {
                val counterScreenViewModel: CounterScreenViewModel = viewModel()
                CounterScreen(
                    modifier = Modifier.fillMaxSize(),
                    counterScreenViewModel = counterScreenViewModel
                )
            }
        }
    }
}

