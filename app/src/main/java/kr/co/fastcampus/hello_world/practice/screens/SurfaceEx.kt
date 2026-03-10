package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.practice.components.Surface4
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun SurfaceEx(name: String) {
    Surface4(name)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWoridTheme {
        SurfaceEx("Android")
    }
}