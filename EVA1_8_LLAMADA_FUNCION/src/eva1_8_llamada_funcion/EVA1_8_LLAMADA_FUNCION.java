/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_8_llamada_funcion;

/**
 *
 * @author invitado
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            System.out.println("Inicia main");
            A();//LLAMADA DE FUNCION
            System.out.println("Termina main");
    }
    public static void A(){
    
             System.out.println("Inicia A");
             B();
            System.out.println("Termina A");
    }
  public static void B(){
    
             System.out.println("Inicia B");
            System.out.println("Termina B");
    }
}
