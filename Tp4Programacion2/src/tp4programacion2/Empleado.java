/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp4programacion2;

/**
 *
 * @author velar
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    private static int totalEmpleados = 0;
    private static int nextId = 1;
    
     public Empleado(int id, String nombre, String puesto, double salario) {
        
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        
        totalEmpleados++;
        if (id >= nextId) {
            nextId = id + 1;
        }
    }
     
     public Empleado(String nombre, String puesto) {
        this.id = nextId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1500000; 
        totalEmpleados++;
    }
     
        // aumento por porcentaje 
    public void actualizarSalario(int porcentaje) {
        if (porcentaje < 0) {
            System.out.println("El porcentaje no puede ser negativo.");
        }
        double aumento = this.salario * (porcentaje / 100.0);
        this.salario += aumento;
    }

        // aumento por cantidad fija
    public void actualizarSalario(double cantidad) {
        if (cantidad < 0) {
            System.out.println("La cantidad de aumento no puede ser negativa.");
        }
        this.salario += cantidad;
    }

    
    @Override
    public String toString() {
        return String.format("Empleado[id= " + this.id + " nombre= " + this.nombre + " puesto= " + this.puesto + " salario= "+ this.salario + "]");
              
    }
  
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id >= nextId) {
            nextId = id + 1;
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            System.out.println("El salario no puede ser negativo.");
        }
        this.salario = salario;
    }
}
