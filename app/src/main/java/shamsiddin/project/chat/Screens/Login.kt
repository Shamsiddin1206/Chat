package shamsiddin.project.chat.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import shamsiddin.project.chat.R

@Composable
fun Login(navHostController: NavHostController) {
    // Blue and white color
    val blueColor = Color(0xFF2196F3)
    val whiteColor = Color.White

    // Setting up the Compose layout
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(blueColor)
            .padding(16.dp)
    ) {

        Text(
            text = "Hello,",
            color = whiteColor,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        // Text 2
        Text(
            text = "Jetpack Compose!",
            color = whiteColor,
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Image
        Image(
            painter = painterResource(id = R.drawable.firstpage),
            contentDescription = null,
            modifier = Modifier
                .size(150.dp)
                .padding(bottom = 16.dp)
                .clip(shape = CircleShape)
                .background(whiteColor)
        )

        // Button
        Button(
            onClick = { /* Handle button click */ },
            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        ) {
            Text(
                text = "Click Me",
                color = blueColor,
                fontWeight = FontWeight.Bold
            )
        }
    }
}