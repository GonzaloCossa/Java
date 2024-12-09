package entidades;

import enums.Escuderia;
import interfaces.ResponsableTareas;

/**
 *
 * @author Gonzalo Agustín Cossa
 */
public class Mecanico extends IntegranteEscuderia implements ResponsableTareas{
    private String especialidad;

    public Mecanico(int legajo, String nombre, String apellido, int edad, Escuderia escuderia, String especialidad) {
        super(legajo, nombre, apellido, edad, escuderia);
        this.especialidad = especialidad;
    }

    @Override
    public String realizarTarea() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int compareTo(IntegranteEscuderia o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void asignarTarea(String tarea) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String reportarProgreso() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
