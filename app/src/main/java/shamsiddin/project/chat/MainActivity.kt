package shamsiddin.project.chat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import shamsiddin.project.chat.ui.theme.ChatTheme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.LaunchedEffect

import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import androidx.navigation.compose.rememberNavController
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.delay
import shamsiddin.project.chat.navigation.NavGraph
import shamsiddin.project.chat.navigation.Screens

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            ChatTheme{
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    val db = Firebase.firestore
                    val navController = rememberNavController()
                    NavGraph(navController)
                    LaunchedEffect(Unit) {
                        delay(2000)
                        navController.navigate(Screens.FirstPage.route)


                    }




                }
            }
        }
    }
}
//
//@Composable
//fun AppSplashScreen() {
//    // Blue and white color
//    val blueColor = Color(0xFF2196F3)
//    val whiteColor = Color.White
//
//    // Setting up the Compose layout for splash screen
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(blueColor)
//    ) {
//        // Display your splash screen content here
//        Text(
//            text = "My App",
//            color = whiteColor,
//            fontSize = 32.sp,
//            fontWeight = FontWeight.Bold,
//            modifier = Modifier.align(Alignment.Center)
//        )
//
//        // Navigate to the main screen after a delay (e.g., 2 seconds)
//        LaunchedEffect(Unit) {
//            delay(2000)
//
//
//        }
//    }
//}
//
//@Composable
//fun MyComposeDesign() {
//    // Blue and white color
//    val blueColor = Color(0xFF2196F3)
//    val whiteColor = Color.White
//
//    // Setting up the Compose layout
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(blueColor)
//            .padding(16.dp)
//    ) {
//        // Text 1
//        Text(
//            text = "Hello,",
//            color = whiteColor,
//            fontSize = 24.sp,
//            fontWeight = FontWeight.Bold
//        )
//
//        // Text 2
//        Text(
//            text = "Jetpack Compose!",
//            color = whiteColor,
//            fontSize = 18.sp,
//            fontWeight = FontWeight.Normal,
//            modifier = Modifier.padding(bottom = 16.dp)
//        )
//
//        // Image
//        Image(
//            painter = painterResource(id = R.drawable.firstpage),
//            contentDescription = null,
//            modifier = Modifier
//                .size(150.dp)
//                .padding(bottom = 16.dp)
//                .clip(shape = CircleShape)
//                .background(whiteColor)
//        )
//
//        // Button
//        Button(
//            onClick = { /* Handle button click */ },
//            colors = ButtonDefaults.buttonColors(containerColor = Color.White),
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp)
//        ) {
//            Text(
//                text = "Click Me",
//                color = blueColor,
//                fontWeight = FontWeight.Bold
//            )
//        }
//    }
//}