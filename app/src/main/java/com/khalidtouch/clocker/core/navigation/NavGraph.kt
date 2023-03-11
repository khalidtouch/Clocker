package com.khalidtouch.clocker.core.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.khalidtouch.clocker.core.presentation.HOME_SCREEN
import com.khalidtouch.clocker.core.presentation.HomeScreen
import com.khalidtouch.clocker.core.presentation.PREFERENCES_SCREEN
import com.khalidtouch.clocker.core.presentation.PreferencesScreen

object Destinations {
    const val homeScreen = HOME_SCREEN
    const val preferencesScreen = PREFERENCES_SCREEN
}


@Composable
fun NavGraph(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = Destinations.homeScreen
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(Destinations.homeScreen) {
            HomeScreen(
                openPreferences = { navController.navigate(Destinations.preferencesScreen) }
            )
        }

        composable(Destinations.preferencesScreen) {
            PreferencesScreen()
        }
    }
}