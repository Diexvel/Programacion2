/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte1Interfaces;

import tp8programacion2.parte1Interfaces.Interfaces.Notificable;

/**
 *
 * @author velar
 */
public class Cliente implements Notificable {
    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    @Override
    public void notificar(String mensaje) {
        // aquí simulamos la notificación por consola
        System.out.println("Notificación a " + nombre + " (" + email + "): " + mensaje);
    }

    public String getNombre() { return nombre; }
}
