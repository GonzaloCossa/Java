
package herencia;

public class TestHerencia {

    public static void main(String[] args) {
        Concesionario c = new Concesionario("Quilmes Autos");
        
        Auto a1 = new Auto("Ford", "F100", "ABC123");
        
        Moto m1 = new Moto("Honda", "Tornado", "DFE456");
        
        c.agregarVehiculo(a1);
        
        c.agregarVehiculo(m1);
        
        c.listarVehiculos();
        
        c.listarAutos();
    }
    
}
