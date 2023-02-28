/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE1;

import PAQUETE2.CLASE_E;

/**
 *
 * @author invitado
 */
public class CLASE_C {
     public int publicC;
    int deafultC;
    private int privateC; 
    
    public void prueba(){
    
    CLASE_A objA=new CLASE_A();
     //objA.publicA; son atributos que son visibles 
    // objA.deafultA;
     
     CLASE_B objB=new CLASE_B();
     //objB.publicB; son atributos que son visibles 
    // objB.deafultB;
     
     //clase d es default en otro archivo
     //pero mismo paquete
     CLASE_D objD=new CLASE_D();
     //objD.publicD; atributos visibles 
     //objD.deafultD;
    
     //clase e esta en otro paquete
     CLASE_E objE=new CLASE_E();
     //objE.publicE; solo el atributo publico
     //hay que agregar clausula "import"
     //clase f rd default y es invisible
     //para las clases de este paquete1 
     //CLASE_F objF=new CLASE_F();
    }
}
class CLASE_D{
  public int publicD;
    int deafultD;
    private int privateD;
}