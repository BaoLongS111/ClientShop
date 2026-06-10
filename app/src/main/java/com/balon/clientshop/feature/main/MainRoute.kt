package com.balon.clientshop.feature.main.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.balon.clientshop.core.design.component.MyNavigationBar
import com.balon.clientshop.core.design.theme.MyAppTheme
import com.balon.clientshop.feature.cart.CartRoute
import com.balon.clientshop.feature.category.CategoryRoute
import com.balon.clientshop.feature.discovery.DiscoveryRoute
import com.balon.clientshop.feature.me.MeRoute
import com.balon.clientshop.feature.me.MeScreen
import com.balon.clientshop.feature.shrotvideo.ShortVideoRoute
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun MainRoute() {
    MainScreen()
}

@Composable
fun MainScreen(
) {

    var currentDestination by rememberSaveable {
        mutableStateOf(TopLevelDestination.DISCOVERY.route)
    }

    val scope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize()
    ) {

        val pageState = rememberPagerState {
            TopLevelDestination.entries.size
        }

        HorizontalPager(
            state = pageState,
            userScrollEnabled = false,
            modifier = Modifier.weight(1f)
        ) { page ->
            when (page) {
                0 -> DiscoveryRoute()
                1 -> ShortVideoRoute()
                2 -> CategoryRoute()
                3 -> CartRoute()
                4 -> MeRoute()
            }

        }


        MyNavigationBar(
            destinations = TopLevelDestination.entries,
            onNavigateToDestination = { it ->
                currentDestination = TopLevelDestination.entries[it].route
                scope.launch {
                    pageState.scrollToPage(it)
                }
            },
            currentDestination = currentDestination
        )
    }

}


@Preview
@Composable
fun MainScreenPreview() {
    MyAppTheme() {
        MainScreen()
    }
}