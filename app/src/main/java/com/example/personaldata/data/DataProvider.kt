package com.example.personaldata.data

import com.example.personaldata.R

object DataProvider {
    val personal =
        personal(
            id = 1,
            name = "Muhammad Abdul Karim",
            address = "Magelang",
            image = R.drawable.img3
        )

    val personallist = listOf(
        personal,
        personal(
            id = 2,
            name = "Najwa Kamila",
            address = "Solo",
            image = R.drawable.img4
        ),
        personal(
            id = 3,
            name = "Agung Saputra",
            address = "Yogyakarta",
            image = R.drawable.img3
        ),
        personal(
            id = 4,
            name = "Dewi Nila Aini",
            address = "Magelang",
            image = R.drawable.img1
        ),
        personal(
            id = 5,
            name = "Rendi R",
            address = "Yogyakarta",
            image = R.drawable.img5
        ),
        personal(
            id = 6,
            name = "Aisya Syifa",
            address = "Solo",
            image = R.drawable.img4
        ),
        personal(
            id = 7,
            name = "Sigit Purnomo",
            address = "Yogyakarta",
            image = R.drawable.img5
        ),
        personal(
            id = 8,
            name = "Lilik N",
            address = "Magelang",
            image = R.drawable.img2
        ),
        personal(
            id = 9,
            name = "Reki Rianto",
            address = "Yogyakarta",
            image = R.drawable.img3
        ),
        personal(
            id = 10,
            name = "Danang",
            address = "Yogyakarta",
            image = R.drawable.img5
        )
    )
}