package cartas;

public class Carta {
    private boolean visible;
    
    public Carta(){
        visible = false;
    }
    
    public void voltear(){
        this.visible = !visible;
    }
    
    public boolean getEstado(){
        return visible;
    }
    
    @Override
    public String toString(){
        return visible ? "\nLa carta es visible" : "\nLa carta no es visible";
    }
}
