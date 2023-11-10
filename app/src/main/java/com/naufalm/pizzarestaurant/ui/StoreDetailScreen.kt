package com.naufalm.pizzarestaurant.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.navigation.NavController
import com.naufalm.pizzarestaurant.R
import com.naufalm.pizzarestaurant.Screen



@Composable
fun StoreDetailScreen(navController: NavController, data: MutableList<String>) {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (
            userImage,
            userName,
            storeImage,
            storeLabel,
            locationLabel,
            locationName,
            mapsFind,
            mapsIcon,
            btnSeeMenus) = createRefs()

        Image(
            painter = painterResource(id = R.drawable.person_male_1),
            contentDescription = null,
            modifier = Modifier
                .padding(14.dp)
                .size(38.dp)
                .constrainAs(userImage) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                }
        )

        Text(
            text = "Hello, ${data[0]}",
            fontWeight = FontWeight(700),
            fontSize = 20.sp,
            modifier = Modifier
                .constrainAs(userName) {
                start.linkTo(userImage.end)
                centerVerticallyTo(userImage)
            }
        )

        Image(
            painter = painterResource(id = R.drawable.main_1),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(storeImage) {
                    top.linkTo(userImage.bottom)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
        )

        Text(
            text = "Store",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .constrainAs(storeLabel) {
                    start.linkTo(parent.start, margin = 30.dp)
                    top.linkTo(storeImage.bottom, margin = 30.dp)
                }
        )

        Text(
            text = "Location",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .constrainAs(locationLabel) {
                    start.linkTo(parent.start, margin = 30.dp)
                    top.linkTo(storeLabel.bottom, margin = 15.dp)
                }
        )

        Text(
            text = data[1],
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .constrainAs(locationName) {
                    top.linkTo(storeImage.bottom, margin = 30.dp)
                    end.linkTo(parent.end, margin = 30.dp)
                }
        )

        Image(
            painterResource(id = R.drawable.location_pin_1),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .constrainAs(mapsIcon) {
                    top.linkTo(locationName.bottom, margin = 15.dp)
                    end.linkTo(parent.end, margin = 30.dp)
                    bottom.linkTo(btnSeeMenus.top, margin = 30.dp)
                }
        )

        Text(
            text = "Find on Maps",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            color = Color(0xFF733F0E),
            modifier = Modifier
                .constrainAs(mapsFind) {
                    top.linkTo(locationName.bottom, margin = 15.dp)
                    end.linkTo(mapsIcon.start)
                }
        )

        Button(
            onClick = {
                      navController.navigate(Screen.MenuScreen.route)
            },
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.red)),
            shape = RectangleShape,
            modifier = Modifier
                .width(475.dp)
                .background(colorResource(id = R.color.red))
                .constrainAs(btnSeeMenus) {
                    centerHorizontallyTo(parent)
                    top.linkTo(locationLabel.bottom, margin = 30.dp)
                }
        ) {
            Text(text = "See Menus")
        }
    }
}