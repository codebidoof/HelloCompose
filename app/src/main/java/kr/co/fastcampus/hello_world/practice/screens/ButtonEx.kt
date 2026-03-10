package kr.co.fastcampus.hello_world.practice.screens


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
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