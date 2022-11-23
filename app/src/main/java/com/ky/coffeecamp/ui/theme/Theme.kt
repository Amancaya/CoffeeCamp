package com.ky.coffeecamp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

@Composable
fun CoffeeCampTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        CoffeeColors.darkColors
    } else {
        CoffeeColors.lightColors
    }

    MaterialTheme(
        colors = colors,
        typography = CoffeeTypography.Typography,
        shapes = Shapes,
        content = content
    )
}