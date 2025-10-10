/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad13;

/**
 *
 * @author velar
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR qr = new CodigoQR(valor);
        qr.setUsuario(usuario);
        qr.toString();
    }
}
