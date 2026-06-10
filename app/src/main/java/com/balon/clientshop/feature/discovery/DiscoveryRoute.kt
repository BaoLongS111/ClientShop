package com.balon.clientshop.feature.discovery

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun DiscoveryRoute(){
    DiscoveryScreen()
}

@Composable
fun DiscoveryScreen() {
    Text(text = "发现页面发现页面发现页面发现页面发现页面发现页面")
}

@Preview
@Composable
fun DiscoveryScreenPreview(){
    MyAppTheme() {
        DiscoveryScreen()
    }
}