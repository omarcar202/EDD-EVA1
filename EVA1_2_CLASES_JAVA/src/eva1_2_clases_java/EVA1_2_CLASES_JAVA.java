/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_2_clases_java;

/**
 *
 * @author hp
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        //
        Persona perso1 = new Persona();
        //System.out.println(perso1);

        perso1.nombre = "Omar";
        perso1.apellido = "Carrillo";
        perso1.edad = 18;
        perso1.estadocivil = false;

        System.out.println(perso1.nombre);
        System.out.println(perso1.apellido);
        System.out.println(perso1.edad);
        System.out.println(perso1.estadocivil);

        perso1.imprimirDatos();
        //person 2
        Persona perso2= new Persona();
                perso2.nombre = "luis";
        perso2.apellido = "Carrillo";
        perso2.edad = 25;
        perso2.estadocivil = false;
        perso2.imprimirDatos();
    }
}
