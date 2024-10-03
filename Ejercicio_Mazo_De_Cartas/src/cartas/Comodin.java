package cartas;

public final class Comodin extends Carta {
    
    private boolean coloreado;
    
    public Comodin(boolean coloreado){
        this.coloreado = coloreado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComodin: " + (coloreado ? "Negro" : "Blanco") + "\n";
    }   
}
