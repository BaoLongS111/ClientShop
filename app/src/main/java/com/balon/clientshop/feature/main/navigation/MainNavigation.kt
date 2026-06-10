package com.balon.clientshop.feature.main.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.ui.navigation.myComposable

const val MAIN_ROUTE = "main"

fun NavController.navigateToMain() {
    navigate(MAIN_ROUTE){
        launchSingleTop = true
        popUpTo(MAIN_ROUTE)
    }
}

fun NavGraphBuilder.mainScreen() {
    myComposable(
        MAIN_ROUTE
    ) {
        MainRoute()
    }
}