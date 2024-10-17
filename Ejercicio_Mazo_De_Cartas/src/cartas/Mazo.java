package cartas;

import java.util.ArrayList;
import java.util.List;

public class Mazo {
    private ArrayList<Carta> cartas;
    
    public Mazo(){
        cartas = new ArrayList<>();
        generarCartas();
    }
    
    public void generarCartas(){
        generarPalos();
        generarComodines();
    }
    
    public void generarComodines(){
        cartas.addAll(List.of(new Comodin(true), new Comodin(false)));
    }
    
    public void generarCartasNumericas(Palo palo){
        for(int i = CartaNumero.NUM_MIN; i <= CartaNumero.NUM_MAX; i++){
            cartas.add(new CartaNumero(i, palo));
        }
    }
    
    public void generarCartasFigura(Palo palo){
        for(char letra: CartaFigura.LETRAS){
            cartas.add(new CartaFigura(letra, palo));
        }
    }
    
    public void generarPalos(){
        for(Palo p: Palo.values()){
            generarCartasNumericas(p);
            generarCartasFigura(p);
        }
    }
    
    public void voltearMazo(){
        for(Carta c: cartas){
            c.voltear();
        }
    }

    public void mostrarCartas(){
        for(Carta c: cartas){
            System.out.println(c);
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mazo{");
        for(Carta c: cartas){
          sb.append(c);  
        }
        sb.append('}');
        return sb.toString();
    } 
}
