
package herencia;

public class Moto extends Vehiculo{
    private boolean eslingaPuesta;

    public Moto(String marca, String modelo, String patente) {
        super(marca, modelo, patente);
    }

    @Override
    public String toString() {
        return super.toString() + " eslingaPuesta=" + eslingaPuesta + '}';
    }
    
    @Override
    public void acelerar(){
        System.out.println("la moto esta acelerando");
    }
    
    public void agregarEslinga(){
        this.eslingaPuesta = true;
    }
    
    
    public void bloquear(){
        if(eslingaPuesta){
            System.out.println("Bloqueando la Rueda.");
        }
        else{
            System.out.println("Su moto no dispone de eslinga.");
        }
    }
}
