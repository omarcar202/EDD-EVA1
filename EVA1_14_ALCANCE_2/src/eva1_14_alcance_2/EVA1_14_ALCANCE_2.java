/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance_2;

/**
 *
 * @author invitado
 */
public class EVA1_14_ALCANCE_2 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int x =100;//visible dentro de todo bloque main ();
    // TODO code application logic here
    for (int i = 0; i < 10; i++) {
      if(i==5){
      int x =100;//la variable esta declarado en main() y
      //es visible dentro de for 
      int y=100;//visible dentro del for
      }
    }
    int y=100;//aqui la variablee y del ciclo for no existe 
    //podemos declarar una variable del mismo 
  }
  
}
