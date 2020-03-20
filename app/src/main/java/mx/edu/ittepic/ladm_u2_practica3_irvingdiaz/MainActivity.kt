package mx.edu.ittepic.ladm_u2_practica3_irvingdiaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var jugador1 = HiloControl(this)
    var juego = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("JUEGO DADOS - Irving Díaz")
     button.setOnClickListener {
         if(!jugador1.isAlive){
             jugador1.start()
             Toast.makeText(this,"SE INICIO JUEGO",Toast.LENGTH_LONG).show()
         }else{
             if(jugador1.status()){
                 Toast.makeText(this,"ESTÁ EN JUEGO",Toast.LENGTH_LONG).show()
             }else{
                 jugador1.despausar()
                 Toast.makeText(this,"SE INICIO JUEGO",Toast.LENGTH_LONG).show()
             }
         }
     }
    }
}
