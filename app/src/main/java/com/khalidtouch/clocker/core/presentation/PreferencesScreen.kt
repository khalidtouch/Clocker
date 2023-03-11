package com.khalidtouch.clocker.core.presentation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.khalidtouch.clocker.core.presentation.viewmodel.MainViewModel

const val PREFERENCES_SCREEN = "preferences_screen"

@Composable
fun PreferencesScreen (
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = hiltViewModel(),
){
    Text("Preferences ")
}