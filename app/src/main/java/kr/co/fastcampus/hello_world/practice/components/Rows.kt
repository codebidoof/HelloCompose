package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Row0() {
    Row(modifier = Modifier.height(40.dp)) {
        Text(text = "첫 번째!")
        Text(text = "두 번째!")
        Text(text = "세 번째!")
    }
}

//1. 각 텍스의 modifier에 align을 설정
//Alignment.Top, CenterVertically, Bottom을 지정해 보자
@Composable
fun Row1() {
    Row(modifier = Modifier.height(40.dp)) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", modifier = Modifier.align(Alignment.CenterVertically))
        Text(text = "세 번째!", modifier = Modifier.align(Alignment.Bottom))
    }
}

//2. Row에 verticallyAlignment를 설정해보자. -> 요소들에 대체적인 경향성이 있을 때.
//Text에 align을 사용할 때와 쓰이는 값이 같음.
@Composable
fun Row2() {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier.height(40.dp)
    ) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", )
        Text(text = "세 번째!", )
    }
}

//3. Row의 width를 200dp 정도로 세팅
// Row에 horizontalArrangement에 Arrangement.Center를
// 설정해보자. Start, End, SpaceAround(각 아이템 주변에 동일한 공간, 하지만 양끝은 절반 공간만),
// SpaceBetween(양쪽 끝은 딱 붙음)
// SpaceEvenly(모든 공간이 완전히 동일) 를 설정해보자
@Composable
fun Row3() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(text = "첫 번째!", modifier = Modifier.align(Alignment.Top))
        Text(text = "두 번째!", )
        Text(text = "세 번째!", )
    }
}

//4. horizontalArrangement를 제거하고 각 텍스트에
// Modifier.weight를 설정해보자. 각 항목의 weight값을 바꾸어 보자.
@Composable
fun Row4() {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(
            text = "첫 번째!",
            modifier = Modifier.align(Alignment.Top)
                .weight(3f)
        )
        Text(
            text = "두 번째!",
            modifier = Modifier.weight(1f)
        )
        Text(text = "세 번째!",
            modifier = Modifier.weight(3f)
        )
    }
}

@Composable
fun Row5() {
    Row(
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .height(40.dp)
            .width(200.dp)
    ) {
        Text(
            text = "첫 번째!",
            textAlign = TextAlign.End,
            modifier = Modifier.align(Alignment.Top)
                .weight(3f)
                .background(Color.Magenta)
        )
        Icon(
            imageVector = Icons.Filled.AccountBox,
            contentDescription = "추가",
            modifier = Modifier.weight(1f)
                .background(Color.Cyan)
        )
        Text(
            text = "세 번째!",
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(3f)
                .background(Color.Blue)
        )
    }
}

@Preview
@Composable
fun RowPreview() {
//    Row0()
//    Row1()
//    Row2()
//    Row3()
//    Row4()
    Row5()
}