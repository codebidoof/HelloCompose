package kr.co.fastcampus.hello_world.practice.components

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
import androidx.compose.ui.unit.dp

@Composable
fun Button0() {
    Button(onClick = {}) {
        Text("Send")
    }

    //Icon을 Text앞에 추가
    Button(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Text("Send")
    }
}

@Composable
fun Button1() {
    //아이콘과 텍스트 사이에 Spacer 넣기
    //modifier에 Modifier.size를 넣고 사이즈를
    //ButtonDefaults.IconSpacing을 지정(아이콘 뒤에 얼마나 간격을 띄워야하는지)
    Button(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )

        Text("Send")
    }
}

@Composable
fun Button2() {
    //enabled를 false로 바꿈
    Button(
        onClick = {},
        enabled = false
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Send")
    }
}

@Composable
fun Button3() {
    //border에 BorderStroke를 설정
    Button(
        onClick = {},
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Send")
    }
}

@Composable
fun Button4() {
    //shape를 CircleShape로 설정
    Button(
        onClick = {},
        enabled = true,
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Send")
    }
}

@Composable
fun Button5() {
    //contentPadding에 PaddingValues를 설정
    Button(
        onClick = {},
        border = BorderStroke(10.dp, Color.Magenta),
        shape = CircleShape,
        contentPadding = PaddingValues(20.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Send,
            contentDescription =  null,
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Send")
    }
}