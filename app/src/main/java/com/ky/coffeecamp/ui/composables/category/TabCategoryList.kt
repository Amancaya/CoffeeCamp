package com.ky.coffeecamp.ui.composables.category

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.ky.coffeecamp.model.Category
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ky.coffeecamp.data.TestData

@Composable
fun TabCategoryList(
    modifier: Modifier = Modifier,
    categories: List<Category>,
    onSelectedCategory: (Category) -> Unit
) {
    var selectedCategory by remember { mutableStateOf(Category.WITH_COFFEE) }

    LazyRow(modifier = modifier.fillMaxWidth()) {
        items(items = categories, key = { it.value }) { category ->
            TabCategory(
                modifier = modifier.padding(start = 16.dp, end = 16.dp),
                category = category,
                isSelected = selectedCategory == category,
                onSelected = { cat ->
                    onSelectedCategory(cat)
                    selectedCategory = cat
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TabCategoryListPreview() {
    TabCategoryList(
        categories = TestData.getCategories(),
        onSelectedCategory = { }
    )
}