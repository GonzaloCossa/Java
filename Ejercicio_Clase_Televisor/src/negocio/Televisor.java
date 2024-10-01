package negocio;

import java.util.Arrays;

public class Televisor {
    private static final int VOL_MAX = 2;
    private static final int VOL_MIN = 0;
    private static int nextNroSerie = 10000;
    private final int NRO_SERIE;
    private String marca;
    private double tamanio;
    private int[] canales;
    private int volumen;
    private boolean encendido;
    
    public Televisor(String marca, double tamanio){
        this.NRO_SERIE = nextNroSerie++;
        this.marca = marca;
        this.tamanio = tamanio;
        this.canales = new int[]{1, 2, 3, 4, 5};
        this.volumen = 1;
        this.encendido = false;   
    }
    
    public Televisor(){
        this(null, 0);
    }
    
    public void power(){
        this.encendido = !this.encendido;
    }
    
    public void subirVolumen(){
        if (this.encendido && this.volumen < VOL_MAX) {
           this.volumen++; 
           mostrarVolumen();
        }
    }
    
    public void bajarVolumen(){
        if (this.encendido && this.volumen > VOL_MIN) {
            this.volumen--;
            mostrarVolumen();    
        }
    }
      
    private void mostrarVolumen(){
        System.out.printf("Volumen: %d\n", this.volumen);
    }
    
    public String[] mostrarCanales() {
        String[] canalesTexto = new String[this.canales.length];

        for (int i = 0; i < this.canales.length; i++) {
            canalesTexto[i] = "Canal " + this.canales[i]; 
        }  
        return canalesTexto;  
    }
    
    @Override
    public String toString(){
        return String.format("Numero de Serie: %d\nMarca: %s\nTamanio: %.1f\nCanales: %s\nVolumen: %d\nEncendido: %s\n", this.NRO_SERIE, this.marca, this.tamanio, Arrays.toString(mostrarCanales()), this.volumen, this.encendido ? "Si" : "No");
        
    }  
}
