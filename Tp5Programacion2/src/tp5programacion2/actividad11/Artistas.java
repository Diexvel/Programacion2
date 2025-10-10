/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad11;

/**
 *
 * @author velar
 */
public class Artistas {
    private String nombre;
    private String genero;

    public Artistas(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Artistas{" + "nombre=" + nombre + ", genero=" + genero + '}';
    }
    
    
}
