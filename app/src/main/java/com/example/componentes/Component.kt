package com.example.componentes

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Element(){
    Box(
        Modifier
            .fillMaxSize()
            .padding(top = 30.dp)){
        Column{
            Text(text="Calcular ImcXDDDSSSS",
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth())
        }
    }
}
