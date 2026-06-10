package com.balon.clientshop.feature.guide.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.balon.clientshop.feature.guide.GuideRoute
import com.balon.clientshop.feature.splash.navigation.SPLASH_ROUTE
import com.balon.clientshop.ui.navigation.myComposable

const val GUIDE_ROUTE = "guide"

fun NavController.navigateToGuide() {
    navigate(GUIDE_ROUTE){
        launchSingleTop = true
        popUpTo(SPLASH_ROUTE){
            // 包括启动界面
            inclusive = true
        }
    }
}

fun NavGraphBuilder.guideScreen(
    toBack: () -> Unit
) {
    myComposable(GUIDE_ROUTE) {
        GuideRoute(
            toBack = toBack
        )
    }
}