
package listas;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Sucursal> sucursales;

    public Empresa() {
        this.sucursales = new ArrayList<>();
    }
    
    public void agregarSucursal(Sucursal sucursal){
        if(sucursal != null){
            sucursales.add(sucursal); 
        }
    }
    
    public Dispositivo borrarDispositivo(String id){
        Dispositivo d = null;
        int i = 0;
        
        while(i < sucursales.size() && d == null){
            d = sucursales.get(i).borrarDispositivo(id);
            i++;
        }
       
        return d;
    }   
    
    public void listarDispositivos(){
        if(sucursales.isEmpty()){
            System.out.println("No hay sucursales en la lista.");
        }else{
            for(Sucursal s: sucursales){
                s.listarDispositivos();
            }
        }
    }
    
    private Sucursal buscarSucursal(String nombre){
        int i = 0;
        while(i < sucursales.size() && !(sucursales.get(i).getNombre().equals(nombre))){     
            i++;
        }
        return i == sucursales.size() ? null : sucursales.get(i);
    }
    
    public ArrayList<Dispositivo> dipositivosPorTipo(TipoDispositivo tipo){
        ArrayList<Dispositivo> lista = new ArrayList<>();
        
        for(Sucursal suc: sucursales){
            lista.addAll(suc.dispositivosPorTipo(tipo));
        }
        
        return lista;
    }
    
    public double[] porcentajePorTipo(String nombre){
        Sucursal s = buscarSucursal(nombre);
        return s == null ? null : s.porcDispositivosPorTipo();
    }
    
    public void mostrarPorcentajes(String nombre){
        double[] p = porcentajePorTipo(nombre);
        int i = 0;
        
        for(TipoDispositivo t: TipoDispositivo.values()){
           System.out.printf("%s: %.2f%%\n", t, p[i]);
           i++;
        }
    }
}
