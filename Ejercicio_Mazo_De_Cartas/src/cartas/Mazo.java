package cartas;

import java.util.ArrayList;
import java.util.List;

public class Mazo {
    private ArrayList<Carta> cartas;
    private final int CARTAS_NUMERO = 9;
    private final char[] CARTAS_FIGURA = {'A', 'J', 'Q', 'K'};
    
    public Mazo(){
        cartas = new ArrayList<>();
    }
    
    public void generarCartas(){
        for(Palo p: Palo.values()){
            for(int i = 1; i <= CARTAS_NUMERO; i++){
                cartas.add(new CartaNumero(i, p));
            }
            for(char i = 0; i < CARTAS_FIGURA.length; i++){
                cartas.add(new CartaFigura(CARTAS_FIGURA[i], p));
            }
        }
        cartas.addAll(List.of(new Comodin(true), new Comodin(false)));
    }
    
    public void voltearCartas(){
        for(Carta c: cartas){
            c.voltear();
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
