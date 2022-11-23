package com.ky.coffeecamp

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ky.coffeecamp.data.TestData
import com.ky.coffeecamp.ui.composables.category.TabCategoryList
import com.ky.coffeecamp.ui.composables.product.ProductList
import com.ky.coffeecamp.ui.composables.selector.SelectorListAppearance
import com.ky.coffeecamp.ui.model.SelectorType
import com.ky.coffeecamp.ui.theme.CoffeeCampTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoffeeCampTheme {
                CoffeeCampScreen()
            }
        }
    }
}

@Composable
fun CoffeeCampScreen() {
    val context: Context = LocalContext.current
    val selectedType = remember { mutableStateOf(SelectorType.LIST) }

    Scaffold(
        topBar = {
            Text(
                text = stringResource(id = R.string.title_top_bar),
                modifier = Modifier.padding(top = 10.dp, start = 16.dp),
                style = MaterialTheme.typography.h1
            )
        },
        content = {
            Column(
                modifier = Modifier.background(MaterialTheme.colors.background)
            ) {
                TabCategoryList(
                    modifier = Modifier.padding(top = 20.dp),
                    categories = TestData.getCategories(),
                    onSelectedCategory = {
                        Toast.makeText(context, context.getString(it.value), Toast.LENGTH_SHORT).show()
                    }
                )
                SelectorListAppearance(
                    modifier = Modifier
                        .padding(top = 6.dp)
                        .fillMaxWidth(),
                    selectorType = selectedType.value,
                    onSelected = { selectorType -> selectedType.value = selectorType }
                )
                ProductList(
                    isListSelected = selectedType.value == SelectorType.LIST,
                    products = TestData.getProducts(),
                    onAddProduct = {
                        Toast.makeText(context, it.title, Toast.LENGTH_SHORT).show()
                    }
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoffeeCampTheme {
        CoffeeCampScreen()
    }
}