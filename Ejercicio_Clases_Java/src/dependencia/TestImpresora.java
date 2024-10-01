
package dependencia;

public class TestImpresora {
    
    public static void main(String[] args) {
        Documento doc = new Documento("Titulo de Prueba", "Este es el cuerpo del doc.");
        Impresora imp = new Impresora();
        
        //imp.encender();
        
        try {
            if(imp.estaEncendida){
                imp.imprimir(doc);
            } 
            throw new RuntimeException("Impresora Apagada");
        } catch (RuntimeException e) {
            
        } 
    }   
}
