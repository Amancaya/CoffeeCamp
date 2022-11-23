package com.ky.coffeecamp.ui.composables.selector

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.ky.coffeecamp.R

@Composable
fun GridSelector(
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    onSelect: () -> Unit
) {
    val painter = when {
        isSelected -> painterResource(id = R.drawable.ic_grid_selected)
        else -> painterResource(id = R.drawable.ic_grid_unselected)
    }

    val contentDescription = when {
         isSelected -> stringResource(R.string.content_description_grid, stringResource(R.string.option_selected))
        else -> stringResource(R.string.content_description_grid, stringResource(R.string.option_unselected))
    }

    Selector(
        modifier = modifier,
        painter = painter,
        contentDescription = contentDescription,
        onSelected = onSelect
    )
}