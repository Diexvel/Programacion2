/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad7;

/**
 *
 * @author velar
 */
public class Motor {
    private String numero;
    private String capacidad;

    public Motor(String numero, String capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public String getCapacidad() {
        return capacidad;
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", capacidad=" + capacidad + '}';
    }
    
    
}
