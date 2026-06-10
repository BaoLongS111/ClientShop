package com.balon.clientshop.ui
import com.balon.clientshop.feature.splash.SplashRoute
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.balon.clientshop.feature.guide.GuideRoute

/**
 * 全局功能
 */
@Composable
fun MyApp(){
    val navController = rememberNavController()

    NavHost(navController = navController,startDestination="splash"){
        composable("splash"){SplashRoute(
            toGuide = {
                navController.navigate("guide")
            }
        )}
        composable("guide"){ GuideRoute(
            toBack = {
                navController.popBackStack()
            }
        ) }
    }
}