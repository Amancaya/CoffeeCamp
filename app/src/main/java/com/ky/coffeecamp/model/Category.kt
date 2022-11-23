package com.ky.coffeecamp.model

import androidx.annotation.StringRes
import com.ky.coffeecamp.R

enum class Category(
   @StringRes val value: Int
) {
    WITH_COFFEE(R.string.category_with_coffee),
    WITHOUT_COFFEE(R.string.category_without_coffee),
    DESSERT(R.string.category_desserts)
}