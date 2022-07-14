package com.example.yellowbusinesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

@Composable
fun BusinessCard() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan),
        verticalAlignment = Alignment.CenterVertically
    ) {
        // section 1
        Column(Modifier.weight(1f)) {
            Text(
                text = "Kelvin",
                fontWeight = FontWeight.Bold,
                fontSize = 43.sp
            )
            Text(
                text = "Android Developer",
                fontSize = 18.sp
            )
        }
        // section 2
        Column(Modifier.weight(1f)) {
            Row {
                Icon(
                    imageVector = Icons.Outlined.Phone,
                    contentDescription = "call",
                    Modifier.weight(1f)
                )
                Text(
                    text = "123 456 789",
                    Modifier.weight(3f)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Email,
                    contentDescription = "email",
                    Modifier.weight(1f)
                )
                Text(
                    text = "developer@gmail.com",
                    Modifier.weight(3f)
                )
            }

            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Icon(
                    imageVector = Icons.Outlined.Home,
                    contentDescription = "website",
                    Modifier.weight(1f)
                )
                Text(
                    text = "myWebsite.com",
                    Modifier.weight(3f)
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