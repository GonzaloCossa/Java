package entidades;

import enums.Escuderia;
import exceptions.TareaInvalidaException;
import interfaces.ResponsableTareas;

/**
 *
 * @author Gonzalo Agustín Cossa
 */
public class Piloto extends IntegranteEscuderia implements ResponsableTareas{
    private final int num;
    private int ptsCampeonato;
    
    /**
     *
     * @param legajo int Numero de legajo del piloto.
     * @param nombre String Nombre del piloto.
     * @param apellido String Apellido del piloto.
     * @param edad int Edad del piloto.
     * @param escuderia Escuderia Escuderia a la que pertenece el piloto.
     * @param num int Numero que utiliza el piloto en su monoplaza.
     * @param ptsCampeonato int Puntos que tiene el piloto en el campeonato de pilotos.
     */
    public Piloto(int legajo, String nombre, String apellido, int edad, Escuderia escuderia, int num, int ptsCampeonato){
        super(legajo, nombre, apellido, edad, escuderia);
        this.num = num;
        this.ptsCampeonato = ptsCampeonato;
    }   

    /**
     *
     * @return int Retorna el numero que utiliza el piloto en su monoplaza.
     */
    public int getNum() {
        return num;
    }

    /**
     *
     * @return int Retorna los puntos que tiene el piloto en el campeonato de pilotos.
     */
    public int getPtsCampeonato() {
        return ptsCampeonato;
    }
    
    /**
     *
     * @return String Informa si se pudo realizar la tarea o no.
     */
    @Override
    public String realizarTarea(){
        if (tareaActual == null || tareaActual.trim().isEmpty()) {
        throw new TareaInvalidaException("No hay tarea a realizar.");
        }
        if(!tareaRealizada){
            tareaRealizada = true;
            return "El piloto " + getNombre() + " " + getApellido() + " esta realizando la siguiente tarea: " + tareaActual;     
        }
        else{
            return "La tarea: " + tareaActual + " ya ha sido realizada anteriormente.";
        }
    }

    /**
     *
     * @param tarea String Con la nueva tarea a realizar para el piloto.
     */
    @Override
    public void asignarTarea(String tarea) {
        if (tarea == null || tarea.trim().isEmpty()) {
        throw new TareaInvalidaException("La tarea no puede ser nula ni estar vacia.");
        }
        tareaActual = tarea;
        tareaRealizada = false; 
    }

    /**
     *
     * @return String Informando el estado de la tarea que se le asigno.
     */
    @Override
    public String reportarProgreso() {
        if (tareaActual == null || tareaActual.isEmpty()) {
            return "No hay ninguna tarea asignada al piloto.";
        }
        return tareaRealizada? "La tarea: " + tareaActual + ", fue realizada con exito." 
                             : "La tarea: " + tareaActual + ", aun no se ha completado.";
    }  

    @Override
    public String toString() {
        return super.toString()
               + "Numero: " + num + "\n"
               + "Puntos Campeonato: " + ptsCampeonato + "\n"
               + "Tarea Actual: " + (tareaActual != null && !tareaActual.isEmpty() ? tareaActual : "No tiene tarea asignada.") + "\n"
               + "Tarea Realizada: " + tareaRealizada + "\n";
    }
}
