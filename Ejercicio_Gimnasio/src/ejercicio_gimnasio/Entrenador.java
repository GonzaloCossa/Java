package ejercicio_gimnasio;

import java.time.LocalDate;

public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private int anioIngreso;
    public Entrenador(int legajo, String nombre, String apellido, int anioIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    
    public abstract double getSueldo();
    
    public int antiguedad(){
        return LocalDate.now().getYear() - anioIngreso;
    }
    
    public String nombreCompleto(){
        return nombre + " " + apellido;
    }
}
