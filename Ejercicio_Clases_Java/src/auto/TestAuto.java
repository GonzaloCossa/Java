
package auto;

public class TestAuto {
    
    public static void main(String[] args) {
        
        Estacionamiento e = new Estacionamiento();

        Auto a = new Auto("ABC123", "Ford", 10000, Color.ROJO, new Motor("12143214", 2.0, "Nafta"));
        Auto b = new Auto("AG290GV", "Peugeot", 25000, Color.GRIS, new Motor("67378623", 1.8, "Diesel"));
        
        e.guardarAuto(a);
        e.guardarAuto(b);
        
        a.acelerar();
        
        e.listarAutos();
        e.contarEstacionados();
    }
}
