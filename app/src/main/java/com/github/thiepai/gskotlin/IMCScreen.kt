package com.github.thiepai.gskotlin

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ImcScreen(onBack: () -> Unit) {
    var peso by remember { mutableStateOf("") }
    var altura by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text("Cálculo de IMC", style = MaterialTheme.typography.headlineMedium)
        Spacer(Modifier.height(20.dp))

        OutlinedTextField(
            value = peso,
            onValueChange = { peso = it },
            label = { Text("Peso (kg)") }
        )

        Spacer(Modifier.height(12.dp))

        OutlinedTextField(
            value = altura,
            onValueChange = { altura = it },
            label = { Text("Altura (m)") }
        )

        Spacer(Modifier.height(20.dp))

        Button(onClick = {
            val p = peso.toFloatOrNull()
            val a = altura.toFloatOrNull()
            if (p != null && a != null && a > 0) {
                val imc = p / (a * a)
                resultado = "Seu valor de IMC é: %.2f".format(imc)
            }
        }) {
            Text("Calcular")
        }

        Spacer(Modifier.height(20.dp))
        Text(resultado)

        Spacer(Modifier.height(30.dp))
        Button(onClick = onBack) {
            Text("Voltar")
        }
    }
}
