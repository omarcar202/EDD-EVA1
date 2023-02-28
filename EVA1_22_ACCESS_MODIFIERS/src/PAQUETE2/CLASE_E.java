/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE2;

import PAQUETE1.CLASE_A;
import PAQUETE1.CLASE_C;

/**
 *
 * @author invitado
 */
public class CLASE_E {
      public int publicE;
    int deafultE;
    private int privateE;
    public void prueba(){
    
    CLASE_A objA=new CLASE_A();
     //objA.publicA; son atributos que son visibles 
     
    //CLASE_B objB=new CLASE_B();
     //objB.publicB; son atributos que son invisible es default y esta en otro paquete
   
     
     CLASE_C objC=new CLASE_C();
     //objC.publicC; tambien son atributos visibles 
     //objC.deafultC;
     
     //clase d es default en otro archivo
     //pero mismo paquete
     //CLASE_D objD=new CLASE_D();
     //objD.publicD; atributos visibles 
     //objD.deafultD;
    
     //clase e esta en otro paquete
    
    }
}
class CLASE_f{
  public int publicF;
    int deafultF;
    private int privateF;
}
