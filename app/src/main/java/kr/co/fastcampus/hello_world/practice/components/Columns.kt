package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun Column0() {
    Column(modifier = Modifier.size(100.dp)) {
        Text(text = "첫 번째")
        Text(text = "두 번째")
        Text(text = "세 번째")
    }
}

//1. horizontalAlignment를 Column에 적용
@Composable
fun Column1() {
    Column(
        horizontalAlignment = Alignment.End,
        modifier = Modifier.size(100.dp)
    ) {
        Text(text = "첫 번째")
        Text(text = "두 번째")
        Text(text = "세 번째")
    }
}

//2. verticalArrangement를 Column에 적용
//SpaceAround, SpaceEvenly, SpaceBetween 도 해보자.
//Arrangement에는 Center뒤에 수식어 안 붙는다.
@Composable
fun Column2() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier.size(100.dp)
    ) {
        Text(text = "첫 번째")
        Text(text = "두 번째")
        Text(text = "세 번째")
    }
}

//3. Text에 Modifier.align 적용
@Composable
fun Column3() {
    Column(
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.size(100.dp)
    ) {
        Text(
            text = "첫 번째",
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
        Text(text = "두 번째")
        Text(
            text = "세 번째",
            modifier = Modifier.align(Alignment.Start)
        )
    }
}

@Preview
@Composable
fun ColumnPreview() {
    HelloWoridTheme() {
//        Column0()
//        Column1()
        Column2()
//        Column3()
    }
}