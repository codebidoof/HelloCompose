package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.hello_world.MainActivity.Companion.cardData
import kr.co.fastcampus.hello_world.practice.components.CardEx

@Composable
fun CardScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column{
            CardEx(cardData)
            CardEx(cardData)
        }
    }
}

@Preview
@Composable
fun CardScreenPreview() {
    CardScreen()
}