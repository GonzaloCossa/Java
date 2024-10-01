
package auto;

import java.util.Arrays;

public class Auto {
    private String patente;
    private String marca;
    private double precio;
    private Color color;
    private Motor motor;

    public Auto(String patente, String marca, double precio, Color color, Motor motor) {
        this.patente = patente;
        this.marca = marca;
        this.precio = precio;
        this.color = color;
        this.motor = motor;
    }
    
    public void acelerar(){
        this.motor.setRpm(motor.getRpm() + 1000);
    }
    
    @Override
    public String toString(){
        return String.format("Patente: %s\nMarca: %s\nPrecio: %.2f\nColor: %s\nMotor:\n%s", this.patente, this.marca, this.precio, this.color, this.motor.toString());
    }
    
    
    
}
