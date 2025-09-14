/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1programacion2;

import java.util.Scanner;

/**
 *
 * @author velar
 */
public class Ejercicio4 {
    Scanner scanner = new Scanner(System.in);
        
    
        public void nombreEdad() {
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        
    }
}
