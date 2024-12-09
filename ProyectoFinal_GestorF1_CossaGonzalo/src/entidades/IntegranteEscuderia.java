package entidades;

import enums.*;

/**
 *
 * @author Gonzalo Agustín Cossa
 */
public abstract class IntegranteEscuderia implements Comparable<IntegranteEscuderia>{
    private int legajo;
    private String nombre;
    private String apellido;
    private int edad;
    private Escuderia escuderia;
    protected String tareaActual;
    protected boolean tareaRealizada;

    public IntegranteEscuderia(int legajo, String nombre, String apellido, int edad, Escuderia escuderia) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.escuderia = escuderia;
        this.tareaActual = null;
        this.tareaRealizada = false;
    }
 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 73 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null){
            return false;
        }
        IntegranteEscuderia aux = (IntegranteEscuderia) o;
        return this.legajo == aux.legajo;
    }

    @Override
    public String toString() {
        return "Legajo: " + legajo + "\n" +
               "Nombre: " + nombre + "\n" + 
               "Apellido: " + apellido + "\n" +
               "Edad: " + edad + "\n" + 
               "Escuderia: " + escuderia.name() + "\n";
    }   
    
    public abstract String realizarTarea();

    public int getLegajo() {
        return legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Escuderia getEscuderia() {
        return escuderia;
    }

    public String getTareaActual() {
        return tareaActual;
    }

    public boolean isTareaRealizada() {
        return tareaRealizada;
    }
    
    
    /**
     *
     * @param o IntegranteEscuderia que va a ser comparado
     * @return 0 si es el igual, -1 si es diferente
     */
    @Override
    public int compareTo(IntegranteEscuderia o){
        return Integer.compare(getLegajo(), o.getLegajo());
    }
}
