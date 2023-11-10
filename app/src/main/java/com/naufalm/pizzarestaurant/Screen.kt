package com.naufalm.pizzarestaurant

sealed class Screen(val route: String) {
    object StartScreen: Screen ("start_screen")
    object StoreDetail: Screen ("location_detail")
    object MenuScreen: Screen ("menu_screen")
    object MenuDetail: Screen ("menu_detail")
    object OrderDetail: Screen ("order_detail")
}
