package aplicacion;
import java.util.*;
import java.awt.Color;


/**
 * @author ECI 2014
 * Salon de la aplicación egiptologos
 */
/**
 * @author ECI
 *
 */
public class Salon{
    public static final int MAXIMO = 500;
    private static Salon salon = null;
    
    public static Salon demeSalon() {
        if (salon==null){
            salon=new Salon();
        }
        return salon;
    }
    
    private static void nuevoSalon() {
        salon=new Salon();
    }   
    
    public static void cambieSalon(Salon d) {
        salon=d;
    }       


    private ArrayList<EnSalon> elementos;
    
    private Salon() {
        elementos= new ArrayList<EnSalon>();
    }
    
    
    
    public EnSalon deme(int n){
        EnSalon h=null;
        if (1<=n && n<=elementos.size()){
            h=elementos.get(n-1);
        }    
        return h; 
    }
    
    
    public void adicione(EnSalon e){
        elementos.add(e);
    }
    
    public int numeroEnSalon(){
        return elementos.size();
    }
    

    public void entrada(){  
        new Deportista(this,"Edward",250,80);
        new Deportista(this,"Bella",250,0);
        new DeportistaAvanzado(this,"neo",250,160);
        new DeportistaAvanzado(this,"trinity",250,210);
        new Bola(this,"Derecha",Color.RED,260,260);
        new Bola(this,"Izquierda",Color.RED,260,260);
    }  
    
    public void salida(){       
        elementos.clear();
    }

    
   public void inicio(){
      for (int i=0; i< numeroEnSalon(); i++){
          elementos.get(i).inicie();
        }
   }    

   public void parada(){
       for (int i=0; i< numeroEnSalon(); i++){
          elementos.get(i).pare();
        }
   }    

   public void decision(){
       for (int i=0; i< numeroEnSalon(); i++){
          elementos.get(i).decida();
        }
   }       
    
}
