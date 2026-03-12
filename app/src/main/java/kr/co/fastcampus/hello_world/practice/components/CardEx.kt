package kr.co.fastcampus.hello_world.practice.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale.Companion.Crop
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kr.co.fastcampus.hello_world.practice.CardData


@Composable
fun CardEx(cardData: CardData) {
    val placeHolderColor = Color(0x33000000)

    // 스텝 1: `AsyncImage`, `Spacer`, `Column`, `Text`로
    // 레이아웃을 만들어보세요.
//    Card(
//        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
//        modifier = Modifier.padding(4.dp),
//    ) {
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.padding(8.dp)
//        ) {
//            // 스텝 1: `AsyncImage`, `Spacer`, `Column`, `Text`로
//            // 레이아웃을 만들어보세요.
//            AsyncImage(
//                model = cardData.imageUri,
//                contentDescription = cardData.imageDescription,
//                modifier = Modifier.size(32.dp)
//            )
//            Spacer(modifier = Modifier.size(8.dp))
//            Column{
//                Text(
//                    text = cardData.author,
//                )
//                Spacer(modifier = Modifier.size(4.dp))
//                Text(
//                    text = cardData.description,
//                )
//            }
    // 스텝 2: `AsyncImage`에는 `placeholder`를 지정하고,
    // `contentScale`을 `ContentScale.Crop`으로 설정합시다.
    // `clip(CircleShape)`로 둥근 외양을 만들어 봅시다.

    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
        modifier = Modifier.padding(4.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            AsyncImage(
                model = cardData.imageUri,
                contentScale = Crop,
                contentDescription = cardData.imageDescription,
                placeholder = ColorPainter(placeHolderColor),
                modifier = Modifier.size(32.dp)
                    .clip(CircleShape) //RoundCornerShape도 가능!!
            )
            Spacer(modifier = Modifier.size(8.dp))
            Column{
                Text(
                    text = cardData.author,
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = cardData.description,
                )
            }

        }
    }
}