package com.example.athione

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.VisualTransformation
import com.example.athione.ui.theme.aeroColors

@Composable
fun AeroTextField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    textStyle: TextStyle = LocalTextStyle.current,
    label: @Composable (() -> Unit)? = null,
    placeholder: @Composable (() -> Unit)? = null,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    prefix: @Composable (() -> Unit)? = null,
    suffix: @Composable (() -> Unit)? = null,
    supportingText: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    shape: Shape = OutlinedTextFieldDefaults.shape,
    colors: TextFieldColors = aeroTextFieldColors()
)
{
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        enabled = enabled,
        readOnly = readOnly,
        textStyle = textStyle,
        label = label,
        placeholder = placeholder,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        prefix = prefix,
        suffix = suffix,
        supportingText = supportingText,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
        minLines = minLines,
        interactionSource = interactionSource,
        shape = shape,
        colors = colors
    )
}

@Composable
fun aeroTextFieldColors(
    focusedTextColor: Color = MaterialTheme.aeroColors.onAeroSurface,
    unfocusedTextColor: Color = MaterialTheme.aeroColors.onAeroSurface,
    disabledTextColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorTextColor: Color = MaterialTheme.aeroColors.onAeroSurface,
    focusedContainerColor: Color = Color.Transparent,
    unfocusedContainerColor: Color = Color.Transparent,
    disabledContainerColor: Color = Color.Transparent,
    errorContainerColor: Color = Color.Transparent,
    cursorColor: Color = MaterialTheme.colorScheme.primary,
    errorCursorColor: Color = MaterialTheme.colorScheme.error,
    selectionColors: TextSelectionColors = LocalTextSelectionColors.current,
    focusedBorderColor: Color = MaterialTheme.colorScheme.primary,
    unfocusedBorderColor: Color = MaterialTheme.aeroColors.aeroOutline,
    disabledBorderColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.12f),
    errorBorderColor: Color = MaterialTheme.colorScheme.error,
    focusedLeadingIconColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    unfocusedLeadingIconColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledLeadingIconColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorLeadingIconColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    focusedTrailingIconColor: Color = MaterialTheme.colorScheme.primary,
    unfocusedTrailingIconColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledTrailingIconColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorTrailingIconColor: Color = MaterialTheme.colorScheme.error,
    focusedLabelColor: Color = MaterialTheme.colorScheme.primary,
    unfocusedLabelColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledLabelColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorLabelColor: Color = MaterialTheme.colorScheme.error,
    focusedPlaceholderColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    unfocusedPlaceholderColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledPlaceholderColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorPlaceholderColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    focusedSupportingTextColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    unfocusedSupportingTextColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledSupportingTextColor: Color = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
    errorSupportingTextColor: Color = MaterialTheme.colorScheme.error,
    focusedPrefixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    unfocusedPrefixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledPrefixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant.copy(alpha = 0.38f),
    errorPrefixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    focusedSuffixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    unfocusedSuffixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant,
    disabledSuffixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant.copy(alpha = 0.38f),
    errorSuffixColor: Color = MaterialTheme.aeroColors.onAeroSurfaceVariant
): TextFieldColors =

    OutlinedTextFieldDefaults.colors(
//        focusedTextColor = MaterialTheme.aeroColors.onAeroSurface,
//        unfocusedTextColor = MaterialTheme.aeroColors.onAeroSurface,
//        disabledTextColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorTextColor = MaterialTheme.aeroColors.onAeroSurface,
//        focusedContainerColor = Color.Transparent,
//        unfocusedContainerColor = Color.Transparent,
//        disabledContainerColor = Color.Transparent,
//        errorContainerColor = Color.Transparent,
//        cursorColor = MaterialTheme.colorScheme.primary,
//        errorCursorColor = MaterialTheme.colorScheme.error,
//        selectionColors = LocalTextSelectionColors.current,
//        focusedBorderColor = MaterialTheme.colorScheme.error,
//        unfocusedBorderColor = MaterialTheme.colorScheme.outline,
//        disabledBorderColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.12f),
//        errorBorderColor = MaterialTheme.colorScheme.error,
//        focusedLeadingIconColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        unfocusedLeadingIconColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledLeadingIconColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorLeadingIconColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        focusedTrailingIconColor = MaterialTheme.colorScheme.error,
//        unfocusedTrailingIconColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledTrailingIconColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorTrailingIconColor = MaterialTheme.colorScheme.error,
//        focusedLabelColor = MaterialTheme.colorScheme.primary,
//        unfocusedLabelColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledLabelColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorLabelColor = MaterialTheme.colorScheme.error,
//        focusedPlaceholderColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        unfocusedPlaceholderColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledPlaceholderColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorPlaceholderColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        focusedSupportingTextColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        unfocusedSupportingTextColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledSupportingTextColor = MaterialTheme.aeroColors.onAeroSurface.copy(alpha = 0.38f),
//        errorSupportingTextColor = MaterialTheme.colorScheme.error,
//        focusedPrefixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        unfocusedPrefixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledPrefixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant.copy(alpha = 0.38f),
//        errorPrefixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        focusedSuffixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        unfocusedSuffixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant,
//        disabledSuffixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant.copy(alpha = 0.38f),
//        errorSuffixColor = MaterialTheme.aeroColors.onAeroSurfaceVariant
        focusedTextColor = focusedTextColor,
        unfocusedTextColor = unfocusedTextColor,
        disabledTextColor = disabledTextColor,
        errorTextColor = errorTextColor,
        focusedContainerColor = focusedContainerColor,
        unfocusedContainerColor = unfocusedContainerColor,
        disabledContainerColor = disabledContainerColor,
        errorContainerColor = errorContainerColor,
        cursorColor = cursorColor,
        errorCursorColor = errorCursorColor,
        selectionColors = selectionColors,
        focusedBorderColor = focusedBorderColor,
        unfocusedBorderColor = unfocusedBorderColor,
        disabledBorderColor = disabledBorderColor,
        errorBorderColor = errorBorderColor,
        focusedLeadingIconColor = focusedLeadingIconColor,
        unfocusedLeadingIconColor = unfocusedLeadingIconColor,
        disabledLeadingIconColor = disabledLeadingIconColor,
        errorLeadingIconColor = errorLeadingIconColor,
        focusedTrailingIconColor = focusedTrailingIconColor,
        unfocusedTrailingIconColor = unfocusedTrailingIconColor,
        disabledTrailingIconColor = disabledTrailingIconColor,
        errorTrailingIconColor = errorTrailingIconColor,
        focusedLabelColor = focusedLabelColor,
        unfocusedLabelColor = unfocusedLabelColor,
        disabledLabelColor = disabledLabelColor,
        errorLabelColor = errorLabelColor,
        focusedPlaceholderColor = focusedPlaceholderColor,
        unfocusedPlaceholderColor = unfocusedPlaceholderColor,
        disabledPlaceholderColor = disabledPlaceholderColor,
        errorPlaceholderColor = errorPlaceholderColor,
        focusedSupportingTextColor = focusedSupportingTextColor,
        unfocusedSupportingTextColor = unfocusedSupportingTextColor,
        disabledSupportingTextColor = disabledSupportingTextColor,
        errorSupportingTextColor = errorSupportingTextColor,
        focusedPrefixColor = focusedPrefixColor,
        unfocusedPrefixColor = unfocusedPrefixColor,
        disabledPrefixColor = disabledPrefixColor,
        errorPrefixColor = errorPrefixColor,
        focusedSuffixColor = focusedSuffixColor,
        unfocusedSuffixColor = unfocusedSuffixColor,
        disabledSuffixColor = disabledSuffixColor,
        errorSuffixColor = errorSuffixColor,
    )
