/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_18_sobrecarga_rfc;

/**
 *
 * @author invitado
 */
public class EVA1_18_SOBRECARGA_RFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String rfc= generar_rfc("omar","carrillo","correa",2004,3,18);
        System.out.println(rfc);
    }
    public static String generar_rfc(String nombre,String appat,String apmat,int año, int mes,int dia){
     String ap = appat.charAt(0)+"";
     String ap2=appat.charAt(1)+"";
     String apm=apmat.charAt(0)+"";
     String nom=nombre.charAt(0)+"";
     String rfc=ap+ap2+apm+nom+año+mes+dia+"";
     return rfc;
    }
    //sobrecargar para los casos:
    //falte un apellido---->sustituimos por una x
    //falte ambos apellidos ---->sustituimos por dos xx
}
