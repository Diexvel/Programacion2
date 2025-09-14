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
public class Ejercicio8 {
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        return precioBase + (precioBase * impuesto) - (precioBase * descuento);
    }
    
    public void precioFinal(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = sc.nextDouble();
        System.out.print("Ingrese el impuesto en %: ");
        double impuesto = sc.nextDouble() / 100;
        System.out.print("Ingrese el descuento en %: ");
        double descuento = sc.nextDouble() / 100;

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.println("El precio final del producto es: " + precioFinal);

    }
    
}
