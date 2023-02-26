/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_12_califas;

/**
 *
 * @author invitado
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     String cali;
     cali=califas(85);
        System.out.println("califa para 85:"+cali);
        System.out.println("califa para 70:"+califas(70));
        califas(100);
    }
     public static String califas(int califas){
      String resu="";
         if((califas>=91 )&&(califas<=100)){
          resu="A";
     }else if((califas>=81 )&&(califas<=90)){
         resu="B";
     }else if((califas>=71 )&&(califas<=80)){
             resu="C";
     }else{
         resu="D";
     }
     return resu;
}
       
}

