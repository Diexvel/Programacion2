/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad4;

/**
 *
 * @author velar
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Libro libro;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
        if (libro != null && libro.getUsuario() != this) {
        libro.setUsuario(this);}
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Libro getLibro() {
        return libro;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", libro=" + libro + '}';
    }
    
    
    
    
}
