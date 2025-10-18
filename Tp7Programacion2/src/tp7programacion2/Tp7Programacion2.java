/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7programacion2;

import java.util.Arrays;
import java.util.List;
import tp7programacion2.Actividad4.Animal;
import tp7programacion2.Actividad4.Gato;
import tp7programacion2.Actividad4.Perro;
import tp7programacion2.Actividad4.Vaca;



/**
 *
 * @author velar
 */
public class Tp7Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<Animal> granja = Arrays.asList(new Perro("Rex"), new Gato("Michi"), new Vaca("Lola"));
            for (Animal a : granja) {
            a.describirAnimal();
}

       
    }
}
