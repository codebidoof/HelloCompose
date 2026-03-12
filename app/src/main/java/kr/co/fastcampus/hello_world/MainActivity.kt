package kr.co.fastcampus.hello_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import kr.co.fastcampus.hello_world.practice.CardData
import kr.co.fastcampus.hello_world.practice.screens.BoxEx
import kr.co.fastcampus.hello_world.practice.screens.BoxWcEx
import kr.co.fastcampus.hello_world.practice.screens.ButtonEx
import kr.co.fastcampus.hello_world.practice.screens.CardScreen
import kr.co.fastcampus.hello_world.practice.screens.CoilEx
import kr.co.fastcampus.hello_world.practice.screens.ColumnEx
import kr.co.fastcampus.hello_world.practice.screens.ImgEx
import kr.co.fastcampus.hello_world.practice.screens.ModifierEx
import kr.co.fastcampus.hello_world.practice.screens.RowEx
import kr.co.fastcampus.hello_world.practice.screens.SurfaceEx
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWoridTheme {
                //ButtonEx {  }
                //ModifierEx()
                //SurfaceEx("Android")
                //BoxEx()
                //RowEx()
                //ColumnEx()
                //BoxWcEx()
                //ImgEx()
                //CoilEx()
                CardScreen()
            }
        }
    }

    companion object {
        val cardData = CardData(
            imageUri = "https://raw.githubusercontent.com/Fastcampus-JetpackCompose-1/part1-chapter3/refs/heads/main/part1-chapter3-10/app/src/main/res/drawable-hdpi/wall.jpg",
            imageDescription = "엔텔로프 캐년",
            author = "Dalinaum",
            description = "엔텔로프 캐년은 죽기 전에 꼭 봐야할 절경으로 소개되었습니다."
        )
    }
}
