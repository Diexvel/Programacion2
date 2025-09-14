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
public class Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) {
            return peso * 5;
        } else {
            return peso * 10;
        }
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    
    public void costoCompra(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = sc.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);

    }
    
    
}
