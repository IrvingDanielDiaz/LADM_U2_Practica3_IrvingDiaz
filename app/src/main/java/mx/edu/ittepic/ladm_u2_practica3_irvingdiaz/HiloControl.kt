package mx.edu.ittepic.ladm_u2_practica3_irvingdiaz

import android.app.AlertDialog
import android.graphics.Canvas
import android.graphics.Paint
import kotlinx.android.synthetic.main.activity_main.*

public class HiloControl(p:MainActivity):Thread(){
    var puntero = p
    var totalJ1 = 0
    var totalJ2 = 0
    var totalJ3 = 0
    var totalJ4 = 0
    var sleepT = 600.toLong()
    var auxiliar = 0
    var vivo = true
    override fun run() {
        super.run()
        while (true){

if(vivo) {

    sleep(sleepT)
    puntero.runOnUiThread {
        reiniciar()
        jugando1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador1turno1.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador1turno1.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador2turno1.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador2turno1.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador3turno1.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador3turno1.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    //--------------------------------
    puntero.runOnUiThread {
        jugando4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador4turno1.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador4turno1.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
//-----------------------------------2DA RONDA
    sleep(sleepT)
    puntero.runOnUiThread {
        jugando1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador1turno2.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador1turno2.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador2turno2.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador2turno2.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador3turno2.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador3turno2.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    //--------------------------------
    puntero.runOnUiThread {
        jugando4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador4turno2.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador4turno2.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)

    //---------------------3ra ronda

    sleep(sleepT)
    puntero.runOnUiThread {
        jugando1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador1turno3.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador1turno3.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador2turno3.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador2turno3.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador3turno3.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador3turno3.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    //--------------------------------
    puntero.runOnUiThread {
        jugando4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador4turno3.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador4turno3.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
    //--------------4TA RONDA
    sleep(sleepT)
    puntero.runOnUiThread {
        jugando1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador1turno4.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador1turno4.setText("" + auxiliar)
        totalJ1 += auxiliar
        totalj1()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador2turno4.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador2turno4.setText("" + auxiliar)
        totalJ2 += auxiliar
        totalj2()
    }
    sleep(sleepT)

    //--------------------------------
    puntero.runOnUiThread {
        jugando3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador3turno4.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador3turno4.setText("" + auxiliar)
        totalJ3 += auxiliar
        totalj3()
    }
    sleep(sleepT)
    //--------------------------------
    puntero.runOnUiThread {
        jugando4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado1jugador4turno4.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)
    puntero.runOnUiThread {
        auxiliar = obtenerNumero()
        puntero.dado2jugador4turno4.setText("" + auxiliar)
        totalJ4 += auxiliar
        totalj4()
    }
    sleep(sleepT)

    puntero.runOnUiThread {
        AlertDialog.Builder(puntero)
            .setTitle("GANADOR")
            .setMessage("El ganador es : Jugador " + ganador(totalJ1, totalJ2, totalJ3, totalJ4))
            .show()
    }
    pausar()
}
        }
    }

    private fun reiniciar() {
        puntero.dado1jugador1turno1.setText("-")
        puntero.dado1jugador2turno1.setText("-")
        puntero.dado1jugador3turno1.setText("-")
        puntero.dado1jugador4turno1.setText("-")

        puntero.dado2jugador1turno1.setText("-")
        puntero.dado2jugador2turno1.setText("-")
        puntero.dado2jugador3turno1.setText("-")
        puntero.dado2jugador4turno1.setText("-")

        puntero.dado1jugador1turno2.setText("-")
        puntero.dado1jugador2turno2.setText("-")
        puntero.dado1jugador3turno2.setText("-")
        puntero.dado1jugador4turno2.setText("-")

        puntero.dado2jugador1turno2.setText("-")
        puntero.dado2jugador2turno2.setText("-")
        puntero.dado2jugador3turno2.setText("-")
        puntero.dado2jugador4turno2.setText("-")

        puntero.dado1jugador1turno3.setText("-")
        puntero.dado1jugador2turno3.setText("-")
        puntero.dado1jugador3turno3.setText("-")
        puntero.dado1jugador4turno3.setText("-")

        puntero.dado2jugador1turno3.setText("-")
        puntero.dado2jugador2turno3.setText("-")
        puntero.dado2jugador3turno3.setText("-")
        puntero.dado2jugador4turno3.setText("-")

        puntero.dado1jugador1turno4.setText("-")
        puntero.dado1jugador2turno4.setText("-")
        puntero.dado1jugador3turno4.setText("-")
        puntero.dado1jugador4turno4.setText("-")

        puntero.dado2jugador1turno4.setText("-")
        puntero.dado2jugador2turno4.setText("-")
        puntero.dado2jugador3turno4.setText("-")
        puntero.dado2jugador4turno4.setText("-")

        puntero.sumaJugador1.setText("-")
        puntero.sumaJugador2.setText("-")
        puntero.sumaJugador3.setText("-")
        puntero.sumaJugador4.setText("-")
    }

    fun jugando1(){
        puntero.statusJugador1.setText("ESTÁ TIRANDO")
        puntero.statusJugador2.setText("ESPERANDO")
        puntero.statusJugador3.setText("ESPERANDO")
        puntero.statusJugador4.setText("ESPERANDO")
    }
    fun jugando2(){
        puntero.statusJugador2.setText("ESTÁ TIRANDO")
        puntero.statusJugador1.setText("ESPERANDO")
        puntero.statusJugador3.setText("ESPERANDO")
        puntero.statusJugador4.setText("ESPERANDO")
    }
    fun jugando3(){
        puntero.statusJugador3.setText("ESTÁ TIRANDO")
        puntero.statusJugador1.setText("ESPERANDO")
        puntero.statusJugador2.setText("ESPERANDO")
        puntero.statusJugador4.setText("ESPERANDO")
    }
    fun jugando4(){
        puntero.statusJugador4.setText("ESTÁ TIRANDO")
        puntero.statusJugador1.setText("ESPERANDO")
        puntero.statusJugador2.setText("ESPERANDO")
        puntero.statusJugador3.setText("ESPERANDO")
    }
    fun obtenerNumero():Int{
        return (Math.random()*6+1).toInt()
    }
    fun totalj1(){
        puntero.sumaJugador1.setText(""+totalJ1)
    }
    fun totalj2(){
        puntero.sumaJugador2.setText(""+totalJ2)
    }
    fun totalj3(){
        puntero.sumaJugador3.setText(""+totalJ3)
    }
    fun totalj4(){
        puntero.sumaJugador4.setText(""+totalJ4)
    }

    fun ganador(uno : Int, dos :Int, tres:Int,cuatro : Int):String{
        if(uno>dos && uno >tres && uno>cuatro){
            return "1"
        }else if(dos>uno && dos>tres && dos>cuatro){
            return "2"
        }else if(tres>uno && tres>dos && tres>cuatro){
            return "3"
        }else{
            return "4"
        }
    }
    fun pausar(){
        vivo = false
    }

    fun despausar(){
         totalJ1 = 0
         totalJ2 = 0
         totalJ3 = 0
         totalJ4 = 0
         vivo = true


    }

    fun status():Boolean{
        return vivo
    }

}



