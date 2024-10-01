
package herencia;

public class Auto extends Vehiculo{
    
    private boolean tieneGPS;
    
    public Auto(String marca, String modelo, String patente){
        super(marca, modelo, patente);
    }

    @Override
    public String toString() {
        return super.toString() + " tieneGPS=" + tieneGPS + '}';
    }
    
    @Override
    public void acelerar(){
        System.out.println("El auto esta acelerando");
    }
    
    public void agregarGPS(){
        this.tieneGPS = true;
    }
    
    public void establecerRuta(){
        if(tieneGPS){
            System.out.println("Establenciendo Ruta.");
        }
        else{
            System.out.println("Su auto no dispone de GPS.");
        }
    }
}
