/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad6;

/**
 *
 * @author velar
 */
public class Mesa {
    private String numero;
    private String Capacidad;

    public Mesa(String numero, String Capacidad) {
        this.numero = numero;
        this.Capacidad = Capacidad;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    @Override
    public String toString() {
        return "Mesa{" + "numero=" + numero + ", Capacidad=" + Capacidad + '}';
    }
    
    
}
