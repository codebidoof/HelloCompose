package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

//BoxWithConstraints는 길이에 맞춰 유동적으로 뭔가를 넣고 싶을 때 쓰인다.

@Composable
fun Outer() {
    //4. Column에 width를 지정해서 제한해 보자
    Column(
        modifier = Modifier
            .background(Color.White)
            .width(150.dp) //부모에서 150제한을 해서 Inner의 height를 200으로 해도 maxWidth는 150이다.
    ) {
        // 2. Inner의 인자로 Modifier.widthIn(min = 100.dp)를
        // 전달해보자. heightIn도 전달해보자. 각각 인자의 max값도
        // 전달해보자.
        Inner(modifier = Modifier
            .width(200.dp)
            .height(160.dp)
        )
        Inner(modifier = Modifier
            .width(200.dp)
            .height(100.dp)
        )
    }
}

// 1. Inner 인자로 modifier를 전달해보자. 기본 값을 Modifier로 지정하자.
// 파라미터로 받은 modifier를 BoxWithConstraints에 전달하자.
@Composable
private fun Inner(modifier: Modifier = Modifier) {
    BoxWithConstraints(modifier) {
        // 3. maxHeight 값이 150dp가 넘을 때만 추가로 텍스트를 출력해 보자.
        if (maxHeight > 150.dp) {
            Text(
                text = "여기 꽤 길군요!",
                modifier = Modifier.align(Alignment.BottomCenter)
            )
        }
        Text("maxW: $maxWidth maxH: $maxHeight minW: $minWidth minH: $minHeight" )
    }
}

@Preview
@Composable
fun PreviewOuter() {
    HelloWoridTheme() {
        Outer()
    }
}