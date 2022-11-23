package com.ky.coffeecamp.ui.composables.selector

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ky.coffeecamp.ui.composables.selector.GridSelector
import com.ky.coffeecamp.ui.composables.selector.ListSelector
import com.ky.coffeecamp.ui.model.SelectorType

@Composable
fun SelectorListAppearance(
    modifier: Modifier = Modifier,
    selectorType: SelectorType,
    onSelected: (SelectorType) -> Unit
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.End
    ) {

        ListSelector(
            isSelected = selectorType == SelectorType.LIST,
            onSelect = { onSelected(SelectorType.LIST) }
        )

        GridSelector(
            isSelected = selectorType == SelectorType.GRID,
            onSelect = { onSelected(SelectorType.GRID) }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SelectorListAppearancePreview() {
    SelectorListAppearance(
        selectorType = SelectorType.GRID,
        onSelected = { }
    )
}