package com.keyflare.podlodkacompose.presentation.common

import androidx.annotation.FloatRange
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

class CropShape(
    @FloatRange(from = 0.0, to = 1.0) private val start: Float = 0f,
    @FloatRange(from = 0.0, to = 1.0) private val end: Float = 1f,
    @FloatRange(from = 0.0, to = 1.0) private val top: Float = 0f,
    @FloatRange(from = 0.0, to = 1.0) private val bottom: Float = 1f,
) : Shape {
    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density) =
        Outline.Rectangle(
            Rect(
                left = (start * size.width),
                top = (top * size.height),
                right = (end * size.width),
                bottom = (bottom * size.height)
            )
        )
}
