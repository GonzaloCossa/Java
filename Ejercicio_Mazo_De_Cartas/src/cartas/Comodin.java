package cartas;

public class Comodin extends Carta {
    // true: Blanco false: Negro
    private boolean blancoNegro;
    
    public Comodin(boolean blancoNegro){
        this.blancoNegro = blancoNegro;
    }

    @Override
    public String toString() {
        return super.toString() + "\nComodin: " + (blancoNegro ? "Negro" : "Blanco") + "\n";
    }   
}
