package net.iessochoa.carlosarroyogalan.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Se crea la nueva clase MainActivityViewModel, hereda ViewModel
class MainActivityViewModel : ViewModel() {
    //var contador : Int= 0
    //Cambiamos el view model, ahora sera un MutableLiveData de tipo Int, haciendo que contenga un valor de tipo entero, se inicializa con el valor 0
    private val contador=MutableLiveData<Int>(0)
    //Se crea el metodo sumaUno para su manipulación
    fun sumaUno(){
        //contador++
        //Cuando cambiamos el valor cualquiera que lo observe será avisado
        contador.value= contador.value?.plus(1)
    }
    //Metodo que nos devuelve el LiveData para observarlo en el activity
    fun getContador():LiveData<Int>{
        return contador
    }
}