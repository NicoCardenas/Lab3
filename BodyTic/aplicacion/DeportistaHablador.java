package aplicacion;

import java.awt.Color;

/**
 * Write a description of class DeportistaHablador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DeportistaHablador extends Deportista{
    
    /**
     * Constructor for objects of class DeportistaHablador
     */
    public DeportistaHablador(Salon salon,String nombre,int posicionx,int posiciony){
        super(salon, nombre, posicionx, posiciony);
        color = Color.RED;
    }
       	
}
