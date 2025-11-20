/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte2Exepciones;

import java.util.Scanner;

/**
 *
 * @author velar
 */
public class ConvertirCadena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String cadena = sc.nextLine();

        try {
            int v = Integer.parseInt(cadena);
            System.out.println("Convertido: " + v);
        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir '" + cadena + "' a entero.");
        }

        sc.close();
    }
}
