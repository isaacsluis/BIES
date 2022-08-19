package com.example.bies.ui.screens.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bies.ui.theme.BIESTheme
import com.google.firebase.analytics.FirebaseAnalytics

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // Eventos personalizados a Google Analitics

        val analitics = FirebaseAnalytics.getInstance(this)
        val bundle = Bundle()
        bundle.putString ("message", "Intregracion de Firebase Completa")
        analitics.logEvent("InitScreen", bundle)

        super.onCreate(savedInstanceState)
        setContent {
            BIESTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name! + hola")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BIESTheme {
        Greeting("Android")
    }
}