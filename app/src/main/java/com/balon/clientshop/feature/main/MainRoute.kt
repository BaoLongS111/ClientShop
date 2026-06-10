package com.balon.clientshop.feature.main.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.balon.clientshop.core.design.component.MyNavigationBar
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun MainRoute() {
    MainScreen()
}

@Composable
fun MainScreen(
) {

    var currentDestination by remember{
        mutableStateOf(TopLevelDestination.CATEGORY.route)
    }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MainContent(
            modifier = Modifier
                .weight(1f)
        )
        MyNavigationBar(
            destinations = TopLevelDestination.entries,
            onNavigateToDestination = { it->
                currentDestination = TopLevelDestination.entries[it].route
            },
            currentDestination = currentDestination
        )
    }

}

@Composable
fun MainContent(
    modifier: Modifier
) {
    Text(
        text = "aaa",
        modifier.fillMaxWidth()
    )
}

@Preview
@Composable
fun MainScreenPreview() {
    MyAppTheme() {
        MainScreen()
    }
}