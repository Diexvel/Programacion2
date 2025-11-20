/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte2Exepciones;

/**
 *
 * @author velar
 */
public class ValidadarEdad {
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
    }

    public static void main(String[] args) {
        int[] pruebas = {25, -3, 200};
        for (int e : pruebas) {
            try {
                validarEdad(e);
                System.out.println("Edad " + e + " válida.");
            } catch (EdadInvalidaException ex) {
                System.out.println("Capturada: " + ex.getMessage());
            }
        }
    }
}

