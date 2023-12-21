package shamsiddin.project.chat.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import shamsiddin.project.chat.R

val Caros = FontFamily(
    Font(R.font.caros_medium)
//    Font(R.font.caros_thin)
//    Font(R.font.caros_heavy),
//    Font(R.font.caros_bold),
//    Font(R.font.caros_extralight)


)
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),
    bodyMedium =TextStyle(
        fontFamily = Caros,
        fontWeight = FontWeight.Normal,
        fontSize = 40.sp,
        letterSpacing = 0.9.sp,
        lineHeight = 50.sp

    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)