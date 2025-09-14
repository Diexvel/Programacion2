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
public class Ejercicio4 {
    
    public void descuento(){
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = sc.next().toUpperCase();
        
        double descuento = 0;
        
        if (null == categoria){
            System.out.print("Categoria de Descuento incorrecta");
        }
        else switch (categoria) {
            case "A":
                descuento = 0.10;
                break;
            case "B":
                descuento = 0.15;
                break;
            case "C":
                descuento = 0.20;
                break;
            default:
                System.out.print("Categoria de Descuento incorrecta");
                break;
        }
            
        
        
        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);

        
    }
    
}
