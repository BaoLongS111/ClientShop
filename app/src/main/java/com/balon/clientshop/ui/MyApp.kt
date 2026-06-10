package com.balon.clientshop.ui
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.balon.clientshop.feature.cart.navigation.cartScreen
import com.balon.clientshop.feature.category.navigation.categoryScreen
import com.balon.clientshop.feature.discovery.navigation.discoveryScreen
import com.balon.clientshop.feature.guide.navigation.guideScreen
import com.balon.clientshop.feature.guide.navigation.navigateToGuide
import com.balon.clientshop.feature.main.navigation.mainScreen
import com.balon.clientshop.feature.main.navigation.navigateToMain
import com.balon.clientshop.feature.me.navigation.meScreen
import com.balon.clientshop.feature.shrotvideo.navigation.shortVideoScreen
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
            toGuide = navController::navigateToGuide,
            toMain = navController::navigateToMain
        )
        guideScreen(
            toBack = navController::popBackStack
        )
        mainScreen()
        shortVideoScreen()
        discoveryScreen()
        cartScreen()
        categoryScreen()
        meScreen()
    }
}