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
public class Persona {
    String nombre ;
    String apellido; 
           int edad; 
          boolean  estadocivil; 
          //METODOS:MCOMPORTAMIENTO
          //lectura y escritura de atributos:
          //Métodos get --> leer, metodo set --> escribir
          //metodos:
          //modifcador de valores de retorno nombre (RGUMENTOS){implementacion}
          
          public String getNombre(){
              return nombre;
              
              
          
          }
          
          //void vacio, no retorna nada 
          public void setNombre(String valor){
           nombre=valor;   
          }
          public void imprimirDatos(){
              System.out.println("Datos almacenados:");
                        //concatenacion
                        //+suma (numeros)+concatena<--sobre
              System.out.println("Nombre completo:"+nombre+""+apellido);
              System.out.println("Edad:"+edad);
              if(estadocivil)
              System.out.println("Estado civil: casado");
              else
              System.out.println("Estado civil: soltero");
          }
}

