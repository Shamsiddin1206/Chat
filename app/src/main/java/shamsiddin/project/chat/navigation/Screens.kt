package shamsiddin.project.chat.navigation


sealed class Screens(val route: String) {
//    object First: Screens("first_screen")
    object Splash: Screens("splash_screen")
    object Login: Screens("login_screen")
    object FirstPage: Screens("firstpage_screen")
}