/*

 */
package eva1_5_circulo;


public class Medidas {
 double area;
 double perimetro;
 double radio;
 double pi=3.14159;
//------------------------------------------------------------------------------- 
 public double getRadio(){
 return radio;   
}
public void setRadio(double num){
   radio = num; 
} 
//------------------------------------------------------------------------------ 
 public void intro(){
   System.out.println("Área y perímetro de un círculo.");
 System.out.println("\nDatos del círculo.");    
 } 
//------------------------------------------------------------------------------ 
public void Area(){
 if (radio>0){
 area = pi*(radio*radio);
    System.out.println("El área es: " +area+ " unidades.");
 } else {
     System.out.println("No existe área.");
 }
}
//----------------------------------------------------------------------------- 
 public void Perimetro(){
  if (radio>0){
 perimetro = 2*pi*radio;
     System.out.println("El perímetro es: " +perimetro+ " unidades.");
  } else {
  System.out.println("No existe perímetro.");
  }
 }
  //-----------------------------------------------------------------------------
 
 public void datos(){
   if (radio>0){
  System.out.println("El radio es de: " +radio+ " unidades.");
  System.out.println("Entonces...");
   } else {
   System.out.println("El radio es de: " +radio+ " unidades.");
   System.out.println("Radio negativa.");
   System.out.println("Entonces...");
   }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}
