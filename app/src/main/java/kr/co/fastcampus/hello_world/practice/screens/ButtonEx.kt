package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.practice.components.Button0
import kr.co.fastcampus.hello_world.practice.components.Button1
import kr.co.fastcampus.hello_world.practice.components.Button2
import kr.co.fastcampus.hello_world.practice.components.Button3
import kr.co.fastcampus.hello_world.practice.components.Button4
import kr.co.fastcampus.hello_world.practice.components.Button5
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun ButtonEx(onButtonClicked: () -> Unit) {
//    Button0()
//    Button1()
//    Button2()
//    Button3()
//    Button4()
    Button5()
}

@Preview(showBackground = true)
@Composable
fun ButtonExPreview() {
    HelloWoridTheme() {
        ButtonEx(onButtonClicked = {})
    }
}