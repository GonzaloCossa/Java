
package auto;

import java.util.ArrayList;

public class Estacionamiento {
    private ArrayList<Auto> autos;
    
    public Estacionamiento(){
        this.autos = new ArrayList<>();
    }
    
    public void guardarAuto(Auto auto){
        if(auto == null){
            throw new NullPointerException();
        }
        this.autos.add(auto);
    }
    
    public void listarAutos(){
        for (Auto auto : autos) {
            System.out.println(auto.toString());
        }
    }
    
    public void contarEstacionados(){
        System.out.println(String.format("Hay %d autos estacionados", this.autos.size()));
    }
}
