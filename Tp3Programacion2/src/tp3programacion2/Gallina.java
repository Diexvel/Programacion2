/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3programacion2;

/**
 *
 * @author velar
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    public Gallina(int idGallina) {
        this.idGallina = idGallina;
        this.edad = 0;
        this.huevosPuestos = 0;
    }


    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " - Edad: " + edad + " - Huevos: " + huevosPuestos);
    }

}
