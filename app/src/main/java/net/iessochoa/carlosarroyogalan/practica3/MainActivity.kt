package net.iessochoa.carlosarroyogalan.practica3

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.iessochoa.carlosarroyogalan.practica3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Definimos la instancia Binding de la clase
    private lateinit var binding: ActivityMainBinding
    var num:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
}