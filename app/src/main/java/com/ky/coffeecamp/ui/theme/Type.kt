package com.ky.coffeecamp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.ky.coffeecamp.R


object CoffeeTypography {
    val prompt = FontFamily(
        Font(R.font.prompt_bold, FontWeight.Bold),
        Font(R.font.prompt_semi_bold, FontWeight.SemiBold)
    )

    val Typography by lazy {
        Typography(
            h1 = TextStyle(
                fontFamily = prompt,
                fontWeight = FontWeight.W700,
                fontSize = 20.sp
            ),
            h2 = TextStyle(
                fontFamily = prompt,
                fontWeight = FontWeight.W600,
                fontSize = 14.sp
            ),
            h3 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp
            ),
            h4 = TextStyle(
                fontFamily = FontFamily.Default,
                fontWeight = FontWeight.W300,
                fontSize = 13.sp
            )
        )
    }
}