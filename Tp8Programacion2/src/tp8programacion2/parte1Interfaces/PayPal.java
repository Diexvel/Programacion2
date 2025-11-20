/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp8programacion2.parte1Interfaces;

import tp8programacion2.parte1Interfaces.Interfaces.Pago;

/**
 *
 * @author velar
 */
public class PayPal implements Pago {
    private String email;

    public PayPal(String email) { this.email = email; }

    @Override
    public boolean procesarPago(double monto) {
        System.out.println("Procesando pago con PayPal: $" + monto);
        return monto > 0;
    }
}