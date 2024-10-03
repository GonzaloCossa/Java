package cartas;

public class CartaNumero extends CartaPalo {
    public static final int NUM_MIN = 2;
    public static final int NUM_MAX = 10;
    private int numero;
    
    public CartaNumero(int numero, Palo palo){
        super(palo);
        validarNumero(numero);
        this.numero = numero;
    }
   
    private static void validarNumero(int num){
        if(num < NUM_MIN || num > NUM_MAX){
            throw new IllegalArgumentException("Numero invalid");
        }
    }
    
    @Override
    public String toString(){
        return this.getEstado() ? super.toString() + "Numero: " + numero + "\n" : "La carta no es visible";
    }
}
