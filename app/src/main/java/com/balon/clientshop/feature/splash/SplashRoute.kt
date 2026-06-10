package com.balon.clientshop.feature.splash
import android.os.CountDownTimer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.balon.clientshop.R
import com.balon.clientshop.core.design.theme.MyAppTheme
import com.balon.clientshop.util.MyDateUtil

/**
 * 启动界面
 */
@Composable
fun SplashRoute(
    toGuide:()->Unit
) {
    SplashScreen(
        toGuide = toGuide
    )
}

@Composable
fun SplashScreen(toGuide: () -> Unit={}) {

    var leftTime by remember{
        mutableStateOf(0L)
    }

    // Box 就相当于xml布局里的相对布局，RelativeLayout
    Box(
        modifier = Modifier.fillMaxSize()
    ) {

        //region 启动界面banner
        Image(
            painter = painterResource(R.drawable.splash_banner),
            contentDescription = "启动界面",
            // 垂直水平居中
            modifier = Modifier
                .padding(top = 150.dp)
                .align(Alignment.TopCenter)
        )
        //endregion

        //region 启动界面logo
        Image(
            painter = painterResource(R.drawable.splash_logo),
            contentDescription = "启动界面logo",
            modifier = Modifier
                .padding(bottom = 60.dp)
                .align(Alignment.BottomCenter)
        )
        //endregion

        // 版权文本
        Text(
            text = stringResource(R.string.copyright, MyDateUtil.currentYear()),
            style = MaterialTheme.typography.bodySmall.copy(
                color = MaterialTheme.colorScheme.outline
            ),
            modifier = Modifier
                .padding(bottom = 20.dp)
                .align(Alignment.BottomCenter)
        )

        Text(text = "${leftTime+1}",modifier = Modifier
            .padding(bottom = 80.dp)
            .align(Alignment.BottomCenter))

    }

    LaunchedEffect(key1 = true) {
        object : CountDownTimer(3000,1000){
            override fun onFinish() {
                toGuide()
            }

            override fun onTick(p0: Long) {
                leftTime = p0 / 1000
            }

        }.start()
    }
}

@Preview(showBackground = true)
@Composable
fun SplashRoutePreview() {
    MyAppTheme() {
        SplashScreen()
    }
}