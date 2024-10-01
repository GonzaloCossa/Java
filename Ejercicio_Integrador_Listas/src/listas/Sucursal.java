
package listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Sucursal {
    private String nombre;
    private ArrayList<Dispositivo> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.dispositivos = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getCantDisp(){
        return dispositivos.size();
    }
    
    private int[] getCantDispPorTipo(){
        int[] cants = new int[TipoDispositivo.values().length];
        
        for(TipoDispositivo t: TipoDispositivo.values()){
            for(Dispositivo d: dispositivos){
                if(d.getTipo().equals(t)){
                    cants[t.ordinal()]++;
                }
            }
        }    
        return cants;
    }
    
    public void agregarDispositivo(Dispositivo dispositivo){
        if(dispositivo != null){
            dispositivos.add(dispositivo); 
        }
    }
    
    public void listarDispositivos(){
        if(dispositivos.isEmpty()){
            System.out.println("No hay dispositivos en la lista.");
        }else{
            for(Dispositivo d: dispositivos){
                System.out.println(d);
            }
        }
    }
    
    public ArrayList<Dispositivo> dispositivosPorTipo(TipoDispositivo tipo){
        ArrayList<Dispositivo> lista = new ArrayList<>();
        
        for(Dispositivo d: dispositivos){
            if(d.getTipo() == tipo){
                lista.add(d);
            }
        }
        return lista;
    }
    
    public double[] porcDispositivosPorTipo(){
        double[] porcentajes = new double[TipoDispositivo.values().length];
        int i = 0;
        
        int[] cantPorTipo = this.getCantDispPorTipo();
        int cantDisp = this.getCantDisp();

        while(i < TipoDispositivo.values().length){
            double porc = ((double)cantPorTipo[i] / cantDisp) * 100;
            porcentajes[i] = porc;
            i++;
        }          
        return porcentajes;
    }
      
    private Dispositivo buscarDispositivo(String id){
        int i = 0;
        while(i < dispositivos.size() && !(dispositivos.get(i).getId().equals(id))){     
            i++;
        }
        return i == dispositivos.size() ? null : dispositivos.get(i);
    }
    
    /*public Dispositivo borrarDispositivo(String id){
        Dispositivo d = buscarDispositivo(id);
        if(d != null){
            dispositivos.remove(d);
        }
        return d;
    }*/
    public Dispositivo borrarDispositivo(String id){
        Iterator<Dispositivo> it = dispositivos.iterator();
        while(it.hasNext()){
            Dispositivo d = it.next();
            if(d.getId().equals(id)){
                it.remove();
                return d;
            }
        }
        return null;
    }
}
