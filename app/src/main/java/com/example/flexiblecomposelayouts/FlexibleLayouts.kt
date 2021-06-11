package com.example.flexiblecomposelayouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FlexibleLayouts() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Title("Chat Example")
        ChatExample()
        Title("Example A")
        ExampleA()
        Title("Example B")
        ExampleB()
        Title("Example C")
        ExampleC()
        Title("Example D")
        ExampleD()
    }
}

/**
 * Example A.
 * [Child2] expands to fill the remaining space.
 */
@Composable
fun ExampleA() {
    Row {
        Child1(
            modifier = Modifier.width(100.dp),
        )
        Child2(
            modifier = Modifier.weight(1f),
        )
        Child3()
    }
}

/**
 * Example B.
 * [Child2] and [Child3] expand to fill half of the remaining space each.
 */
@Composable
fun ExampleB() {
    Row {
        Child1(
            modifier = Modifier.width(80.dp),
        )
        Child2(
            modifier = Modifier.weight(1f),
        )
        Child3(
            modifier = Modifier.weight(1f),
        )
    }
}

/**
 * Example C.
 * [Child1] expands to fill 2/3 of the remaining space, [Child2] expands to fill 1/3 of the
 * remaining space.
 */
@Composable
fun ExampleC() {
    Row {
        Child1(
            modifier = Modifier.weight(2f),
        )
        Child2(
            modifier = Modifier.weight(1f),
        )
        Child3(
            modifier = Modifier.width(80.dp),
        )
    }
}

/**
 * Example D.
 * The same weights as [ExampleC], but [Child2] is not forced to fill all of the available space.
 */
@Composable
fun ExampleD() {
    Row {
        Child1(
            modifier = Modifier.weight(2f),
        )
        Child2(
            modifier = Modifier.weight(1f, fill = false),
        )
        Child3(
            modifier = Modifier.width(80.dp),
        )
    }
}
