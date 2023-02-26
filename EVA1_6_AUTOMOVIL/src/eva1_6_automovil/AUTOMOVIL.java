/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_6_automovil;

/**
 *
 * @author invitado
 */
public class AUTOMOVIL {
    private String marca;
    private String modelo;
    private int año;
    private String dueño;
    
    public AUTOMOVIL(){
    marca="Volkswagen";
    modelo="Beetle";
    año=1960;
    dueño="sin dueño";
    }
    
    public AUTOMOVIL(String marcaAuto,String modeloAuto,int añoAuto, String dueñoAuto){
    marca=marcaAuto;
    modelo=modeloAuto;
    año=añoAuto;
    dueño=dueñoAuto;
    }
    public String getmarca(){
        return marca;
    }
     public String getmodelo(){
        return modelo;
    }
      public int getaño(){
        return año;
    }
       public String getdueño(){
        return dueño;
    }
         public void setmarca(){
       marca=marcaAuto;
    }
     public void setmodelo(){
       modelo= modeloAuto;
    }
      public int setaño(){
        año= añoAuto;
    }
       public void setdueño(){
        dueño=dueñoAuto;
    }
       public int calcularRev(){
      int adeudo=0;
           if(año<=2000){
               adeudo=1500;
       }else if((año>=2001) && (año<=2005)){
           adeudo= 2000;
            }else if((año>=2006) && (año<=2010)){
           adeudo= 2500;
            }else if((año>=2011) && (año<=2015)){
           adeudo= 3000;
        }else{
                adeudo =3500;
        }
   return adeudo;
       }
       public void imprimirdatos(){
           System.out.println("Adeudo vehicular:");
           System.out.println("dueño:"+dueño);
           System.out.println("año:"+año);
           System.out.println("modelo:"+modelo);
           System.out.println("marca:"+marca);
           System.out.println("adeudo:"+calcularRev());
       }
}
