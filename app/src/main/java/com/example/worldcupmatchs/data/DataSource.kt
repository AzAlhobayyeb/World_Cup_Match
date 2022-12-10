package com.example.worldcupmatchs.data


import com.example.worldcupmatchs.R
import com.example.worldcupmatchs.model.Match

class DataSource {

    fun matchsData(): List<Match> {
        return listOf(
            Match(
                "Qatar vs Ecuador",
                "19:00",
                "Al Bayt Stadium",
                R.drawable.qatar,
                R.drawable.ecuador
            ),
            Match(
                "Saudi Arabia vs Argentina",
                "13:00",
                "Lusail Stadium",
                R.drawable.saudiarabia,
                R.drawable.argentina
            ),
            Match(
                "Poland vs Mexico",
                "18:00",
                "Stadium 974",
                R.drawable.poland_4_,
                R.drawable.mexico
            ),
            Match(
                "Mexico vs Argentina",
                "22:00",
                "Lusail Stadium",
                R.drawable.mexico,
                R.drawable.argentina
            ),
            Match(
                "Saudi Arabia vs Poland",
                "16:00",
                "Education City Stadium",
                R.drawable.saudiarabia,
                R.drawable.poland_4_
            )
        )
    }
}