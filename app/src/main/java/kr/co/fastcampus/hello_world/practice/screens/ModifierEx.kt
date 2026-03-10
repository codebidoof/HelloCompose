package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.practice.components.Modifier9
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun ModifierEx() {
    Modifier9()
}

@Preview(showBackground = true)
@Composable
fun ModifierExPreview() {
    HelloWoridTheme() {
        ModifierEx()
    }
}