package dependencia;

public class Impresora {
    boolean estaEncendida = false;
    
    public void encender(){
        this.estaEncendida = !this.estaEncendida;
    }
    
    public void imprimir(Documento doc){
        System.out.println(doc.getTitulo());
        System.out.println("----------------------------------------------");
        System.out.println(doc.getCuerpo());      
    }
}
