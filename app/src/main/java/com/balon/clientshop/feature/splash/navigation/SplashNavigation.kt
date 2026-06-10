package com.balon.clientshop.feature.splash.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.balon.clientshop.feature.splash.SplashRoute
import com.balon.clientshop.ui.navigation.myComposable

const val SPLASH_ROUTE = "splash"

/**
 * 跳转到Splash页面
 */
fun NavController.navigateToSplash() {
    navigate(SPLASH_ROUTE)
}

/**
 * Splash页面
 */
fun NavGraphBuilder.splashScreen(
    toGuide: () -> Unit
) {
    myComposable(SPLASH_ROUTE) {
        SplashRoute(
            toGuide = toGuide
        )
    }
}