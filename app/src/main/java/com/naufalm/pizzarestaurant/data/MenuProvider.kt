package com.naufalm.pizzarestaurant.data

import com.naufalm.pizzarestaurant.R

object MenuProvider {

    val menuList = listOf(
        Menu(
            id = 1,
            menuName = "Pepperoni Pizza",
            price = "66.000,00",
            menuDescription1 = "Cocok bagi anda yang ingin merasakan pizza original dengan taburan keju dan daging asap yang lezat",
            menuImage1 = R.drawable.pizza,
            menuImage2 = R.drawable.pizza_detail
        ),

        Menu(
            id = 2,
            menuName = "Spaghetti",
            price = "50.000,00",
            menuDescription1 = "Cocok bagi anda yang ingin merasakan spaghetti original dengan bumbu yang oriental",
            menuImage1 = R.drawable.spaghetti,
            menuImage2 = R.drawable.spaghetti_detail
        ),

        Menu(
            id = 3,
            menuName = "Burger",
            price = "15.000,00",
            menuDescription1 = "Cocok bagi anda yang ingin merasakan kelembutan burger berlapiskan keju, sayuran dan daging yang tebal",
            menuImage1 = R.drawable.burger
        ),

        Menu(
            id = 4,
            menuName = "Steak",
            price = "250.000,00",
            menuDescription1 = "Cocok bagi anda yang ingin merasakan lezatnya daging steak dipadukan dengan kentang yang lezat",
            menuImage1 = R.drawable.steak
        )
    )
}