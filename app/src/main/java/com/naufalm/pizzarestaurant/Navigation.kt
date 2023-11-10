package com.naufalm.pizzarestaurant

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naufalm.pizzarestaurant.data.Menu
import com.naufalm.pizzarestaurant.ui.MenuDetailScreen
import com.naufalm.pizzarestaurant.ui.OrderDetailScreen
import com.naufalm.pizzarestaurant.ui.StartScreen
import com.naufalm.pizzarestaurant.ui.StoreDetailScreen

@Composable
fun Navigation() {
    val orders = remember {
        mutableListOf<String>()
    }

    val menu: Menu

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.StartScreen.route) {
        composable(route = Screen.StartScreen.route) {
            StartScreen(navController = navController, data = orders)
        }

        composable(route = Screen.StoreDetail.route) {
            StoreDetailScreen(navController = navController, data = orders)
        }

        composable(route = Screen.MenuScreen.route) {
            MenuScreen(navController = navController, data = orders)
        }

        composable(route = Screen.MenuDetail.route) {
            MenuDetailScreen(navController = navController, menu = Menu())
        }

        composable(route = Screen.OrderDetail.route) {
            OrderDetailScreen(navController = navController)
        }
    }
}