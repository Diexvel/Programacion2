/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp5programacion2.actividad10;

/**
 *
 * @author velar
 */
public class CuentaBancaria {
    private String cbu;
    private String saldo;
    private Titular titular;
    private ClaveSeguridad claveSeguridad;

    public CuentaBancaria(String cbu, String saldo, String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
        titular.setCuentaBancaria(this);}
    }

    public String getCbu() {
        return cbu;
    }

    public String getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu=" + cbu + ", saldo=" + saldo + ", titular=" + titular + ", claveSeguridad=" + claveSeguridad + '}';
    }
    
    


}
