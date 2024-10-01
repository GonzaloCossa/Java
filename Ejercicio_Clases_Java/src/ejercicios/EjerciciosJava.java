package ejercicios;

public class EjerciciosJava {
    
    public static void main(String[] args) {
        Rectangulo rect1 = new Rectangulo(100, 100);
        Rectangulo rect2 = new Rectangulo(200, 200);
        
        Rectangulo rect3 = Rectangulo.SumarRectangulo(rect1, rect2);
        
        System.out.println(rect3);
        
    }
    
}
