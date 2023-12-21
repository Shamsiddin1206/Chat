package shamsiddin.project.chat.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import shamsiddin.project.chat.R

@Composable
fun FirstPage(navController: NavController) {


    val colorBlack = Color.Black
    val colorWhite = Color.White

// Setting up the Compose layout
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()

            .background(colorBlack)
            .padding(16.dp)
            .wrapContentSize(Alignment.Center)
    ){
    Row {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            modifier = Modifier
                .size(50.dp)
                .clip(shape = CircleShape)
                .background(colorBlack)
        )
        Text(
            text = "Chatbox",
            color = colorWhite,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal
        )
    }




            // Text 2
            Text(
                text = stringResource(id = R.string.firstPageMain),
                color = colorWhite,
                modifier = Modifier.padding(bottom = 16.dp),
                style = MaterialTheme.typography.bodyMedium
            )
        Text(
            text = stringResource(id = R.string.firstPageSecond),
            color = Color.White.copy(alpha = 0.5f),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Normal
        )

            // Image
            Image(
                painter = painterResource(id = R.drawable.firstpage),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .padding(bottom = 16.dp)
                    .clip(shape = CircleShape)
                    .background(colorWhite)
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
                    color = colorWhite,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }

