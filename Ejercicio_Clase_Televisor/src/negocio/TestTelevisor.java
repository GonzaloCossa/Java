
package negocio;

import java.util.Scanner;

public class TestTelevisor {

    public static void main(String[] args) {
           
        Televisor tv = new Televisor("Alibaba", 55);
        
        System.out.print(tv.toString());
   
        Scanner input = new Scanner(System.in);
        
        int opcion;
        
        do {
            System.out.println("\nMenu");
            System.out.println("1. Encender/Apagar");
            System.out.println("2. Subir Volumen");
            System.out.println("3. Bajar Volumen");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            
            switch(opcion = input.nextInt()) {
                case 1:
                    tv.power();
                    System.out.println(tv.toString());
                    break;
                    
                case 2:
                    tv.subirVolumen();
                    System.out.println(tv.toString());
                    break;
                    
                case 3:
                    tv.bajarVolumen();
                    System.out.println(tv.toString());
                    break;
                    
                case 4:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 4); // Repite hasta que el usuario elija salir
        
        input.close(); // Cierra el scanner
    }
} 