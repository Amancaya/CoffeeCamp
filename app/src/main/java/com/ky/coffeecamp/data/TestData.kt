package com.ky.coffeecamp.data

import com.ky.coffeecamp.R
import com.ky.coffeecamp.model.Category
import com.ky.coffeecamp.model.Product

object TestData {

    fun getProducts(): List<Product> = listOf(
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
        Product("EXPRESSO", "20Bs", "Lorem ipsum dolor sit amet, consectetur adipiscing elit.", Category.WITH_COFFEE, R.drawable.coffee_img),
    )

    fun getCategories(): List<Category> = Category.values().toList()
}