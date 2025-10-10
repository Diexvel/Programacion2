/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad14;

/**
 *
 * @author velar
 */
public class EditorVideo {
    public void generar(String formato, Usuario usuario){
        Render video = new Render(formato);
        video.setUsuario(usuario);
        video.toString();
    }
}
