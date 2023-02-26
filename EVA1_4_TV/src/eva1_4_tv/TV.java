/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_4_tv;

/**
 *
 * @author Omar Carrillo
 */
public class TV {

    private int volumen;
    private int canal;
    private boolean poder;

    //constructores
    public TV() {//constructor default
        volumen = 2;
        canal = 0;
        poder = false;//apagado 
    }

    //metodos para operar la tv(interfaz)
    //encender y apagar la tv
    public void CambiarEstadoPoder() {
        //verificar el estado de la tv
        if (poder == true) {
            poder = false;

            System.out.println("Apagando la pantalla");
        } else {
            poder = true;
            System.out.println("Encendiendo la pantalla");

        }
    }

    //Volumen
    public void subirvolumen() {
        //volumen=volumen+1;//acumulador
        //volumen+=1
        if (poder == true) {
            //la tv esta prendida
            //no debemos de pasar de 100
            if (volumen < 100) {
                volumen++;
                System.out.println("volumen:" + volumen);
            }
        }
    }

    public void bajarvolumen() {
        //volumen=volumen-1;//acumulador
        //volumen-=1
        if (poder == true) {
            if (volumen > 0) {   
                volumen--;
                System.out.println("volumen:" + volumen);
            }
        }
    }
        public void subircanal() {
        //volumen=volumen+1;//acumulador
        //volumen+=1
        if (poder == true) {
            //la tv esta prendida
            //no debemos de pasar de 100
            if (canal > 100) {
                canal=0;
                System.out.println("canal:" + canal);
            }
        }
    }

    public void bajarcanal() {
        //volumen=volumen-1;//acumulador
        //volumen-=1
        if (poder == true) {
            if (canal <0) {   
                canal=100;
                System.out.println("canal:" + canal);
            }
        }
    }
}
