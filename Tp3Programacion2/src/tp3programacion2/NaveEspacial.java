/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3programacion2;

/**
 *
 * @author velar
 */
public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    public void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    public void avanzar(int distancia) {
        if (combustible >= distancia) {
            combustible -= distancia;
            System.out.println(nombre + " avanzó " + distancia + " unidades.");
        } else {
            System.out.println("Combustible insuficiente.");
        }
    }

    public void recargarCombustible(int cantidad) {
        if (combustible + cantidad <= 100) {
            combustible += cantidad;
        } else {
            System.out.println("No se puede superar el límite de combustible.");
        }
    }

    public void mostrarEstado() {
        System.out.println(nombre + " - Combustible restante: " + combustible);
    }

}
