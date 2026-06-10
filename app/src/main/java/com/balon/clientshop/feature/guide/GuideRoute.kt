package com.balon.clientshop.feature.guide
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * 引导界面
 */
@Composable
fun GuideRoute(
    toBack:()-> Unit
){
    GuideScreen(toBack = toBack)
}

@Composable
fun GuideScreen(toBack: () -> Unit={}) {
    Box(modifier = Modifier.fillMaxSize()){
        Button(onClick = toBack) {
            Text(text = "返回")
        }
    }
}