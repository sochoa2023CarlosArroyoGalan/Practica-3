package net.iessochoa.carlosarroyogalan.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
//Se crea la nueva clase MainActivityViewModel, hereda ViewModel
class MainActivityViewModel : ViewModel() {
    //var contador : Int= 0
    //Cambiamos el view model, ahora sera un MutableLiveData de tipo Int, haciendo que contenga un valor de tipo entero, se inicializa con el valor 0
    private val contador=MutableLiveData<Int>(0)
    //Creamos un valor para los asteriscos mutable y te tipo string
    private val asteriscos=MutableLiveData<String>("")
    //Se crea el metodo sumaUno para su manipulación

    //Metodo que cuando cambia el valor cualquiera que lo oberva es avisado
    fun SumaAsteriscos(){
        asteriscos.value= asteriscos.value?.plus("*")
    }
    //Nos devuelve el LiveData y lo observamos en el activity, es decir que nos devuelve el resultado cada vez que se pulsa
    fun getAsteriscos():LiveData<String>{
        return asteriscos
    }
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