package com.balon.clientshop.feature.main.navigation

import com.balon.clientshop.R
import com.balon.clientshop.feature.cart.navigation.CART_ROUTE
import com.balon.clientshop.feature.category.navigation.CATEGORY_ROUTE
import com.balon.clientshop.feature.discovery.navigation.DISCOVERY_ROUTE
import com.balon.clientshop.feature.me.navigation.ME_ROUTE
import com.balon.clientshop.feature.shrotvideo.navigation.SHORT_VIDEO_ROUTE

/**
 * 顶层界面模型
 */
enum class TopLevelDestination(
    val selectedIcon: Int,
    val unselectedIcon: Int,
    val titleTextId: Int,
    val route: String,
) {
    //发现界面
    DISCOVERY(
        selectedIcon = R.drawable.tab_mall_main_selected,
        unselectedIcon = R.drawable.tab_mall_main,
        titleTextId = R.string.home,
        route = DISCOVERY_ROUTE,
    ),
    SHORT_VIDEO(
        selectedIcon = R.drawable.tab_mall_video_selected,
        unselectedIcon = R.drawable.tab_mall_video,
        titleTextId = R.string.video,
        route = SHORT_VIDEO_ROUTE,
    ),
    CATEGORY(
        selectedIcon = R.drawable.tab_mall_category_selected,
        unselectedIcon = R.drawable.tab_mall_category,
        titleTextId = R.string.category,
        route = CATEGORY_ROUTE,
    ),

    CART(
        selectedIcon = R.drawable.tab_mall_cart_selected,
        unselectedIcon = R.drawable.tab_mall_cart,
        titleTextId = R.string.cart,
        route = CART_ROUTE,
    ),

    ME(
        selectedIcon = R.drawable.tab_mall_me_selected,
        unselectedIcon = R.drawable.tab_mall_me,
        titleTextId = R.string.me,
        route = ME_ROUTE,
    ),
}