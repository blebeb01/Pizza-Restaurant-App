package com.naufalm.pizzarestaurant.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun OrderDetailScreen(navController: NavController, data: MutableList<String>) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(30.dp)
    ) {
        Text(
            text = "Order Detail",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = data[0])
        
        Text(text = "Store: ${data[1]}")
        
        Text(text = "Peperoni Pizza sudah dipesan")
        
        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Pengiriman",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .fillMaxWidth()
        )
    }
}