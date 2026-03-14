package kr.co.fastcampus.hello_world.practice1.components

import androidx.compose.foundation.clickable
import androidx.compose.material3.Checkbox
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

// CheckedBoxEx
// CheckedBoxEx2 composable 함수
// setContent
@Composable
fun CheckBoxEx() {
    Column{
        // 스텝 1: Checkbox를 만들어봅시다. checked 속성은 false
        // onCheckedChange는 비워둡시다.
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {})
            Text(text = "프로그래머입니까?")
        }

        // 스텝 2: onCheckedChange에서 boolean 값 변수를 바꾸고
        // checked에서 그 값을 반영해봅시다. (잘 되지 않습니다.)
        // recomposition이 일어나려면 '상태(mutableStateOf)'가 바뀌어야함
//        var checked = false
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Checkbox(
//                checked = checked,
//                onCheckedChange = {
//                    checked = !checked
//                })
//            Text(text = "프로그래머입니까?")
//        }

        // destruction // 비구조화, 반구조화, 구조분해
        val (a, b) = listOf(2, 3)

        // 스텝 3: boolean 대신 remember { mutableStateOf(false) }를
        // 사용하여 상태를 도입합시다. (value 프로퍼티를 이용해야 합니다.)
//        var checked = remember { mutableStateOf(false) }
//        Row(verticalAlignment = Alignment.CenterVertically) {
//            Checkbox(
//                checked = checked.value,
//                onCheckedChange = {
//                    checked.value = !checked.value
//                })
//            Text(text = "프로그래머입니까?")
//        }

        // 위임된 속성
        // var checked = remember { mutableStateOf(false)}
        // checked가 value프로퍼티인 것처럼
        // 스텝 4: delegated properties로 변경해봅시다.
        var _checked by remember { mutableStateOf(false) }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = _checked,
                onCheckedChange = {
                    _checked = !_checked
                })
            Text(text = "프로그래머입니까?")
        }

        // 스텝 5: destruction으로 상태를 받아서 사용해봅시다. // value의 (게터, 세터)
        val (getter, setter) = remember { mutableStateOf(false) }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Checkbox(
                checked = getter,
                onCheckedChange = setter //setter(!checked)가 호출되서 value프로퍼티의 값이 바뀜 -> 그걸 관찰해서 감지 -> recomposition
            )
            Text(
                text = "프로그래머입니까?",
                modifier = Modifier.clickable{
                    setter(!getter)
                })
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CheckBoxExPreview() {
    CheckBoxEx()
}