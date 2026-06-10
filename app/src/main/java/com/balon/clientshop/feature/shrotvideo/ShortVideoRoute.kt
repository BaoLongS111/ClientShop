package com.balon.clientshop.feature.shrotvideo

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun ShortVideoRoute(){
    ShortVideoScreen()
}

@Composable
fun ShortVideoScreen() {
    Text(text = "短视频页面短视频页面短视频页面短视频页面短视频页面短视频页面")
}

@Preview
@Composable
fun ShortVideoScreenPreview(){
    MyAppTheme() {
        ShortVideoScreen()
    }
}