
package listas;

import java.util.Arrays;

public class TestCompumundo {

    public static void main(String[] args) {
        Empresa e = new Empresa();
        cargarEmpresa(e);
        
        e.listarDispositivos();
        
        System.out.println("----------------------------------------------------------");
        
        e.mostrarPorcentajes("Sucursal A");
        
        System.out.println("----------------------------------------------------------");
        
        /*for(TipoDispositivo t: TipoDispositivo.values()){
            System.out.printf("%s:\n", t);
            for(Dispositivo d: e.dipositivosPorTipo(t)){
                System.out.println(d); 
            } 
            System.out.println("----------------------------------------------------------");
        }*/
        
        System.out.println(e.borrarDispositivo("CC123"));
        
        System.out.println("----------------------------------------------------------");
        
        e.mostrarPorcentajes("Sucursal A");
    } 
        
    
    private static void cargarEmpresa(Empresa empresa){
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        s1.agregarDispositivo(new Dispositivo("AA123", 12400, TipoDispositivo.COMPUTADORA));
        s1.agregarDispositivo(new Dispositivo("BB123", 10000, TipoDispositivo.COMPUTADORA));
        s1.agregarDispositivo(new Dispositivo("CC123", 5800, TipoDispositivo.TABLET));
        s1.agregarDispositivo(new Dispositivo("DD123", 7000, TipoDispositivo.TELEFONO));
        
        s2.agregarDispositivo(new Dispositivo("GG987", 30000, TipoDispositivo.COMPUTADORA));
        s2.agregarDispositivo(new Dispositivo("HH765", 5000, TipoDispositivo.TABLET));
        s2.agregarDispositivo(new Dispositivo("TT578", 2400, TipoDispositivo.TELEFONO));
        
        empresa.agregarSucursal(s1);
        empresa.agregarSucursal(s2);
    }
}
