package com.keyflare.podlodkacompose.presentation.common

import androidx.annotation.FloatRange
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.keyflare.podlodkacompose.R
import com.keyflare.podlodkacompose.data.Repository
import com.keyflare.podlodkacompose.domain.Gameplay
import com.keyflare.podlodkacompose.presentation.common.theme.PodlodkaComposeTheme

@Composable
fun GeneralButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
) {
    Button(
        onClick = onClick,
        shape = MaterialTheme.shapes.large,
        modifier = modifier then Modifier.height(64.dp)
    ) {
        Text(text = text)
    }
}

@Composable
fun Chip(
    text: String,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier then Modifier
            .height(22.dp)
            .background(
                color = MaterialTheme.colors.secondary.copy(alpha = 0.2f),
                shape = MaterialTheme.shapes.large
            )
            .padding(horizontal = 10.dp)
    ) {
        Text(
            text = text.uppercase(),
            style = MaterialTheme.typography.h5,
            color = MaterialTheme.colors.secondary
        )
    }
}

@Composable
fun RatingBar(
    @FloatRange(from = 0.0, to = 5.0) value: Float,
    modifier: Modifier = Modifier,
) {
    @Composable
    fun Star(value: Float, modifier: Modifier = Modifier) {
        Box(modifier) {
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = null,
                tint = MaterialTheme.colors.primaryVariant,
            )
            Icon(
                painter = painterResource(id = R.drawable.ic_star),
                contentDescription = null,
                tint = MaterialTheme.colors.primary,
                modifier = Modifier.clip(shape = CropShape(end = value))
            )
        }
    }

    Row(modifier = modifier) {
        repeat(times = 5) { idx ->
            Star(
                value = (value - idx).coerceIn(0f, 1f),
                modifier = Modifier.padding(start = if (idx == 0) 0.dp else 5.dp)
            )
        }
    }
}

@Composable
fun GeneralIconButton(
    onClick: () -> Unit,
    icon: Painter,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier then Modifier
            .size(56.dp)
            .background(
                color = MaterialTheme.colors.secondaryVariant.copy(alpha = 0.5f),
                shape = RoundedCornerShape(28.dp)
            ),
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = MaterialTheme.colors.secondaryVariant
        )
    }
}

@Composable
fun GameplayGallery(
    gameplay: Gameplay,
    modifier: Modifier = Modifier
) {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 24.dp),
        modifier = modifier
    ) {
        gameplay.screenshots.forEach {
            item {
                Image(
                    painter = rememberImagePainter(
                        data = it,
                        builder = {
                            placeholder(R.color.gray_dark)
                            fallback(R.color.gray_dark)
                        },
                    ),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(end = 16.dp)
                        .size(240.dp, 128.dp)
                        .clip(shape = RoundedCornerShape(14.dp))
                )
            }
        }
    }
}

@Composable
@Preview
private fun Preview() {
    PodlodkaComposeTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.background(color = MaterialTheme.colors.background)
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                GeneralButton(
                    onClick = {},
                    text = "Install",
                    modifier = Modifier.padding(8.dp)
                )
                Chip(
                    text = "multiplayer",
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                RatingBar(
                    value = 2.6f,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
                Row {
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_button_preview_background),
                            contentDescription = null,
                            modifier = Modifier.size(64.dp)
                        )
                        GeneralIconButton(
                            onClick = {},
                            icon = painterResource(id = R.drawable.ic_back),
                        )
                    }
                    Box(contentAlignment = Alignment.Center) {
                        Image(
                            painter = painterResource(id = R.drawable.icon_button_preview_background),
                            contentDescription = null,
                            modifier = Modifier.size(64.dp)
                        )
                        GeneralIconButton(
                            onClick = {},
                            icon = painterResource(id = R.drawable.ic_back),
                        )
                    }
                }
            }
        }
    }
}

@Preview
@Composable
private fun GameplayGalleryPreview() {
    PodlodkaComposeTheme {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            GameplayGallery(
                gameplay = Repository.loadGame().gameplay,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}
