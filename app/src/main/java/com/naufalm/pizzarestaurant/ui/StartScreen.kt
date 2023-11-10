package com.naufalm.pizzarestaurant.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.naufalm.pizzarestaurant.R
import com.naufalm.pizzarestaurant.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen(navController: NavController, data: MutableList<String>) {

    var nameText by remember { mutableStateOf("") }
    var expanded by remember { mutableStateOf(false) }
    val storeOptions = listOf("Cihampelas", "Cibiru")
    var selectedStoreText by remember { mutableStateOf(storeOptions[0]) }


    Surface {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                    vertical = 50.dp,
                    horizontal = 50.dp
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.rm_pizza_1),
                contentDescription = null,
                alignment = Alignment.Center,
                modifier = Modifier
                    .size(250.dp)
            )

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Text(
                text = "Store",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF733F0E),
            )

            ExposedDropdownMenuBox(
                expanded = expanded,
                onExpandedChange = { expanded = !expanded },
            ) {
                TextField(
                    readOnly = true,
                    value = selectedStoreText,
                    onValueChange = {},
                    trailingIcon = {
                        ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded)
                    },
                    colors = ExposedDropdownMenuDefaults.textFieldColors(),
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxWidth()
                )

                ExposedDropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    storeOptions.forEach { selectedStore ->
                        DropdownMenuItem(
                            text = { Text(text = selectedStore) },
                            onClick = {
                                selectedStoreText = selectedStore
                                expanded = false
                            }
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = "Your Name",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(0xFF733F0E),
                modifier = Modifier
                    .fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(5.dp))

            TextField(
                value = nameText,
                onValueChange = { nameText = it },
                placeholder = { Text(text = "Please fill your name") },
                maxLines = 1,
                modifier = Modifier
                    .fillMaxWidth()
                    .shadow(10.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White,
                    placeholderColor = colorResource(id = R.color.grey_400)
                )
            )

            Spacer(modifier = Modifier.height(40.dp))

            Button(
                onClick = {
                    data.add(0, nameText)
                    data.add(1, selectedStoreText)
                    navController.navigate(Screen.StoreDetail.route)
                },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.red)),
                shape = RectangleShape,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorResource(id = R.color.red))
            ) {
                Text(
                    text = "Submit",
                    fontSize = 20.sp
                )
            }
        }
    }
}