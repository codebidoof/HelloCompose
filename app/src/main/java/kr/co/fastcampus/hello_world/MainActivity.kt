package kr.co.fastcampus.hello_world

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import kr.co.fastcampus.hello_world.practice.screens.BoxEx
import kr.co.fastcampus.hello_world.practice.screens.BoxWcEx
import kr.co.fastcampus.hello_world.practice.screens.ButtonEx
import kr.co.fastcampus.hello_world.practice.screens.ColumnEx
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
                BoxWcEx()
            }
        }
    }
}
