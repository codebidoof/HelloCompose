package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.hello_world.practice.components.Box0
import kr.co.fastcampus.hello_world.practice.components.Box2
import kr.co.fastcampus.hello_world.practice.components.Box3
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme



@Composable
fun BoxEx() {
    Box3()
}

@Preview
@Composable
fun BoxExPreview() {
    HelloWoridTheme() {
        BoxEx()
    }

}