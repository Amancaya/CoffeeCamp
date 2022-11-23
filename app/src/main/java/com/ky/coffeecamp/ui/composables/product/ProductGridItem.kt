package com.ky.coffeecamp.ui.composables.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ky.coffeecamp.model.Product
import com.ky.coffeecamp.R
import com.ky.coffeecamp.model.Category

@Composable
fun ProductGridItem(
    modifier: Modifier = Modifier,
    product: Product,
    onAddProduct: (Product) -> Unit
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 15.dp, vertical = 12.dp),
        elevation = 8.dp
    ) {
        Column(modifier = Modifier.padding(10.dp)) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
                    .clip(RoundedCornerShape(15.dp)),
                painter = painterResource(id = product.photo),
                contentDescription = product.title,
                contentScale = ContentScale.FillBounds
            )

            Row(
                modifier = Modifier.padding(top = 10.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column(modifier = Modifier.weight(1f)) {
                   Text(
                       text = product.title,
                       fontWeight = FontWeight.Bold,
                       overflow = TextOverflow.Ellipsis,
                       maxLines = 1
                   )
                   Text(
                       text = product.price,
                   )
                }
                Image(
                    modifier = Modifier
                        .align(Alignment.Bottom)
                        .size(25.dp)
                        .clickable {
                             onAddProduct(product)
                        },
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = stringResource(id = R.string.content_description_add_coffee)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductGridItemPreview() {
    ProductGridItem(
        product = Product(
            title ="Lorem",
            price ="20Bs",
            description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. jchgchcchgchgchgc jhvjvjhv",
            photo = R.drawable.coffee_img,
            category = Category.WITHOUT_COFFEE
        ),
        onAddProduct = { }
    )
}
