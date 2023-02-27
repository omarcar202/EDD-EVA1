/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_20_static_2;

/**
 *
 * @author invitado
 */
public class FormulasGeomettria {
    
    //CONSTANTE
    public static final double PI= 3.14159;
    //AREA
    public static double areaTriangulo(double base, double altura){
    return(base*altura)/2.0;
    }
    public static double areaCiruclo(double radio){
    return PI * radio * radio;
   }
    //PERIMETRO
     public static double perimetroCirculo(double radio){
     return PI*(radio*2);
     }
    //VOLUMEN
     public static double volumenesfera(double radio){
     return(4.0/3.0)*PI*(radio*radio*radio);
     }
}
