package com.keyflare.podlodkacompose.presentation.common.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.keyflare.podlodkacompose.R

private val SkModernist = FontFamily(
    Font(R.font.sk_modernist_regular, FontWeight.Normal),
    Font(R.font.sk_modernist_bold, FontWeight.Bold),
)

val Typography = Typography(
    h1 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
    ),
    h2 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.5.sp
    ),
    h3 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        letterSpacing = 0.6.sp
    ),
    h4 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        letterSpacing = 0.5.sp
    ),
    h5 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        letterSpacing = 0.7.sp
    ),
    h6 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        letterSpacing = 0.5.sp
    ),
    body1 = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp
    ),
    button = TextStyle(
        fontFamily = SkModernist,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        letterSpacing = 0.6.sp
    ),
)
