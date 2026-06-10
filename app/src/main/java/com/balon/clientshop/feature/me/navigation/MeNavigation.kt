package com.balon.clientshop.feature.me.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.feature.me.MeRoute
import com.balon.clientshop.feature.me.MeScreen
import com.balon.clientshop.ui.navigation.myComposable

const val ME_ROUTE = "me"
fun NavController.navigateToMe(){
    navigate(ME_ROUTE)
}

fun NavGraphBuilder.meScreen(){
    myComposable(ME_ROUTE){
        MeRoute()
    }
}