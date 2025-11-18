package com.github.thiepai.gskotlin

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MenuScreen(
    onImcClick: () -> Unit,
    onEquipeClick: () -> Unit,
    onLogoutClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("MENU PRINCIPAL", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(30.dp))

        Button(onClick = onImcClick, modifier = Modifier.fillMaxWidth()) {
            Text("calculo de IMC")
        }

        Spacer(Modifier.height(16.dp))

        Button(onClick = onEquipeClick, modifier = Modifier.fillMaxWidth()) {
            Text("Membros")
        }

        Spacer(Modifier.height(16.dp))

        Button(onClick = onLogoutClick, modifier = Modifier.fillMaxWidth()) {
            Text("Logout")
        }
    }
}
