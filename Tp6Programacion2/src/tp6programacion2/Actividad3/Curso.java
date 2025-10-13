/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6programacion2.Actividad3;

/**
 *
 * @author velar
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor nuevoProfesor) {
    if (this.profesor != null && this.profesor != nuevoProfesor) {
        this.profesor.getCursos().remove(this); // rompe vínculo anterior
    }

    this.profesor = nuevoProfesor;

    if (nuevoProfesor != null && !nuevoProfesor.getCursos().contains(this)) {
        nuevoProfesor.getCursos().add(this); // agrega sin llamar a setProfesor()
    }
}
    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " (" + codigo + ")");
        System.out.println("Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar"));
    }
 
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }
    
}
