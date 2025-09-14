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
public class Ejercicio8 {
 
    public void divisionInt(){
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado (entero): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
    
    
    public void divisionDouble(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("En este programa hace la division con double\n");
        
        System.out.print("Ingrese el primer número (double): ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número (double): ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            double resultado = num1 / num2;
            System.out.println("Resultado (decimal): " + resultado);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}
