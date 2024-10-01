
package herencia;

import java.util.ArrayList;

public class Concesionario {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario(String nombre) {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo vehiculo){
    try {
        if (vehiculo == null) {
            throw new NullPointerException("El vehículo no puede ser nulo");
        }
        this.vehiculos.add(vehiculo);
    } catch (NullPointerException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
    
    public void listarVehiculos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay Vehiculos");
        }
        else{
           for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }  
        }   
    }
    
    public void listarAutos(){
        if(vehiculos.isEmpty()){
            System.out.println("No hay Vehiculos");
        }
        else{
           for (Vehiculo vehiculo : vehiculos) {
               if(vehiculo instanceof Auto){
                  System.out.println(vehiculo); 
               } 
            }  
        } 
    }
}