package cartas;

public class CartaPalo extends Carta {
    private Palo palo;
    
    public CartaPalo(Palo palo){
        this.palo = palo;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPalo: " + palo + "\n";
    }
}
