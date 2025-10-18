/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7programacion2.Actividad3;

/**
 *
 * @author velar
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private int añosAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, int añosAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.añosAntiguedad = añosAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * (1 + 0.02 * añosAntiguedad);
    }
}
