package com.naufalm.pizzarestaurant.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.naufalm.pizzarestaurant.Screen
import com.naufalm.pizzarestaurant.data.Menu

@Composable
fun MenuItem(menu: Menu, navController: NavController) {

    Card(
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 15.dp)
            .clickable {
                navController.navigate(Screen.MenuDetail.route)
            }
    ) {
        Row(modifier = Modifier.fillMaxWidth()) {
            MenuImage(menu = menu)

            Column(
                modifier = Modifier
                    .padding(15.dp)
                    .fillMaxWidth()
                    .align(CenterVertically)
            ) {
                Text(text = menu.menuName!!)
                Text(text = menu.menuDescription1!!)
            }
        }
    }
}

@Composable
private fun MenuImage(menu: Menu) {
    Image(
        painter = painterResource(id = menu.menuImage1),
        contentDescription = null,
        modifier = Modifier
            .width(120.dp)
            .height(120.dp)
            .padding(5.dp)
    )
}

