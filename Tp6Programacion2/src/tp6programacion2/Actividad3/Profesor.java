/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6programacion2.Actividad3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author velar
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void agregarCurso(Curso c) {
    if (!cursos.contains(c)) {
        cursos.add(c);
        if (c.getProfesor() != this) {
            c.setProfesor(this); 
        }
    }
}

    public void eliminarCurso(Curso c) {
        if (cursos.remove(c)) {
            c.setProfesor(null); 
        }
    }

    public void listarCursos() {
        for (Curso c : cursos) {
            System.out.println(c.getCodigo() + " - " + c.getNombre());
        }
    }

    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " (" + especialidad + ")");
        System.out.println("Cursos dictados: " + cursos.size());
    }

    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    
}
