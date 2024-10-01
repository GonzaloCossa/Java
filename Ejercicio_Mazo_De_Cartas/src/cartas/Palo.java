package cartas;

public enum Palo {
    CORAZON(Color.ROJO),
    DIAMANTE(Color.ROJO),
    PICA(Color.NEGRO),
    TREBOL(Color.NEGRO);
    
    private Color color;
    
    private Palo(Color color){
        this.color = color;
    }
}
