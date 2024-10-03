package cartas;

public class CartaFigura extends CartaPalo {
    public static final char[] LETRAS = {'A', 'J', 'Q', 'K'}; 
    private char letra;
    
    public CartaFigura(char letra, Palo palo){
        super(palo);
        validarLetra(letra);
        this.letra = letra;   
    }
    
    private static void validarLetra(char letra){
        int i = 0;
        while(i < LETRAS.length && letra != LETRAS[i]){
            i++;
        }
        if(i == LETRAS.length){
            throw new IllegalArgumentException("Letra invalida");
        }
    }
    
    @Override
    public String toString(){
        return this.getEstado() ? super.toString() + "Letra: " + Character.toUpperCase(letra) + "\n" : "La carta no es visible";
    }
}