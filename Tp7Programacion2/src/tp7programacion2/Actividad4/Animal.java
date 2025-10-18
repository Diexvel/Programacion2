/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7programacion2.Actividad4;

/**
 *
 * @author velar
 */
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String hacerSonido() {
        return "sonido genérico";
    }

    public void describirAnimal() {
        System.out.println(this.getClass().getSimpleName() + " " + nombre + " hace: " + hacerSonido());
    }
}
