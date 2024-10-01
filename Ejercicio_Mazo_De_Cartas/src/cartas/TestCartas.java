package cartas;

public class TestCartas {
 
    public static void main(String[] args) {
       Mazo m = new Mazo();
       
       m.generarCartas();
       m.voltearCartas();
       
       System.out.println(m);
    }
}
