/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad14;

/**
 *
 * @author velar
 */
public class Usuario {
    private String nombre;
    private int duracion;

    public Usuario(String nombre, int duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", duracion=" + duracion + '}';
    }
    
    

}
