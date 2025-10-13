/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp6programacion2;

import tp6programacion2.Actividad3.Curso;
import tp6programacion2.Actividad3.Profesor;
import tp6programacion2.Actividad3.Universidad;



/**
 *
 * @author velar
 */
public class Tp6Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Universidad uni = new Universidad("UTN");

        Profesor prof1 = new Profesor("P1", "Ana Torres", "Matemática");
        Profesor prof2 = new Profesor("P2", "Luis Gómez", "Programación");
        Profesor prof3 = new Profesor("P3", "María López", "Estadística");

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Java");
        Curso c3 = new Curso("C103", "Probabilidad");
        Curso c4 = new Curso("C104", "POO");
        Curso c5 = new Curso("C105", "Estadística II");

        uni.agregarProfesor(prof1);
        uni.agregarProfesor(prof2);
        uni.agregarProfesor(prof3);

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P2");
        uni.asignarProfesorACurso("C103", "P3");
        uni.asignarProfesorACurso("C104", "P2");
        uni.asignarProfesorACurso("C105", "P3");

        System.out.println("Cursos:");
        uni.listarCursos();

        System.out.println("Profesores:");
        uni.listarProfesores();

        System.out.println("Cambiar profesor de C104:");
        uni.asignarProfesorACurso("C104", "P1");

        System.out.println("Eliminar curso C103:");
        uni.eliminarCurso("C103");

        System.out.println("Eliminar profesor P2:");
        uni.eliminarProfesor("P2");

        System.out.println("Reporte de cursos por profesor:");
        uni.reporteCursosPorProfesor();

    }

        
    }
    

