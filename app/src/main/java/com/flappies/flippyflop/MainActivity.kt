package com.flappies.flippyflop

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.flappies.flippyflop.ui.FlippyFlopApp
import com.flappies.flippyflop.ui.theme.FlippyFlopTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FlippyFlopTheme {
                FlippyFlopApp()
            }
        }
    }
}