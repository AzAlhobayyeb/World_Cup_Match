package com.example.worldcupmatchs.model

import androidx.annotation.DrawableRes

data class Match(
    val name: String,
    val time: String,
    val stadium: String,
    @DrawableRes val image1: Int,
    @DrawableRes val image2: Int
)
