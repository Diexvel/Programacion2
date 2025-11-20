/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte2Exepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author velar
 */
public class LeerArchivo {
    public static void main(String[] args) {
        File archivo = new File("texto.txt"); 
        try (Scanner sc = new Scanner(archivo)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + archivo.getName());
        }
    }
}