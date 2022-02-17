package com.keyflare.podlodkacompose.presentation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.google.accompanist.insets.statusBarsPadding
import com.keyflare.podlodkacompose.R
import com.keyflare.podlodkacompose.data.Repository
import com.keyflare.podlodkacompose.domain.Comment
import com.keyflare.podlodkacompose.domain.GameDetails
import com.keyflare.podlodkacompose.presentation.common.*
import com.keyflare.podlodkacompose.presentation.common.theme.BlueDark
import com.keyflare.podlodkacompose.presentation.common.theme.PodlodkaComposeTheme

@Composable
fun GameDetailsScreen(game: GameDetails) {
    Box(Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .background(color = MaterialTheme.colors.background)
                .verticalScroll(state = rememberScrollState())
        ) {
            // Cover
            Box {
                Image(
                    painter = rememberImagePainter(
                        data = game.cover,
                        builder = { placeholder(R.color.gray_dark) }
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(375f / 327)
                )
                Image(
                    painter = painterResource(id = R.drawable.top_bar_tint),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(126.dp)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .offset(y = (-32).dp)
                    .background(
                        color = MaterialTheme.colors.background,
                        shape = RoundedCornerShape(
                            topStart = 28.dp,
                            topEnd = 28.dp,
                            bottomStart = 0.dp,
                            bottomEnd = 0.dp,
                        )
                    )
            ) {
                // Icon
                Icon(
                    painter = rememberImagePainter(data = game.icon),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier
                        .padding(start = 24.dp)
                        .size(88.dp)
                        .offset(y = -(22).dp)
                        .background(
                            color = MaterialTheme.colors.surface,
                            shape = RoundedCornerShape(13.5.dp)
                        )
                        .border(
                            border = BorderStroke(2.dp, BlueDark),
                            shape = RoundedCornerShape(13.5.dp)
                        )
                        .padding(18.dp)
                )
                // Content
                Column(Modifier.fillMaxWidth()) {
                    // Header
                    Column(modifier = Modifier.padding(start = 124.dp)) {
                        Text(
                            text = game.title,
                            style = MaterialTheme.typography.h2,
                            color = MaterialTheme.colors.secondaryVariant,
                            modifier = Modifier.padding(top = 14.dp)
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(top = 6.dp)
                        ) {
                            RatingBar(value = game.rating.value)
                            Text(
                                text = game.rating.reviewersNumber,
                                style = MaterialTheme.typography.h6,
                                color = MaterialTheme.colors.primaryVariant,
                                modifier = Modifier.padding(bottom = 0.dp, start = 10.dp)
                            )
                        }
                    }
                    // Tags
                    Row(modifier = Modifier.padding(start = 24.dp, top = 32.dp)) {
                        game.tags.forEach {
                            Chip(
                                text = it,
                                modifier = Modifier.padding(end = 10.dp)
                            )
                        }
                    }
                    // Description
                    Text(
                        text = game.description,
                        style = MaterialTheme.typography.body1,
                        color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f),
                        modifier = Modifier.padding(24.dp)
                    )
                    // Gallery
                    GameplayGallery(game.gameplay)
                    // Rating
                    Text(
                        text = "Review & Ratings",
                        style = MaterialTheme.typography.h3,
                        color = MaterialTheme.colors.secondaryVariant,
                        modifier = Modifier.padding(top = 24.dp, start = 24.dp)
                    )
                    Row(
                        verticalAlignment = Alignment.Bottom,
                        modifier = Modifier.padding(top = 14.dp, bottom = 26.dp)
                    ) {
                        Text(
                            text = game.rating.value.toString(),
                            style = MaterialTheme.typography.h1,
                            color = MaterialTheme.colors.secondaryVariant,
                            modifier = Modifier.padding(top = 0.dp, start = 24.dp)
                        )
                        Column(
                            verticalArrangement = Arrangement.Bottom,
                            modifier = Modifier.padding(start = 16.dp)
                        ) {
                            RatingBar(value = game.rating.value)
                            Text(
                                text = "${game.rating.reviewersNumber} Reviews",
                                style = MaterialTheme.typography.h6,
                                color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f),
                                modifier = Modifier.padding(vertical = 8.dp)
                            )
                        }
                    }
                    // Comments
                    game.comments.forEachIndexed { idx, comment ->
                        CommentCard(
                            comment = comment,
                            modifier = Modifier.padding(
                                start = 24.dp,
                                end = 24.dp,
                                bottom = 24.dp,
                                top = if (idx != 0) 24.dp else 0.dp
                            )
                        )
                        if (idx != game.comments.lastIndex) {
                            Divider(
                                modifier = Modifier.padding(horizontal = 38.dp),
                                color = BlueDark.copy(alpha = 0.4f)
                            )
                        }
                    }

                    Spacer(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(98.dp)
                    )
                }
            }
        }
        // Top bar
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .statusBarsPadding()
                .padding(top = 26.dp)
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        ) {
            GeneralIconButton(onClick = {}, icon = painterResource(id = R.drawable.ic_back))
            GeneralIconButton(onClick = {}, icon = painterResource(id = R.drawable.ic_menu))
        }
        // Bottom bar
        Box(
            contentAlignment = Alignment.BottomCenter,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(
                painter = painterResource(id = R.drawable.bottom_bar_tint),
                contentDescription = null,
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(153.dp)
            )
            GeneralButton(
                onClick = {}, text = "Install",
                modifier = Modifier
                    .padding(horizontal = 24.dp, vertical = 40.dp)
                    .fillMaxWidth()
            )
        }
    }
}

@Composable
fun CommentCard(comment: Comment, modifier: Modifier = Modifier) {
    Box(modifier = modifier) {
        Column {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = rememberImagePainter(data = comment.avatar),
                    contentDescription = null,
                    modifier = Modifier
                        .size(36.dp)
                        .clip(shape = RoundedCornerShape(18.dp))
                )
                Column(Modifier.padding(start = 16.dp)) {
                    Text(
                        text = comment.name,
                        style = MaterialTheme.typography.h4,
                        color = MaterialTheme.colors.secondaryVariant,
                        modifier = Modifier.padding(bottom = 6.dp)
                    )
                    Text(
                        text = comment.date,
                        style = MaterialTheme.typography.h6,
                        color = MaterialTheme.colors.onSurface,
                    )
                }
            }
            Text(
                modifier = Modifier.padding(top = 16.dp),
                text = "\"${comment.comment}\"",
                style = MaterialTheme.typography.body1,
                color = MaterialTheme.colors.onBackground.copy(alpha = 0.7f),
            )
        }
    }
}

@Composable
@Preview(showSystemUi = true)
private fun Preview() {
    val game = Repository.loadGame()
    PodlodkaComposeTheme {
        GameDetailsScreen(game = game)
    }
}

@Preview
@Composable
fun CommentCardPreview() {
    PodlodkaComposeTheme {
        Box(modifier = Modifier.background(color = MaterialTheme.colors.background)) {
            CommentCard(comment = Repository.loadGame().comments[0])
        }
    }
}
