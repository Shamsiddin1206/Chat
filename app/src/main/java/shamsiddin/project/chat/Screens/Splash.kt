package shamsiddin.project.chat.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import shamsiddin.project.chat.R
import shamsiddin.project.chat.navigation.Screens

@Composable
    fun Splash(navController: NavController) {
        // Blue and white color
        val blueColor = Color(0xFF2196F3)
        val whiteColor = Color.White

        // Setting up the Compose layout for splash screen
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(whiteColor)
        ) {
            // Display your splash screen content here
    Image(painter = painterResource(id = R.drawable.logo),

        contentDescription = "logo",
        modifier = Modifier
            .size(128.dp)

            )

//            // Navigate to the main screen after a delay (e.g., 2 seconds)
//            LaunchedEffect(Unit) {
//                delay(2000)


            }
        }


