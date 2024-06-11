package com.example.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

//Para crear un componen es @Composbled
//Aqui crearemos el componente
//Definios la funcion asi


@Composable
fun Columna (){
    //TODO EL ANCHO Y TODO EL ALTO DE ESA CLOLUMNA ALTO Y ANCHO DE LA PANTALLA
    Column(
        //AQUI VAN LAS PROPIEDADES
        Modifier
            .fillMaxSize()
            .padding(top = 25.dp),
        //PROPIEDAD PARA DARLE ESPACIO
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        //AQUI PODEMOS DEFINIR OTRO COMPONENTE DENTRO DE ESTE COMPONENTEsssss
        Text(text="Gean Uribe pxx",
            Modifier
                .fillMaxWidth()
                .background(Color.Blue))
        Text(text="Camila Uribe pxx",
            Modifier
                .fillMaxWidth()
                .background(Color.Green))
        Text(text="Angel Uribe pxx",
            Modifier
                .fillMaxWidth()
                .background(Color.Transparent))
        Text(text="Gean Uribe pxx",
            Modifier
                .fillMaxWidth()
                .background(Color.Yellow))
    }
}

@Composable
fun Box(weight: Modifier, function: () -> Unit) {

 androidx.compose.foundation.layout.Box (modifier = Modifier
     .fillMaxSize()
     .background(Color.Green), contentAlignment =  Alignment.Center)
 {
     androidx.compose.foundation.layout.Box(modifier = Modifier
         .fillMaxSize()
         .background(Color.Yellow)
         .padding(25.dp)
         .width(200.dp)
         .height(200.dp),
         contentAlignment = Alignment.Center)
     {
         Text(text = "Hola Mundo")
     }

 }

}


@Composable
fun Espacio(tamanio:Int){
    Spacer(modifier = Modifier.height(tamanio.dp))
}


@Composable
fun Container(){
   Column (modifier = Modifier.fillMaxSize()){
       androidx.compose.foundation.layout.Box(
           Modifier
               .fillMaxWidth()
               .background(Color.Blue)
               .weight(1f),
           contentAlignment = Alignment.Center
       ){
           Text(text = "Geancarlo Uribe Inoñan")
       }
       Espacio(tamanio = 45)
       Row(
           Modifier
               .fillMaxWidth()
               .background(Color.Red)
               .weight(1f)){
           Text(text = "Hola Desde el Row")

       }
   }

}