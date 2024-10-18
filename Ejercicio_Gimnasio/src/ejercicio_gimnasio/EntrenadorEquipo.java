package ejercicio_gimnasio;

public class EntrenadorEquipo extends Entrenador{
    private static final int ANT_1 = 3;
    private static final int ANT_2 = 6;
    private static final double PORC_1 = 0.04;
    private static final double PORC_2 = 0.12;
    private double sueldoBasico;
    
    public EntrenadorEquipo(int legajo, String nombre, String apellido, int anioIngreso, double sueldoBasico){
        super(legajo, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;      
    }
    
    @Override
    public double getSueldo(){
        double porc = 0;
        int ant = antiguedad();
        
        if(ant > ANT_2){
            porc = PORC_2;
        } else if(ant > ANT_1){
            porc = PORC_1;
        }

        return sueldoBasico + (sueldoBasico * porc);
    }
}
