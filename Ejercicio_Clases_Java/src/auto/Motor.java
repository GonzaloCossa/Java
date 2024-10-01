
package auto;

public class Motor {
    private String numero;
    private double cilindrada;
    private String combustible;
    private int rpm;

    public Motor(String numero, double cilindrada, String combustible) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.combustible = combustible;
        this.rpm = 0;
    }
    
    public Motor(){
        
    }
    
    public void setRpm(int rpm){
        this.rpm = rpm;
    }
    
    public int getRpm(){
        return this.rpm;
    }
    
    @Override
    public String toString(){
        return String.format("Numero de Serie: %s\nCilindrada: %.1f\nCombustible: %s\nRevoluciones: %d\n", this.numero, this.cilindrada, this.combustible, this.rpm);
    }
}
