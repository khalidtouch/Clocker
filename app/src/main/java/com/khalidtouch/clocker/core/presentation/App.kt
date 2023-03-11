package com.khalidtouch.clocker.core.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.khalidtouch.clocker.core.navigation.NavGraph
import com.khalidtouch.clocker.core.presentation.viewmodel.MainViewModel
import com.khalidtouch.clocker.core.ui.theme.ClockerTheme

@Composable
fun App(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    viewModel: MainViewModel = hiltViewModel<MainViewModel>()
) {
    ClockerTheme {
        Surface(modifier = modifier.fillMaxSize()) {
            NavGraph(navController = navController)
        }
    }
}