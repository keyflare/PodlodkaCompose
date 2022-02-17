package com.keyflare.podlodkacompose

import android.os.Build
import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import com.google.accompanist.insets.ProvideWindowInsets
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.keyflare.podlodkacompose.data.Repository
import com.keyflare.podlodkacompose.presentation.GameDetailsScreen
import com.keyflare.podlodkacompose.presentation.common.theme.PodlodkaComposeTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.setDecorFitsSystemWindows(false)
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
            )
        }

        super.onCreate(savedInstanceState)

        setContent {
            PodlodkaComposeTheme {
                with(rememberSystemUiController()) {
                    SideEffect {
                        setSystemBarsColor(
                            color = Color.Transparent,
                            darkIcons = false
                        )
                    }
                }

                ProvideWindowInsets {
                    GameDetailsScreen(Repository.loadGame())
                }
            }
        }
    }
}
