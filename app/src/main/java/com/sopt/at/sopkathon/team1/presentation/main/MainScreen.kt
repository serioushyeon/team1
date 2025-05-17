package com.sopt.at.sopkathon.team1.presentation.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.sopt.at.sopkathon.team1.presentation.main.component.MainBottomBar
import kotlinx.collections.immutable.toImmutableList

@Composable
fun MainScreen(
    navigator: MainNavigator = rememberMainNavigator()
) {
    Scaffold(
        bottomBar = {
            MainBottomBar(
                visible = navigator.showBottomBar(),
                tabs = MainTab.entries.toImmutableList(),
                currentTab = navigator.currentTab,
                onTabSelected = navigator::navigateBottomTab,
            )

        },
        modifier = Modifier
            .background(Color.White)
            .systemBarsPadding()
            .fillMaxSize()
    ) { innerPadding ->
        MainNavHost(
            navigator = navigator,
            modifier = Modifier.padding(innerPadding)
        )
    }
}