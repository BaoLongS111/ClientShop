package com.balon.clientshop.feature.main.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MainContent(
            modifier = Modifier
                .weight(1f)
        )
        MyNavigationBar(
            modifier = Modifier.height(56.dp)
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