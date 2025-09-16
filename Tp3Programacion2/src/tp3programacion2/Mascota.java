/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3programacion2;

/**
 *
 * @author velar
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInfo() {
        System.out.println(nombre + " es un(a) " + especie + " de " + edad + " años.");
    }

    public void cumplirAnios() {
        edad++;
    }

}
