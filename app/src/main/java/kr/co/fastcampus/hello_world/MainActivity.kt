package kr.co.fastcampus.hello_world

import android.content.ClipData
import android.media.RouteListingPreference
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
import kr.co.fastcampus.hello_world.practice1.components.CheckBoxEx
import kr.co.fastcampus.hello_world.practice1.components.Greeting
import kr.co.fastcampus.hello_world.practice1.components.ScaffoldEx
import kr.co.fastcampus.hello_world.practice1.components.SlotEx
import kr.co.fastcampus.hello_world.practice1.components.TextFieldEx
import kr.co.fastcampus.hello_world.practice1.components.TopAppBarEx
import kr.co.fastcampus.hello_world.practice1.model.ItemData
import kr.co.fastcampus.hello_world.ui.theme.HelloWoridTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloWoridTheme {
                //Greeting("Android")
                //ButtonEx {  }
                //ModifierEx()
                //SurfaceEx("Android")
                //BoxEx()
                //RowEx()
                //ColumnEx()
                //BoxWcEx()
                //ImgEx()
                //CoilEx()
                //CardScreen()
                //CheckBoxEx()
                //TextFieldEx()
                //TopAppBarEx("Android")

//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    SlotEx()
//                }

                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    CatalogEx(items)
                }

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

@Composable
fun CatalogEx(itemList: List<ItemData>) {
    LazyColumn {
        // 스텝 2: `items(itemList)`를 이용해 Item을 반복해서
        // 컬럼에 추가하세요.
//        item {
//            Item(itemList[0])
//        }
//        item {
//            Item(itemList[0])
//        }
        items(itemList) {
            Item(it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloWoridTheme() {
        CatalogEx(items)
    }
}


@Composable
fun Item(itemData: ItemData) {
    // 스텝 1: catalog1.png를 참고해 카드 레이아웃을 완성하세요.
    Card(
        elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = itemData.imageId),
                contentDescription = itemData.title
            )
            Spacer(
                modifier = Modifier.size(8.dp)
            )
            Text(
                text = itemData.title,
                style = MaterialTheme.typography.headlineLarge
            )
            Spacer(
                modifier = Modifier.size(8.dp)
            )
            Text(
                text = itemData.description
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ItemPreview() {
    HelloWoridTheme {
        Item(
            ItemData(
                imageId = R.drawable.a1,
                title = "해변 놀이 공원",
                description = "해변 놀이 공원 설명입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
            )
        )
    }
}

val items = listOf(
    ItemData(
        imageId = R.drawable.a1,
        title = "해변 놀이 공원",
        description = "해변 놀이 공원 설명입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a2,
        title = "캐년",
        description = "미국의 캐년입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a3,
        title = "워터월드",
        description = "워터월드입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a4,
        title = "미국의 캐년",
        description = "미국의 캐년입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a5,
        title = "라스베가스",
        description = "라스베가스입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a6,
        title = "호르슈 밴드",
        description = "호르슈 밴드입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a7,
        title = "미국의 길",
        description = "미국의 길입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a8,
        title = "엔텔로프 캐년",
        description = "엔텔로프 캐년입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
    ItemData(
        imageId = R.drawable.a9,
        title = "그랜드 캐년",
        description = "그랜드 캐년입니다. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
    ),
)
