package com.ky.coffeecamp.ui.composables.product

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.ky.coffeecamp.model.Product
import com.ky.coffeecamp.R
import com.ky.coffeecamp.model.Category

@OptIn(ExperimentalUnitApi::class)
@Composable
fun ProductListItem(
    modifier: Modifier = Modifier,
    product: Product,
    onAddProduct: (Product) -> Unit
) {
    Card(
        modifier = modifier.fillMaxWidth().padding(top = 12.dp, end = 25.dp, start = 25.dp, bottom = 12.dp),
        elevation = 8.dp
    ) {
        ConstraintLayout(
            modifier = Modifier.padding(10.dp)
        ) {
            val (image, title, price, description, addButton) = createRefs()

            Image(
                modifier = Modifier
                    .width(80.dp)
                    .constrainAs(image){
                        top.linkTo(parent.top)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                    }.aspectRatio(1f)
                    .clip(RoundedCornerShape(15.dp)),
                painter = painterResource(id = product.photo),
                contentDescription = product.title,
                contentScale = ContentScale.FillBounds
            )

            Text(
                text = product.title,
                fontWeight = FontWeight.Bold,
                fontSize = TextUnit(14f, TextUnitType.Sp),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(title){
                    top.linkTo(parent.top)
                    start.linkTo(image.end, margin = 15.dp)
                    end.linkTo(parent.end)

                    width = Dimension.preferredWrapContent
                    height = Dimension.preferredWrapContent
                }
            )

            Text(
                text = product.price,
                fontSize = TextUnit(14f, TextUnitType.Sp),
                modifier = Modifier.constrainAs(price) {
                    top.linkTo(title.bottom)
                    start.linkTo(image.end, margin = 15.dp)
                }
            )

            Box(
                modifier = Modifier
                    .constrainAs(addButton) {
                        bottom.linkTo(image.bottom)
                        end.linkTo(parent.end)
                    }
                    .padding(top = 10.dp, start = 10.dp)
                    .clickable { onAddProduct(product) }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_add),
                    contentDescription = stringResource(id = R.string.content_description_add_coffee)
                )
            }

            Text(
                text = product.description,
                fontSize = TextUnit(13f, TextUnitType.Sp),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                modifier = Modifier
                    .constrainAs(description) {
                        start.linkTo(image.end, margin = 15.dp)
                        end.linkTo(addButton.start, margin = 8.dp)
                        bottom.linkTo(image.bottom)

                        width = Dimension.preferredWrapContent
                        height = Dimension.preferredWrapContent
                    }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProductListItemPreview(){
    ProductListItem(
        product = Product(
            title = "Lorem",
            price = "20Bs",
            description ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. jchgchcchgchgchgc jhvjvjhv",
            photo = R.drawable.coffee_img,
            category = Category.WITHOUT_COFFEE,
        ),
        onAddProduct = {}
    )
}