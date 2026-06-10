package com.balon.clientshop.feature.category.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.feature.category.CategoryRoute
import com.balon.clientshop.ui.navigation.myComposable

const val CATEGORY_ROUTE = "category"

fun NavController.navigateToCategory(){
    navigate(CATEGORY_ROUTE)
}

fun NavGraphBuilder.categoryScreen(){
    myComposable(CATEGORY_ROUTE){
        CategoryRoute()
    }
}