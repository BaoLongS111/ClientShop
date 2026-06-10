package com.balon.clientshop.feature.me

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun MeRoute(){
    MeScreen()
}

@Composable
fun MeScreen() {
    Text(text = "我的页面我的页面我的页面我的页面我的页面我的页面")
}

@Preview
@Composable
fun MeScreenPreview(){
    MyAppTheme() {
        MeScreen()
    }
}