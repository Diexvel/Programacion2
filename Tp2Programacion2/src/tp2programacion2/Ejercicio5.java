/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2programacion2;

import java.util.Scanner;

/**
 *
 * @author velar
 */
public class Ejercicio5 {
    
    public void sumaPares(){
        
        Scanner sc = new Scanner(System.in);
        int numero, suma = 0;

        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = sc.nextInt();
            if (numero % 2 == 0 && numero != 0) {
                suma += numero;
            }
        } while (numero != 0);

        System.out.println("La suma de los números pares es: " + suma);

        
    }
}
