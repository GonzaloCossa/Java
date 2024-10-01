package cartas;

public class CartaFigura extends CartaPalo {
    private char letra;
    
    public CartaFigura(char letra, Palo palo){
        super(palo);
        this.letra = letra;   
    }
    
    @Override
    public String toString(){
        return this.getEstado() ? super.toString() + "Letra: " + Character.toUpperCase(letra) + "\n" : "La carta no es visible";
    }
}