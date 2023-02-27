/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_19_static;

/**
 *
 * @author invitado
 */
public class EVA1_19_STATIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI"+ Math.PI);
        System.out.println("numero aleatorio:"+Math.random());
        utilerias utileria=new utilerias();
        utileria.saludo();
        utileria.otrosaludo();
        saludo2();//si no es estatico, y no se ha creado
        //un objeto,el metodo no existe 
    }
    public void saludo2(){
        System.out.println("hola");
    }
}

class utilerias{
    //saludo():este metodo existe hasta que se crea un objeto de la clase
    public void saludo(){
        System.out.println("hola");
    
    }
    //otrosaludo():este metodo existe en el momento que el programa inicia su ejecucion 
 public void otrosaludo(){
     System.out.println("otro saludo(static)");
 }
}
class otraclase{

}
