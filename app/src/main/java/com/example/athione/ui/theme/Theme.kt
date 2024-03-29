package com.example.athione.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat


// --------------------------

@Immutable
data class AeroColors(
    val aeroSurface: Color = Color.Unspecified,
    val onAeroSurface: Color = Color.Unspecified,
    val aeroSurfaceVariant: Color = Color.Unspecified,
    val onAeroSurfaceVariant: Color = Color.Unspecified,
    val aeroOutline: Color = Color.Unspecified,
)

val AeroLightColorScheme = AeroColors(
//    aeroSurface = Color(0x20F5F5F5),
    aeroSurface = Color(0x50FFFFFF),
    onAeroSurface = Color(0xFF202020),
    aeroSurfaceVariant = Color(0x80EBEBEB),
    onAeroSurfaceVariant = Color(0xFF404040),
    aeroOutline = Color(0xFF303030),
)

val LocalAeroColors = staticCompositionLocalOf { AeroColors() }

val MaterialTheme.aeroColors : AeroColors
    @Composable
    @ReadOnlyComposable
    get() = LocalAeroColors.current


fun AeroColors.contentColorFor(backgroundColor: Color): Color =
    when (backgroundColor) {
        aeroSurface -> onAeroSurface
        else -> Color.Unspecified
    }

// --------------------------


private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
//    primary = Purple40,
//    secondary = PurpleGrey40,
//    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */

    primary = aether_light_primary,
    onPrimary = aether_light_onPrimary,
    primaryContainer = aether_light_primaryContainer,
    onPrimaryContainer = aether_light_onPrimaryContainer,

    secondary = aether_light_secondary,
    onSecondary = aether_light_onSecondary,
    secondaryContainer = aether_light_secondaryContainer,
    onSecondaryContainer = aether_light_onSecondaryContainer,

    tertiary = aether_light_tertiary,
    onTertiary = aether_light_onTertiary,
    tertiaryContainer = aether_light_tertiaryContainer,
    onTertiaryContainer = aether_light_onTertiaryContainer,

    error = aether_light_error,
    onError = aether_light_onError,
    errorContainer = aether_light_errorContainer,
    onErrorContainer = aether_light_onErrorContainer,

    surface = aether_light_surface,
    onSurface = aether_light_onSurface,
    surfaceVariant = aether_light_surfaceVariant,
    onSurfaceVariant = aether_light_onSurfaceVariant,

    inversePrimary = aether_light_inversePrimary,
    inverseSurface = aether_light_inverseSurface,
    inverseOnSurface = aether_light_inverseOnSurface,

    outline = aether_light_outline,
    outlineVariant = aether_light_outlineVariant,
    scrim = aether_light_scrim,

    background = aether_light_background,
    onBackground = aether_light_onBackground,
    surfaceTint = aether_light_surfaceTint,
)

@Composable
fun AthiOneTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    // Aero ------
    val aeroColors = AeroLightColorScheme
    // -----------

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    CompositionLocalProvider(
        LocalAeroColors provides aeroColors
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = Typography,
            content = content
        )
    }
}