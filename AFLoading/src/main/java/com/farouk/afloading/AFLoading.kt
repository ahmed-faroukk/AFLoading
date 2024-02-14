// Compose library for a loading animation with three circles
package com.farouk.afloading

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun AFLoading(
    // Modifier for customizing the layout of the loading animation
    modifier: Modifier = Modifier,

    // Size of each circle in the loading animation
    circleSize: Dp = 20.dp,

    // Space between the circles in the loading animation
    spaceBetween: Dp = 10.dp,

    // Vertical travel distance of each circle during animation
    travelDistance: Dp = 20.dp,

    // Duration of the animation cycle for each circle
    animationDuration: Int = 1200,

    // Delay between the start of animations for consecutive circles
    delayBetweenCircles: Int = 100,

    // Colors for the circles
    color1: Color = Color.Yellow,
    color2: Color = Color.Cyan,
    color3: Color = Color.White,

    // Repeat mode for the animation (e.g., Restart, Reverse)
    repeatMode: RepeatMode = RepeatMode.Restart,

    // Easing function for the animation
    easing: Easing = LinearOutSlowInEasing
) {
    val circles = List(3) { index ->
        remember { Animatable(initialValue = 0f) }
            .apply {
                LaunchedEffect(key1 = this) {
                    delay(index * delayBetweenCircles.toLong())
                    animateTo(
                        targetValue = 1f,
                        animationSpec = infiniteRepeatable(
                            animation = keyframes {
                                durationMillis = animationDuration
                                0.0f at 0 with easing
                                1.0f at (animationDuration / 4) with easing
                                0.0f at (animationDuration / 2) with easing
                                0.0f at animationDuration with easing
                            },
                            repeatMode = repeatMode
                        )
                    )
                }
            }
    }

    val circleValues = circles.map { it.value }
    val distance = with(LocalDensity.current) { travelDistance.toPx() }
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(spaceBetween)
    ) {
        circleValues.forEachIndexed() { index, value ->
            Box(
                modifier = Modifier
                    .size(circleSize)
                    .graphicsLayer {
                        translationY = -value * distance
                    }
                    .background(
                        color = when (index) {
                            0 -> color1
                            1 -> color2
                            else -> color3
                        },
                        shape = CircleShape
                    )
            )
        }
    }
}
