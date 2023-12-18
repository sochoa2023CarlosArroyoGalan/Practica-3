package net.iessochoa.carlosarroyogalan.practica3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import net.iessochoa.carlosarroyogalan.practica3.databinding.ActivityMainBinding
//Nos permite localizar los mensajes de nuestra app en el logcat
private const val TAG = "practica3"
class MainActivity : AppCompatActivity() {
    //Definimos la instancia Binding de la clase
    private lateinit var binding: ActivityMainBinding
    var num:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Enviara un mensaje al logcat cuando se ejecute
        Log.i(TAG, "onCreate")
        //Se elimina el inflado y se sustituye, permitiendonos acceder a los views del layout
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Nos permite inicializar tvNumero
        binding.tvNumero.text=num.toString()
        //Asignamos la acción de sumar 1 al contenido de tvNumero
        binding.btSumaUno.setOnClickListener(){
            num++
            binding.tvNumero.text=num.toString()
        }
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