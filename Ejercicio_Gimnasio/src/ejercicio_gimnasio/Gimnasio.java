package ejercicio_gimnasio;

import java.util.ArrayList;

public class Gimnasio {
    private String nombre;
    private ArrayList<Entrenador> entrenadores;
    
    public Gimnasio(String nombre){
        entrenadores = new ArrayList<>();
        this.nombre = nombre; 
    }
    
    public void agregarEntrenador(Entrenador e){
        if(e != null){
            this.entrenadores.add(e);
        }
    }
    
    public void mostrarEntrenadores(){
        System.out.println("Gimnasio: " + this.nombre);
        for(Entrenador e: entrenadores){
            System.out.println(e);
        }
    }
    
    public void mostrarSueldos(){
        System.out.println("Sueldos Gimnasio: " + this.nombre);
        for(Entrenador e: entrenadores){
            System.out.println(e.nombreCompleto() + ": $" + String.format("%.2f", e.getSueldo()));
        }
    }
    
    public Entrenador entrenadorConMasClientes(){
        Entrenador mayor = null;
        int mayorCantidad = -1;
        
        for(Entrenador e: entrenadores){
            if(e instanceof PersonalTrainer p && (mayor == null || p.getCantClientes() > mayorCantidad)){
                mayorCantidad = p.getCantClientes();
                mayor = p;
            }
        }
            
        return mayor;
    }
}
