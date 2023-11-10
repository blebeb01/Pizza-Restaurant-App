package com.naufalm.pizzarestaurant.ui

import android.widget.Switch
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.naufalm.pizzarestaurant.MenuScreen
import com.naufalm.pizzarestaurant.R
import com.naufalm.pizzarestaurant.Screen
import com.naufalm.pizzarestaurant.data.Menu
import com.naufalm.pizzarestaurant.data.MenuProvider

@Composable
fun MenuDetailScreen(navController: NavController, menu: Menu) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(menu.menuImage2),
                contentDescription = null,
                contentScale = ContentScale.FillWidth
            )
            
            Text(text = menu.menuName!!,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.align(Alignment.BottomStart)
            )
        }
    }
}


