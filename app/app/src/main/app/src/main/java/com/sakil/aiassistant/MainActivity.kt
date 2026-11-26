
package com.sakil.aiassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SakilAssistant()
        }
    }
}

@Composable
fun SakilAssistant() {
    var message by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(Color(0xFF080B18), Color(0xFF15102D))
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                "SAKIL AI",
                color = Color.Cyan,
                fontSize = 30.sp
            )

            Spacer(Modifier.height(40.dp))

            Box(
                modifier = Modifier
                    .size(180.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(Color.Cyan, Color(0xFF8A2BE2))
                        ),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text("AI", color = Color.White, fontSize = 48.sp)
            }

            Spacer(Modifier.height(40.dp))

            OutlinedTextField(
                value = message,
                onValueChange = { message = it },
                label = { Text("Ask me anything") }
            )

            Spacer(Modifier.height(16.dp))

            Button(onClick = { message = "" }) {
                Text("START")
            }
        }
    }
}
