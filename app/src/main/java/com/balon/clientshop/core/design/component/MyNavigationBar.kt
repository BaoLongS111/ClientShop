package com.balon.clientshop.core.design.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.balon.clientshop.core.design.theme.MyAppTheme
import com.balon.clientshop.feature.main.navigation.TopLevelDestination
import com.quick.app.core.design.theme.SpaceExtraMedium

@Composable
fun MyNavigationBar(
    destinations: List<TopLevelDestination>,
    onNavigateToDestination: (Int) -> Unit,
    currentDestination: String?,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.surfaceVariant)
            .navigationBarsPadding()
    ) {
        destinations.forEachIndexed { index, destination ->

            val isSelected = currentDestination == destination.route
            val textColor = if(isSelected){
                MaterialTheme.colorScheme.primary
            }else{
                MaterialTheme.colorScheme.onSurface
            }
            Column(
                modifier = modifier
                    .weight(1f)
                    .clickable {
                        onNavigateToDestination(index)
                    }
                    .padding( vertical = SpaceExtraMedium),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(
                        if(isSelected){
                            destination.selectedIcon
                        }else{
                            destination.unselectedIcon
                        }
                    ),
                    contentDescription = "图标",
                    modifier = modifier.size(25.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = stringResource(destination.titleTextId),
                    style = MaterialTheme.typography.bodySmall.copy(
                        color = textColor
                    )
                )
            }
        }
    }

}

@Preview
@Composable
fun MyNavigationBarPreview() {
    MyAppTheme() {
        MyNavigationBar(
            destinations = TopLevelDestination.entries,
            onNavigateToDestination = {},
            currentDestination = TopLevelDestination.CATEGORY.route
        )
    }
}