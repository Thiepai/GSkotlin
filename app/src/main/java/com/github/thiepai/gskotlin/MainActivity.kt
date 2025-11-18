package com.github.thiepai.gskotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.github.thiepai.gskotlin.ui.theme.GSkotlinTheme
import com.github.thiepai.gskotlin.ui.theme.GSkotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GSkotlinTheme {
                AppNavHost()
            }
        }
    }
}

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {

        composable("login") {
            LoginScreen(
                onLoginSuccess = { navController.navigate("menu") }
            )
        }

        composable("menu") {
            MenuScreen(
                onImcClick = { navController.navigate("imc") },
                onEquipeClick = { navController.navigate("equipe") },
                onLogoutClick = { navController.popBackStack("login", inclusive = false) }
            )
        }

        composable("imc") {
            ImcScreen(
                onBack = { navController.popBackStack() }
            )
        }

        composable("equipe") {
            TeamScreen(
                integrantes = listOf("Gabriel Valério, 552041", "Thiago Ratao, 551351"),
                onBack = { navController.popBackStack() }
            )
        }
    }
}
