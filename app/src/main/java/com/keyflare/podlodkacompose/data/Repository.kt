package com.keyflare.podlodkacompose.data

import android.net.Uri
import com.keyflare.podlodkacompose.domain.Comment
import com.keyflare.podlodkacompose.domain.GameDetails
import com.keyflare.podlodkacompose.domain.Gameplay
import com.keyflare.podlodkacompose.domain.Rating

object Repository {

    private val dota = GameDetails(
        cover = Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/dota_cover.png?raw=true"),
        icon = Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/dota_logo.jpg?raw=true"),
        title = "DoTA 2",
        rating = Rating(
            value = 3.7f,
            reviewersNumber = "70M"
        ),
        tags = listOf("moba", "multiplayer", "strategy"),
        description = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
        gameplay = Gameplay(
            Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/dota_video_cover.png?raw=true"),
            listOf(
                Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/dota_screenshot.png?raw=true"),
            )
        ),
        comments = listOf(
            Comment(
                avatar = Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/avatar_male.jpg?raw=true"),
                name = "John Johnovich",
                date = "February 14, 2021",
                comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            ),
            Comment(
                avatar = Uri.parse("https://github.com/keyflare/PodlodkaCompose/blob/master/media_store/avatar_female.jpg?raw=true"),
                name = "Mary Marinovna",
                date = "February 15, 2021",
                comment = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            )
        )
    )

    fun loadGame() = dota
}
