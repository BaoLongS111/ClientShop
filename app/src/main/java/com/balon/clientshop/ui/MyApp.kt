package com.balon.clientshop.ui
import com.balon.clientshop.feature.splash.SplashRoute
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.balon.clientshop.feature.guide.GuideRoute
import com.balon.clientshop.feature.guide.navigation.guideScreen
import com.balon.clientshop.feature.guide.navigation.navigateToGuide
import com.balon.clientshop.feature.splash.navigation.SPLASH_ROUTE
import com.balon.clientshop.feature.splash.navigation.splashScreen

/**
 * 全局功能
 */
@Composable
fun MyApp(){
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination= SPLASH_ROUTE){
        splashScreen(
            toGuide = navController::navigateToGuide
        )
        guideScreen(
            toBack = navController::popBackStack
        )
    }
}