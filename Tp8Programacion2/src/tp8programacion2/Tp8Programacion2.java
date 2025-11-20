/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp8programacion2;

import tp8programacion2.parte1Interfaces.Cliente;
import tp8programacion2.parte1Interfaces.Pedido;
import tp8programacion2.parte1Interfaces.Producto;
import tp8programacion2.parte1Interfaces.TarjetaCredito;

/**
 *
 * @author velar
 */
public class Tp8Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cliente cliente = new Cliente("Ana", "ana@correo.com");
        Pedido pedido = new Pedido(cliente);

        pedido.agregarProducto(new Producto("Camiseta", 1200));
        pedido.agregarProducto(new Producto("Pantalón", 2500));

        System.out.println("Total pedido: $" + pedido.calcularTotal());

       
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9012-3456", "Ana");
        double totalConDesc = tarjeta.aplicarDescuento(pedido.calcularTotal());
        boolean exito = tarjeta.procesarPago(totalConDesc);
        if (exito) {
            pedido.cambiarEstado(Pedido.Estado.PAGADO);
        }

       
    }
    
}
