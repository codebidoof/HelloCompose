package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme


@Composable
fun Box0() {
    Box(modifier = Modifier.size(100.dp)) {
        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

// 1. Text 2개를 Box안에 배치
@Composable
fun Box1() {
    Box(modifier = Modifier.size(100.dp)) {
        Text(text = "Hello World", modifier = Modifier.align(Alignment.BottomEnd))
        Text(text = "JetPack", modifier = Modifier.align(Alignment.CenterEnd))
        Text(text = "Compose", modifier = Modifier.align(Alignment.TopStart))

    }
}

// 2. 2개의 Box를 Box안에 배치하고 사이즈를 70dp, 색상을 각기 다르게
@Composable
fun Box2() {
    Box(modifier = Modifier.size(100.dp)) {
        Box(modifier = Modifier.size(70.dp).background(Color.Cyan).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.BottomEnd))
    }
}

//3. 부모 Box에 modifier설정을 제거해서 콘텐트 사이즈만큼 보여주게 하기
@Composable
fun Box3() {
    Box {
        Box(modifier = Modifier.matchParentSize().background(Color.Cyan).align(Alignment.CenterStart))
        Box(modifier = Modifier.size(70.dp).background(Color.Yellow).align(Alignment.Center))
    }
}

@Preview
@Composable
fun BoxPreview() {
    HelloWoridTheme() {
        //Box0()
//        Box1()
//        Box2()
        Box3()
    }
}