package com.balon.clientshop.feature.discovery.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.feature.discovery.DiscoveryRoute
import com.balon.clientshop.ui.navigation.myComposable

const val DISCOVERY_ROUTE = "discovery"

fun NavController.navigateToDiscovery(){
    navigate(DISCOVERY_ROUTE)
}

fun NavGraphBuilder.discoveryScreen(){
    myComposable(DISCOVERY_ROUTE){
        DiscoveryRoute()
    }
}