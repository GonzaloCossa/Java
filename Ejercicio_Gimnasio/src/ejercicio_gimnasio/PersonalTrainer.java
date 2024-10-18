package ejercicio_gimnasio;

public class PersonalTrainer extends Entrenador {
    private double sueldoMinimo;
    private int cantidadClientes;
    private double montoPorCliente;

    public PersonalTrainer(int legajo, String nombre, String apellido, int anioIngreso, double sueldoMinimo, int cantidadClientes, double montoPorCliente) {
        super(legajo, nombre, apellido, anioIngreso);
        this.sueldoMinimo = sueldoMinimo;
        this.cantidadClientes = cantidadClientes;
        this.montoPorCliente = montoPorCliente;
    }
    
    @Override
    public double getSueldo(){
        double sueldo = cantidadClientes * montoPorCliente;
        
        if(sueldo < sueldoMinimo){
            sueldo = sueldoMinimo;
        }
        return sueldo;
    }
    
    public int getCantClientes(){
        return cantidadClientes;
    }
}
