package com.example.athione

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex
import com.example.athione.ui.theme.AthiOneTheme
import com.zedalpha.shadowgadgets.compose.clippedShadow
import java.util.Locale

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AthiOneTheme {
                // A surface container using the 'background' color from the theme
                AetherApp()
            }
        }
    }
}

@Composable
fun LoginPage(modifier: Modifier = Modifier)
{
    var login by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
            modifier = modifier
                .fillMaxHeight()
                //.background(Color(0xFF459ADD)),
                .background(brush = Brush.verticalGradient(listOf(Color(0xFF4E97D1), Color(0xFF7BADD1)))),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.aether_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxSize(),
                alpha = 0.3f
            )
            AeroSurface(
                modifier = Modifier
                    .clippedShadow(elevation = 16.dp, shape = RoundedCornerShape(16.dp)),
                shape = RoundedCornerShape(16.dp),
                // color = Color(0x99FFFFFF),
                //shadowElevation = 16.dp
            ) {
                Column(
                    // modifier = modifier,
                    modifier = Modifier
                        .padding(vertical = 24.dp, horizontal = 16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = stringResource(id = R.string.title_sign_in),
                        style = MaterialTheme.typography.headlineMedium
                    )
                    Spacer(modifier = Modifier.height(24.dp))

                    OutlinedTextField(
                        value = login,
                        label = { Text(stringResource(id = R.string.label_login)) },
                        onValueChange = {login = it},
                        singleLine = true
                    )
                    Spacer(modifier = Modifier.height(18.dp))
                    OutlinedTextField(
                        // TODO: show password checkbox
                        // TODO: figure out keyboard nuances
                        value = password,
                        label = { Text(stringResource(id = R.string.label_password)) },
                        onValueChange = {password = it},
                        singleLine = true,
                        visualTransformation = PasswordVisualTransformation(),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                    )
                    Spacer(modifier = Modifier.height(18.dp))

                    Button(onClick = {}) {
                        Text(stringResource(id = R.string.button_sign_in_account))
                    }
                    Spacer(modifier = Modifier.height(36.dp))

                    Text(
                        text = stringResource(id = R.string.label_no_account),
                        style = MaterialTheme.typography.bodyMedium,
                        fontStyle = FontStyle.Italic
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    FilledTonalButton(onClick = {}) {
                        Text(stringResource(id = R.string.button_register))
                    }
                }
            }
        }
}

@Composable
fun AetherApp()
{
    LoginPage(
        modifier = Modifier
            .fillMaxSize()
            //.wrapContentSize(Alignment.Center)
    )
}


@Preview(
    showBackground = true,
    locale = "ru"
)
@Composable
fun GreetingPreview() {
    AthiOneTheme {
        AetherApp()
    }
}