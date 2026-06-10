package com.balon.clientshop.feature.cart

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun CartRoute(){
    CartScreen()
}

@Composable
fun CartScreen() {
    Text(text = "购物车页面购物车页面购物车页面购物车页面购物车页面购物车页面")
}

@Preview
@Composable
fun CartScreenPreview(){
    MyAppTheme {
        CartScreen()
    }
}