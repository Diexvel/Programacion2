/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte1Interfaces;

/**
 *
 * @author velar
 */
import tp8programacion2.parte1Interfaces.Interfaces.Pagable;
import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {
    public enum Estado { CREADO, PAGADO, ENVIADO, ENTREGADO }

    private List<Producto> productos;
    private Estado estado;
    private Cliente cliente; // para notificaciones

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.estado = Estado.CREADO;
        this.cliente = cliente;
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) total += p.calcularTotal();
        return total;
    }

    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;
        if (cliente != null) {
            cliente.notificar("El pedido cambió a: " + nuevoEstado);
        }
    }

    public Estado getEstado() { return estado; }
    public List<Producto> getProductos() { return productos; }
}
