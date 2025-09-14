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
public class Ejercicio10 {
    
    public static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    public void stock(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stock = sc.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int vendida = sc.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int recibida = sc.nextInt();

        int nuevoStock = actualizarStock(stock, vendida, recibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

    }
    
}
