package kr.co.fastcampus.hello_world.practice.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import coil.compose.rememberImagePainter
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

@Composable
fun CoilEx() {
    // 스텝 3: rememberImagePainter를 이용해 Image의 painter를 설정합니다.
    // (Compose 한국어 문서의 추천, but Deprecated)
    // 이미지 URI: https://raw.githubusercontent.com/Fastcampus-JetpackCompose-1/part1-chapter3/refs/heads/main/part1-chapter3-10/app/src/main/res/drawable-hdpi/wall.jpg
    val painter = rememberImagePainter(data = "https://raw.githubusercontent.com/Fastcampus-JetpackCompose-1/part1-chapter3/refs/heads/main/part1-chapter3-10/app/src/main/res/drawable-hdpi/wall.jpg")
//    Image(
//        painter = painter,
//        contentDescription = "엔텔로프 캐년"
//    )
    // 스텝 4: AsyncImage를 이용해봅니다. model에 주소를 적으면 됩니다.
    Column {
        AsyncImage(
            model = "https://raw.githubusercontent.com/Fastcampus-JetpackCompose-1/part1-chapter3/refs/heads/main/part1-chapter3-10/app/src/main/res/drawable-hdpi/wall.jpg",
            contentDescription = "엔텔로프 캐년"
        )
        AsyncImage(
            model = "https://raw.githubusercontent.com/Fastcampus-JetpackCompose-1/part1-chapter3/refs/heads/main/part1-chapter3-10/app/src/main/res/drawable-hdpi/wall.jpg",
            contentDescription = "엔텔로프 캐년"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CoilExPreview() {
    HelloWoridTheme() {
        CoilEx()
    }
}