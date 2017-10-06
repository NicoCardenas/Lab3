package aplicacion;

import java.awt.Color;

public class Bola implements EnSalon{
    
    private Salon salon;
    private String nombre;
    private int posicionX;
    private int posicionY;
    private Color color;
    
    public Bola(Salon salon, String nombre, Color color, int posicionX, int posicionY){
        this.salon = salon;
        this.nombre = nombre;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionX;
    }
    
    public void inicie(){
    
    }
    
    public void pare(){
    
    }
    
    public void decida(){
    
    }
    
    public String mensaje(){
        return "";
    }
    
    public Color getColor(){
        return color;
    }
    
    public int getPosicionX(){return posicionX;}
    
    public int getPosicionY(){return posicionY;}
}
