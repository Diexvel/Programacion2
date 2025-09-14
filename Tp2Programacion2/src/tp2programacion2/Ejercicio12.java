/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2programacion2;

/**
 *
 * @author velar
 */
public class Ejercicio12 {
    
    public void precios(){
    
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }

        precios[2] = 129.99;

        System.out.println("Precios modificados:");
        for (double p : precios) {
            System.out.println("Precio: $" + p);
        }
    
    }
    
}
