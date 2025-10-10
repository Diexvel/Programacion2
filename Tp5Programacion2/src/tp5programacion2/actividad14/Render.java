/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad14;

/**
 *
 * @author velar
 */
public class Render {
    private String formato;
    private Usuario usuario;

    public Render(String formato) {
        this.formato = formato;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getFormato() {
        return formato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public String toString() {
        return "Render{" + "formato=" + formato + ", usuario=" + usuario + '}';
    }
    
    

}
