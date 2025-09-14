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
public class Ejercici5 {
    Scanner scanner = new Scanner(System.in);
        
        public void operaciones(){
            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();

            int suma = num1 + num2;
            int resta = num1 - num2;
            int multiplicacion = num1 * num2;
            double division = (num2 != 0) ? (double) num1 / num2 : 0;

            System.out.println("Suma: " + suma);
            System.out.println("Resta: " + resta);
            System.out.println("Multiplicación: " + multiplicacion);
            if (num2 != 0) {
                System.out.println("División: " + division);
            } else {
                System.out.println("No se puede dividir por cero.");
            }

           
        }
}
