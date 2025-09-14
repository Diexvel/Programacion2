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
public class Ejercicio7 {
    
    public void notas(){
    
        Scanner sc = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota guardada correctamente.");

    }
    
}
