/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3programacion2;

/**
 *
 * @author velar
 */
public class Tp3Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Estudiante diego = new Estudiante("Diego", "Velardes","Programacion 2", 7.5);
        diego.mostrarInfo();
        diego.subirCalificacion(0.5);
        diego.bajarCalificacion(1);
        diego.mostrarInfo();
        
        Mascota baddy = new Mascota("Baddy", "Perro", 9);
        baddy.mostrarInfo();
        baddy.cumplirAnios();
        baddy.cumplirAnios();
        baddy.mostrarInfo();
        
        Libro nuevo = new Libro("Hábitos atómicos", "James Clear", 2018);
        
        nuevo.setAnioPublicacion(2028);
        nuevo.setAnioPublicacion(1999);
        
        String titulo = nuevo.getTitulo();
        String autor = nuevo.getAutor();
        int anio = nuevo.getAnioPublicacion();
        
        System.out.println("*Titulo = " + titulo + " *Autor = " + autor + " *Año = " + anio);
        
        Gallina gallina1 = new Gallina(1);
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.mostrarEstado();
        
        Gallina gallina2 = new Gallina(2);
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina2.mostrarEstado();
        
        NaveEspacial nave = new NaveEspacial( "Nave 1", 50 );
        nave.avanzar(70);
        nave.recargarCombustible(50);
        nave.avanzar(70);
        nave.mostrarEstado();
        
    }
    
}
