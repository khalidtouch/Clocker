package com.khalidtouch.clocker.core.presentation

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.khalidtouch.clocker.core.presentation.viewmodel.MainViewModel

const val HOME_SCREEN = "home_screen"

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel<MainViewModel>(),
    openPreferences: () -> Unit,
) {
    Text(
        "Home screen",
        modifier = Modifier.clickable { openPreferences() },
        fontSize = 230.sp,
    )
}