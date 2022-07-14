package com.example.yellowbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.yellowbusinesscard.ui.theme.YellowBusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            YellowBusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

val fontNorm = FontFamily(
    Font(R.font.spacegrotesk_medium)
)

val fontMono = FontFamily(
    Font(R.font.spacemono_regular)
)

@Composable
fun BusinessCard() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // section 1
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.name),
                fontWeight = FontWeight.Bold,
                fontSize = 37.sp,
                color = colorResource(R.color.bright_yellow),
                fontFamily = fontNorm
            )
            Text(
                text = stringResource(R.string.dev_status),
                fontSize = 16.sp,
                color = colorResource(R.color.norm_yellow),
                fontFamily = fontMono
            )
        }

        Spacer(modifier = Modifier.width(5.dp))

        // divider
        Divider(
            color = colorResource(R.color.norm_yellow),
            modifier = Modifier
                .height(110.dp)
                .width(2.dp)
        )

        // section 2
        Column(
            Modifier.weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = null,
                    Modifier.weight(1f),
                    colorResource(R.color.norm_yellow)
                )
                Text(
                    text = stringResource(R.string.phone_no),
                    Modifier.weight(3f),
                    color = colorResource(R.color.norm_yellow),
                    fontFamily = fontNorm
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = null,
                    Modifier.weight(1f),
                    colorResource(R.color.norm_yellow)
                )
                Text(
                    text = stringResource(R.string.email),
                    Modifier.weight(3f),
                    color = colorResource(R.color.norm_yellow),
                    fontFamily = fontNorm
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = null,
                    Modifier.weight(1f),
                    colorResource(R.color.norm_yellow)
                )
                Text(
                    text = stringResource(R.string.website),
                    Modifier.weight(3f),
                    color = colorResource(R.color.norm_yellow),
                    fontFamily = fontNorm
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    YellowBusinessCardTheme {
        BusinessCard()
    }
}