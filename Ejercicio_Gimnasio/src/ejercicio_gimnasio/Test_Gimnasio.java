package ejercicio_gimnasio;

public class Test_Gimnasio {
    
    public static void main(String[] args) {
      Gimnasio g = new Gimnasio("InterGym");
      g.agregarEntrenador(new PersonalTrainer(11111, "Joaco", "Lopez", 2020, 100000, 10, 8000));
      g.agregarEntrenador(new PersonalTrainer(33333, "Markito", "Navajas", 2023, 100000, 20, 8000));
      g.agregarEntrenador(new PersonalTrainer(55555, "Marito", "Baracus", 2015, 250000, 15, 10000));
      g.agregarEntrenador(new EntrenadorEquipo(44444, "Mike", "MaquinaDelMal", 2019, 300000));
      g.agregarEntrenador(new EntrenadorEquipo(22222, "El", "Momo", 2021, 200000));
      g.agregarEntrenador(new EntrenadorEquipo(66666, "Loco", "Motora", 2010, 500000));
      
      //g.mostrarEntrenadores();
      g.mostrarSueldos();
      System.out.println(g.entrenadorConMasClientes().nombreCompleto());
    }   
}
