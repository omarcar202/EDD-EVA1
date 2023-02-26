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
public class EVA1_4_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TV miTV= new TV();//la tv esta apagada
        miTV.bajarvolumen();
        miTV.CambiarEstadoPoder();//encender la pantalla
       miTV.bajarcanal();
    }
}
