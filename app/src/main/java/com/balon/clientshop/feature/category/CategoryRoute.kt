package com.balon.clientshop.feature.category

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.balon.clientshop.core.design.theme.MyAppTheme

@Composable
fun CategoryRoute(){
    CategoryScreen()
}

@Composable
fun CategoryScreen() {
    Text(text = "分类页面分类页面分类页面分类页面分类页面分类页面")
}

@Preview
@Composable
fun CategoryScreenPreview(){
    MyAppTheme() {
        CategoryRoute()
    }
}