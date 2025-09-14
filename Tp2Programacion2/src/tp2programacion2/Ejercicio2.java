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
public class Ejercicio2 {
    
    public void mayor3numeros(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();

        int mayor = n1;
        if (n2 > mayor) mayor = n2;
        if (n3 > mayor) mayor = n3;

        System.out.println("El mayor es: " + mayor);

    
    }
}
