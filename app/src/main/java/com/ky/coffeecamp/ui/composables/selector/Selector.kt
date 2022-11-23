package com.ky.coffeecamp.ui.composables.selector

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun Selector(
    modifier: Modifier = Modifier,
    painter: Painter,
    contentDescription: String,
    onSelected: () -> Unit
) {
    Box(
        modifier = modifier.padding(16.dp).clickable { onSelected() }
    ) {
        Image(
            painter = painter,
            contentDescription = contentDescription
        )
    }
}