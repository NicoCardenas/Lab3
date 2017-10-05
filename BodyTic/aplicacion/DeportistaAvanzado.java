package aplicacion;

import java.awt.Color;

/**
 * Write a description of class DeportistaAvanzado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeportistaAvanzado extends Deportista {

    private int contador;
    
    /**
     * Constructor for objects of class DeportistaAvanzado
     */
    public DeportistaAvanzado(Salon salon,String nombre,int posicionx, int posiciony){
        super(salon, nombre,posicionx,posiciony);
        color = Color.ORANGE;
        contador = 0;
    }        
    
    @Override
    public void inicie(){
        contador+=1;
        super.inicie();
    }
    
    @Override
    public void pare(){
        if (contador%10 == 0){
            super.pare();
        }
    }
    
    @Override
    public void decida(){
        inicie();
    }       
}
