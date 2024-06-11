package com.example.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import java.lang.reflect.Modifier
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun definirImc(){

    androidx.compose.foundation.layout.Box (modifier = androidx.compose.ui.Modifier
        .fillMaxSize()
        .padding(top = 30.dp))
    {
        var talla by remember {
            mutableStateOf("")
        }
        var peso by remember {
            mutableStateOf("")
        }
        var resultado by remember {
            mutableStateOf("")
        }
        Column {
            Text(text = "Calculador Imc", textAlign = TextAlign.Center , modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )
            Espacio(10)
            OutlinedTextField(value = talla, onValueChange = {talla = it}
                ,modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                label = { Text(text = "Ingrese su talla en cm: ")},
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Espacio(10)
            OutlinedTextField(value = peso , onValueChange = {peso = it}
                ,modifier = androidx.compose.ui.Modifier.fillMaxWidth(),
                label = { Text(text = "Ingrese su peso en KG : ")},
                maxLines = 1,
                singleLine = true,
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Espacio(10)
            Button(onClick = {resultado = calcularImc(talla.toDouble(),peso.toDouble())},
            modifier = androidx.compose.ui.Modifier.fillMaxWidth()
            )
            {
                Text(text = "Calcular Imc")
            }
            Espacio(tamanio = 10)
            Text(text = resultado)
        }
    }
}

fun calcularImc(talla: Double, peso: Double): String {

    var tallam = talla/100
    var imc = peso / (tallam * tallam)
    var diagnostico = ""

    if(imc <= 16.5){
        diagnostico = "Debajo del peso"
    }
    else if(imc <= 20){
        diagnostico="peso normal"
    }
    else{
        diagnostico="Aqui entro px"
    }
    return "Su valor imc es : $imc usted se encuentra $diagnostico"
}


