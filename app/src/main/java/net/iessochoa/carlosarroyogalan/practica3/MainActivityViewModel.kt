package net.iessochoa.carlosarroyogalan.practica3

import androidx.lifecycle.ViewModel
//Se crea la nueva clase MainActivityViewModel, hereda ViewModel
class MainActivityViewModel : ViewModel() {
    var contador : Int= 0
    //Se crea el metodo sumaUno para su manipulación
    fun sumaUno(){
        contador++
    }
}