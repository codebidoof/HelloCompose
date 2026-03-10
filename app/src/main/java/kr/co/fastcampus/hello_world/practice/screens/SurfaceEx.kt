package kr.co.fastcampus.hello_world.practice.screens


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import kr.co.fastcampus.hello_world.practice.components.Surface1
import kr.co.fastcampus.hello_world.practice.components.Surface2
import kr.co.fastcampus.hello_world.practice.components.Surface3
import kr.co.fastcampus.hello_world.practice.components.Surface4
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun SurfaceEx(name: String) {
    //Surface1(name)
    //Surface2(name)
    //Surface3(name)
    Surface4(name)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloWoridTheme {
        SurfaceEx("Android")
    }
}