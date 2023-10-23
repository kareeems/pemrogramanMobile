package com.example.personaldata

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import com.example.personaldata.data.DataProvider

@Composable
fun HomeContent() {
    val personals = remember { DataProvider.personallist }
    LazyColumn(
        contentPadding = PaddingValues(16.dp,8.dp)
    ){
        items(
            items = personals,
            itemContent = {
                PersonalListItem(personal = it)
            }
        )
    }
}