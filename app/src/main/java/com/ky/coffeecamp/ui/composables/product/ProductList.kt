package com.ky.coffeecamp.ui.composables.product

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.ky.coffeecamp.data.TestData
import com.ky.coffeecamp.model.Product
import com.ky.coffeecamp.ui.theme.CoffeeCampTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductList(
    modifier: Modifier = Modifier,
    isListSelected: Boolean,
    products: List<Product>,
    onAddProduct: (Product) -> Unit
) {
    if (isListSelected) {
        LazyColumn {
            items(items = products) { product ->
                ProductListItem(
                    modifier = modifier,
                    product = product,
                    onAddProduct = onAddProduct
                )
            }
        }
    } else {
        LazyVerticalGrid(cells = GridCells.Fixed(2)) {
            items(items = products) { product ->
                ProductGridItem(
                    modifier = modifier,
                    product = product,
                    onAddProduct = onAddProduct
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductListPreview() {
    CoffeeCampTheme {
        ProductList(isListSelected = false, products = TestData.getProducts(), onAddProduct = {})
    }
}