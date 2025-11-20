/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte2Exepciones;

/**
 *
 * @author velar
 */
import java.util.Scanner;

public class DivisionSegura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Dividendo: ");
            int a = Integer.parseInt(sc.nextLine());
            System.out.print("Divisor: ");
            int b = Integer.parseInt(sc.nextLine());
            int resultado = dividir(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException ae) {
            System.out.println("Error: división por cero no permitida.");
        } catch (NumberFormatException nfe) {
            System.out.println("Error: entrada no es un número válido.");
        } finally {
            sc.close();
            System.out.println("Fin del intento de división.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b; // lanza ArithmeticException si b == 0
    }
}
