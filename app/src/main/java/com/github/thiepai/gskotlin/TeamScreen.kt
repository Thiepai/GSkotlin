package com.github.thiepai.gskotlin


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TeamScreen(integrantes: List<String>, onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Equipe", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(20.dp))

        integrantes.forEach {
            Text(it, style = MaterialTheme.typography.bodyLarge)
            Spacer(Modifier.height(10.dp))
        }

        Spacer(Modifier.height(30.dp))

        Button(onClick = onBack) {
            Text("Voltar")
        }
    }
}

