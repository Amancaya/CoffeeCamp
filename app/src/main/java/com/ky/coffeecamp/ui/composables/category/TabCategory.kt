package com.ky.coffeecamp.ui.composables.category

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ky.coffeecamp.model.Category
import com.ky.coffeecamp.ui.theme.CoffeeColors

@Composable
fun TabCategory(
    modifier: Modifier = Modifier,
    category: Category,
    isSelected: Boolean,
    onSelected: (Category) -> Unit
) {
    val color = if(isSelected) CoffeeColors.caf400 else CoffeeColors.caf300
    Column(
        modifier = modifier
            .width(IntrinsicSize.Max)
            .clickable { onSelected(category) }
    ) {
        Text(
            text = stringResource(id = category.value),
            color = color,
            fontWeight = if(isSelected) FontWeight.Bold else FontWeight.Normal
        )
        if(isSelected) {
            Divider(
                modifier = Modifier
                    .padding(top = 4.dp)
                    .clip(RoundedCornerShape(24.dp)),
                thickness = 2.dp,
                color = color
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabCategorySelectedPreview(){
    TabCategory(
        category = Category.WITH_COFFEE,
        isSelected = true,
        onSelected = {}
    )
}

@Preview(showBackground = true)
@Composable
fun TabCategoryPreview(){
    TabCategory(
        category = Category.WITH_COFFEE,
        isSelected = false,
        onSelected = {}
    )
}