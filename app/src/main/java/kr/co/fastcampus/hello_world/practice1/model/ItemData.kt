package kr.co.fastcampus.hello_world.practice1.model

import androidx.annotation.DrawableRes

data class ItemData(
    @DrawableRes val imageId: Int,
    val title: String,
    val description: String,
)
