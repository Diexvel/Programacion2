/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad11;

/**
 *
 * @author velar
 */
public class Cancion {
    private String titulo;
    private Artistas artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artistas artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public Artistas getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + '}';
    }
    
    
}
