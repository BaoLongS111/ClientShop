package com.balon.clientshop.feature.cart.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.feature.cart.CartRoute
import com.balon.clientshop.ui.navigation.myComposable

const val CART_ROUTE = "cart"
fun NavController.navigationToCart() {
    navigate(CART_ROUTE)
}

fun NavGraphBuilder.cartScreen() {
    myComposable(
        CART_ROUTE
    ) {
        CartRoute()
    }
}