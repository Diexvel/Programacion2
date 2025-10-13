/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp6programacion2.Actividad1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author velar
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto p){
        productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
            System.out.println("-------");
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        int i = 0;
        while (i < productos.size()) {
            Producto p = productos.get(i);
            if (p.getId().equals(id)) {
            return p;
            }
            i++;
        }
        return null;
    }
    
    public void eliminarProducto(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) p.setCantidad(nuevaCantidad);
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) filtrados.add(p);
        }
        return filtrados;
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getCantidad();
        return total;
    }
    
    public Producto obtenerProductoConMayorStock() {
    if (productos.isEmpty()) return null; 

    Producto productoMax = productos.get(0); 
        for (int i = 1; i < productos.size(); i++) { 
            Producto actual = productos.get(i);
            if (actual.getCantidad() > productoMax.getCantidad()) {
            productoMax = actual; 
            }
        }
         return productoMax;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> filtrados = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) filtrados.add(p);
        }
        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + ": " + c.getDescripcion());
        }
    }

}
