
package herencia;

public class Camion extends Vehiculo {
    private double carga;

    public Camion(String marca, String modelo, String patente, double carga) {
        super(marca, modelo, patente);
        
        this.carga = carga;
    }
}


