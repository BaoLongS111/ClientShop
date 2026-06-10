package com.balon.clientshop.feature.shrotvideo.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import com.balon.clientshop.feature.shrotvideo.ShortVideoRoute
import com.balon.clientshop.ui.navigation.myComposable

const val SHORT_VIDEO_ROUTE = "shortVideo"

fun NavController.navigateToShortVideo() {
    navigate(SHORT_VIDEO_ROUTE)
}

fun NavGraphBuilder.shortVideoScreen() {
    myComposable(
        SHORT_VIDEO_ROUTE
    ) {
        ShortVideoRoute()
    }
}