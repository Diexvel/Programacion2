/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7programacion2.Actividad1;

/**
 *
 * @author velar
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto: " + marca + " " + modelo + " - Puertas: " + cantidadPuertas);
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
}
