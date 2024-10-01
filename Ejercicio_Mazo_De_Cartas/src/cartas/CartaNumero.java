package cartas;

public class CartaNumero extends CartaPalo {
    private int numero;
    
    public CartaNumero(int numero, Palo palo){
        super(palo);
        this.numero = numero;
    }
   
    @Override
    public String toString(){
        return this.getEstado() ? super.toString() + "Numero: " + numero + "\n" : "La carta no es visible";
    }
}
