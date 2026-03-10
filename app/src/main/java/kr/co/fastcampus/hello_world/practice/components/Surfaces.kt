package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Surface0(name: String) {
    Surface(
        modifier = Modifier.padding(5.dp)
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun Surface1(name: String) {
    //1. Surface에 elevation 설정
    Surface(
        modifier = Modifier.padding(5.dp),
        shadowElevation = 10.dp
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun Surface2(name: String) {
    //2. border 값 설정
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta

        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 5.dp
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun Surface3(name: String) {
    //3. Surface의 shape도 설정해보기
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta

        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 5.dp,
        shape = CircleShape
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}

@Composable
fun Surface4(name: String) {
    // 4. color 지정
    // 지정안하면 contentColor가 자동으로 선택됨
    // MaterialTheme.colorScheme에서 primary, error,
    // background, surface ,secondary 선택
    Surface(
        border = BorderStroke(
            width = 2.dp,
            color = Color.Magenta

        ),
        modifier = Modifier.padding(5.dp),
        shadowElevation = 5.dp,
        shape = CircleShape,
        color = MaterialTheme.colorScheme.error
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(8.dp)
        )
    }
}