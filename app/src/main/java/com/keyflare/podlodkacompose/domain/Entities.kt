package com.keyflare.podlodkacompose.domain

import android.net.Uri

data class GameDetails(
    val cover: Uri,
    val icon: Uri,
    val title: String,
    val rating: Rating,
    val tags: List<String>,
    val description: String,
    val gameplay: Gameplay,
    val comments: List<Comment>
)

data class Rating(
    val value: Float,
    val reviewersNumber: String
)

data class Gameplay(
    val video: Uri,
    val screenshots: List<Uri>
)

data class Comment(
    val avatar: Uri,
    val name: String,
    val date: String,
    val comment: String
)
