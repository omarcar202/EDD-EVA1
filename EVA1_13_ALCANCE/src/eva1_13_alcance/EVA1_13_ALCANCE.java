/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_13_alcance;

/**
 *
 * @author invitado
 */
public class EVA1_13_ALCANCE {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    int x = 100;//visible para todo lo que este dentro de main()
    for (int i = 0; i < 10; i++) {
      System.out.println("x=" + x);
      System.out.println("i=" + i);
      System.out.println("j=" + j);
      int j = 100;//a partir de aqui,es visible
      System.out.println("j=" + j);
      {
        int z =1000;
        System.out.println("z="+z);
      }
      System.out.println("z="+z);
      //termina bloque for
    }
   //no estan en el bloque 
    System.out.println("i=" + j);
    System.out.println("i=" + j);
  }
public static void algo(){
  System.out.println("x="+x);//no es visible 
}
}
