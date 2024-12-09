package main;

import entidades.Mecanico;
import entidades.Piloto;
import enums.Escuderia;
import exceptions.TareaInvalidaException;

/**
 *
 * @author Gonzalo Agustín Cossa
 */
public class TestProyecto {

    public static void main(String[] args) {
        Piloto p = new Piloto(1589, "GONCHO", "COSSA", 20, Escuderia.WILLIAMS, 15, 205);
        Mecanico m = new Mecanico(1589, "GONCHO", "COSSA", 20, Escuderia.WILLIAMS, "Aerodinamica");
        Piloto p2 = new Piloto(1589, "Alex", "Albon", 20, Escuderia.WILLIAMS, 15, 205);
        Piloto p3 = new Piloto(1589, "GONCHO", "COSSA", 20, Escuderia.WILLIAMS, 15, 205);
        Piloto p4 = new Piloto(5198, "Lu", "COSSA", 20, Escuderia.WILLIAMS, 15, 205);
        /*try {
            p.asignarTarea("Hacer vuelta rapida");
            System.out.println(p.realizarTarea());
            System.out.println(p.reportarProgreso());
            System.out.println(p);
            
        } catch (TareaInvalidaException e) {
            System.out.println(e.getMessage());
        }*/
        System.out.println(p.compareTo(m));
        System.out.println(p.equals(m));
        
    }  
}
