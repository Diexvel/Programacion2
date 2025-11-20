/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte1Interfaces;

import tp8programacion2.parte1Interfaces.Interfaces.PagoConDescuento;
import tp8programacion2.parte1Interfaces.Interfaces.Pago;

/**
 *
 * @author velar
 */
public class TarjetaCredito implements Pago, PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public boolean procesarPago(double monto) {
        // simulación sencilla: siempre ok si monto > 0
        System.out.println("Procesando pago con tarjeta: $" + monto);
        return monto > 0;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // ejemplo: 5% de descuento con tarjeta
        return monto * 0.95;
    }
}
