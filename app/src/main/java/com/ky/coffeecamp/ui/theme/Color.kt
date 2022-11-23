package com.ky.coffeecamp.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

object CoffeeColors {
    val caf700: Color by lazy { Color(0xFF13131A) }
    val caf600: Color by lazy { Color(0xFF1C1C24) }
    val caf500: Color by lazy { Color(0xFF404040) }
    val caf400: Color by lazy { Color(0xFFBD6E1F) }
    val caf300: Color by lazy { Color(0xFFDCB48D) }
    val caf200: Color by lazy { Color(0xFFDCD6D0) }
    val caf100: Color by lazy { Color(0xFFFAFAFB) }

    val lightColors: Colors by lazy {
        lightColors(
            background = caf100,
            onBackground = caf500,
            onSurface = caf500,
            surface = caf100,
            primary = caf400,
            primaryVariant = caf300
        )
    }

    val darkColors: Colors by lazy {
        darkColors(
            background = caf700,
            onBackground = caf100,
            onSurface = caf200,
            surface = caf600,
            primary = caf400,
            primaryVariant = caf500
        )
    }
}