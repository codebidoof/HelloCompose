package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Modifier0() {
    Button(onClick = {}) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier1() {
    //modifier에 Modifier.fillMaxSize()를 설정
    Button(
        onClick = {},
        modifier = Modifier.fillMaxSize()
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier2() {
    //2. fillMaxSize대신 Modifier.height 설정
    Button(
        onClick = {},
        modifier = Modifier.height(100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier3() {
    //3. modifier에 width와 height 같이 설정
    Button(
        onClick = {},
        modifier = Modifier
            .height(100.dp)
            .height(200.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier4() {
    //4. size 설정
    Button(
        onClick = {},
        modifier = Modifier.size(200.dp, 100.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier5() {
    // 5. background 설정 (버튼에서는 되지 않음..)
    // Button에 안 되면 Text나 Icon에 지정해보기
    Button(
        onClick = {},
        modifier = Modifier.size(200.dp, 100.dp).background(Color.Red)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier6() {
    //6. colors파라미터에 ButtonDefaults.buttonColors를 넣어보기
    //containerColor와 contentColor 프로퍼티 설정하기.
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Cyan
        ),
        onClick = {},
        modifier = Modifier.size(200.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier7() {
    //7. Button의 modifier에 padding 추가.
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Cyan
        ),
        onClick = {},
        modifier = Modifier.size(200.dp).padding(30.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text("Search")
    }
}

@Composable
fun Modifier8() {
    //8. Button에 enabled를 false로 설정, Text의
    //Modifier에 clickable 넣어보기
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Cyan
        ),
        onClick = {},
        enabled = false,
        modifier = Modifier.size(200.dp).padding(30.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
        )
        Text(
            "Search",
            modifier = Modifier.clickable {}
        )
    }
}

@Composable
fun Modifier9() {
    // 9. Text의 Modifier에 offset을 설정, x 파라미터를
    // 설정
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Magenta,
            contentColor = Color.Cyan
        ),
        onClick = {},
        modifier = Modifier.size(200.dp).padding(30.dp)
    ) {
        Icon(
            imageVector = Icons.Filled.Search,
            contentDescription = null,
            modifier = Modifier.background(Color.Blue)
        )
        Spacer(
            modifier = Modifier.size(ButtonDefaults.IconSpacing)
                .background(Color.Blue)
        )
        Text(
            "Search",
            modifier = Modifier.offset(x = 10.dp)
                .background(Color.Blue)
        )
    }
}
