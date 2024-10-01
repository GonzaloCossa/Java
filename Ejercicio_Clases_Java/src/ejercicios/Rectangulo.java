package ejercicios;

import java.util.Arrays;

public class Rectangulo {

    private double ancho;
    private double alto;
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }
    
    public Rectangulo(){
        
    }
    
    public double CalcularArea(){
        return this.ancho * this.alto;
    }
    
    public double CalcularPerimetro(){
        return (this.ancho + this.alto) * 2;
    }
    
    public boolean EsCuadrado(){
        return this.ancho == this.alto;
    }
    
    public static Rectangulo SumarRectangulo(Rectangulo r1, Rectangulo r2){
        return new Rectangulo(r1.ancho + r2.ancho, r1.alto + r2.alto);
    }
    
    @Override
    public String toString(){
        return String.format("Ancho: %.2f\nAlto: %.2f\nArea: %.2f\nPerimetro: %.2f\nEs Cuadrado: %s\n", this.ancho, this.alto, this.CalcularArea(), this.CalcularPerimetro(),this.EsCuadrado() ? "Si" : "No"); 
    }  
}
