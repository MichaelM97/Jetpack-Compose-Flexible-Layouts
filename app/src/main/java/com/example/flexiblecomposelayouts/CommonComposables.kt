package com.example.flexiblecomposelayouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 10.dp),
    )
}

@Composable
fun Child1(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(100.dp)
            .background(color = Color.Cyan),
    ) {
        ChildText(
            text = "Child 1",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Composable
fun Child2(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(100.dp)
            .background(color = Color.Green),
    ) {
        ChildText(
            text = "Child 2",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Composable
fun Child3(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .height(100.dp)
            .background(color = Color.Yellow),
    ) {
        ChildText(
            text = "Child 3",
            modifier = Modifier.align(Alignment.Center),
        )
    }
}

@Composable
private fun ChildText(text: String, modifier: Modifier) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        textAlign = TextAlign.Center,
        modifier = modifier,
    )
}
