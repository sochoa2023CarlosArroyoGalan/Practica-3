package net.iessochoa.carlosarroyogalan.practica3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import net.iessochoa.carlosarroyogalan.practica3.databinding.ActivityMainBinding
//Nos permite localizar los mensajes de nuestra app en el logcat
private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {
    //Definimos la instancia Binding de la clase
    private lateinit var binding: ActivityMainBinding
    //var num:Int = 0
    //Definimos la instacia en la que delegamos su creación mediante by
    val model:MainActivityViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Enviara un mensaje al logcat cuando se ejecute
        Log.i(TAG, "onCreate")
        //Se elimina el inflado y se sustituye, permitiendonos acceder a los views del layout
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //Cambiaremos el codigo para utilizar los datos de ViewModel, para ello iniciamos el contador. Si es la primera vez, a cero, si es una reconstrucción, lo hará al valor que tenía.
        binding.tvNumero.text=model.contador.toString()
        binding.btSumaUno.setOnClickListener(){
        //Sumamos uno.
            model.sumaUno()
        //Mostramos el valor.
            binding.tvNumero.text=model.contador.toString()
        }

        /*
        //Nos permite inicializar tvNumero
        binding.tvNumero.text=num.toString()
        //Asignamos la acción de sumar 1 al contenido de tvNumero
        binding.btSumaUno.setOnClickListener(){
            num++
            binding.tvNumero.text=num.toString()
        }*/
    }
    //Enviaran mensajes al logcat
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }
    override fun onPause() {
        Log.i(TAG, "onPause")
        super.onPause()
    }
    override fun onStop() {
        Log.i(TAG, "onStop")
        super.onStop()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }
    override fun onDestroy() {
        Log.i(TAG, "onDestroy")
        super.onDestroy()
    }
}