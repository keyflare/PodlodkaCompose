package com.keyflare.podlodkacompose.presentation.common.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Yellow,
    primaryVariant = GrayDark,
    secondary = Blue,
    secondaryVariant = White,
    background = AlmostBlack,
    surface = Black,
    onPrimary = AlmostBlack,
    onBackground = GrayLite,
    onSurface = Gray
)

private val LightColorPalette = DarkColorPalette

@Composable
fun PodlodkaComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
