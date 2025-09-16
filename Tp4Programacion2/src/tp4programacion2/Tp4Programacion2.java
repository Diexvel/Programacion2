/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp4programacion2;

import static tp4programacion2.Empleado.mostrarTotalEmpleados;

/**
 *
 * @author velar
 */
public class Tp4Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado diego = new Empleado(1,"Diego Velardes", "Vendedor", 1200000);
        diego.actualizarSalario(5);
        System.out.println(diego.toString());
        
        Empleado norma = new Empleado("Norma Allende", "Vendedor");
        norma.actualizarSalario(25000.50);
        System.out.println(norma.toString());
        
        
        Empleado ramon = new Empleado("Ramon Lopez", "Cajero");
        ramon.actualizarSalario(8);
        System.out.println(ramon.toString());
        
        System.out.println("Total de empleados: "+ mostrarTotalEmpleados() );
        
        
    }
    
}
