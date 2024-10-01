
package listas;

public class Dispositivo {
    private final String ID;
    private double precio;
    private TipoDispositivo tipo;

    public Dispositivo(String ID, double precio, TipoDispositivo tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getId(){
        return ID;
    }
    
    public TipoDispositivo getTipo(){
        return tipo;
    }
    
    @Override
    public String toString() {
        return "Dispositivo{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
}
