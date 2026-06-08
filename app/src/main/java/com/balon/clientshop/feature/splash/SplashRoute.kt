import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.balon.clientshop.R
import com.balon.clientshop.ui.theme.ClientShopTheme

/**
 * 启动界面
 */
@Composable
fun SplashRoute() {
    SplashScreen()
}

@Composable
fun SplashScreen() {
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
                .padding(bottom = 20.dp)
                .align(Alignment.BottomCenter)
        )
        //endregion


    }
}

@Preview(showBackground = true)
@Composable
fun SplashRoutePreview() {
    ClientShopTheme() {
        SplashRoute()
    }
}