
package herencia;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;

    public Vehiculo(String marca, String modelo, String patente) {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ',';
    }
    
     private boolean checkMotor(){
        System.out.println("Todo Ok.");
        return true;
    }
    
    public void encender(){
        if(checkMotor()){
            System.out.println("Encendiendo el Vehiculo.");
        }
    }
    
    public void acelerar(){
        if(checkMotor()){
           System.out.println("Acelerando el Vehiculo."); 
        }      
    }
    
    public void frenar(){
        if(checkMotor()){
           System.out.println("Frenando el Vehiculo."); 
        }   
    }
}
