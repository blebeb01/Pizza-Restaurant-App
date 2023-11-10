package com.naufalm.pizzarestaurant

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.naufalm.pizzarestaurant.data.MenuProvider
import com.naufalm.pizzarestaurant.ui.MenuItem

@Composable
fun MenuScreen(navController: NavController, data: MutableList<String>) {
    val menus = remember {
        MenuProvider.menuList
    }

    Column {
        Row(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.person_male_1),
                contentDescription = null,
                modifier = Modifier
                    .padding(14.dp)
                    .size(38.dp)
            )

            Text(
                text = "Hello, ${data[0]}",
                fontWeight = FontWeight(700),
                fontSize = 20.sp,
                modifier = Modifier.align(CenterVertically)
            )
        }

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 15.dp, vertical = 8.dp)
        ) {
            itemsIndexed(menus) {
                index, item ->  MenuItem(menu = item, navController = navController)
            }
        }
    }
}
