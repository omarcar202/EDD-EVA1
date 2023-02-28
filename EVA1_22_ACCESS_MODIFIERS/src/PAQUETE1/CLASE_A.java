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
public class CLASE_A {
    public int publicA;
    int deafultA;
    private int privateA;
    
    public void prueba(){
     CLASE_B objB=new CLASE_B();
     //objB.publicB; son atributos que son visibles 
    // objB.deafultB;
     
     CLASE_C objC=new CLASE_C();
     //objC.publicC; tambien son atributos visibles 
     //objC.deafultC;
     
     //clase d es default en otro archivo
     //pero mismo paquete
     CLASE_D objD=new CLASE_D();
     //objD.publicD; atributos visibles 
     //objD.deafultD;
    
     //clase e esta en otro paquete
     CLASE_E objE=new CLASE_E();
     //objE.publicE; solo el atributo publico
     
     //clase f rd default y es invisible
     //para las clases de este paquete1 
     //CLASE_F objF=new CLASE_F();
    }
}
class CLASE_B{
  public int publicB;
    int deafultB;
    private int privateB;

}