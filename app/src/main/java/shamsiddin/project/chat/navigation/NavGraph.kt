package shamsiddin.project.chat.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import shamsiddin.project.chat.Screens.FirstPage
//import shamsiddin.project.chat.Screens.First
import shamsiddin.project.chat.Screens.Login
import shamsiddin.project.chat.Screens.Splash
    @Composable
    fun NavGraph (navController: NavHostController){
        NavHost(
            navController = navController,
            startDestination = Screens.FirstPage.route)
        {

            composable(route = Screens.Splash.route){
                Splash(navController)
            }
            composable(route = Screens.Login.route){
                Login(navController)

            }
            composable(route = Screens.FirstPage.route) {
                FirstPage(navController)
            }
        }
    }
