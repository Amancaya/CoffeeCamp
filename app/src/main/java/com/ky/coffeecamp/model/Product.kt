package com.ky.coffeecamp.model

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Product(
    val title: String,
    val description: String,
    val price: String,
    val category: Category,
    @DrawableRes val photo: Int
)
