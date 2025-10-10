/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5programacion2;

import tp5programacion2.actividad1.Pasaporte;
import tp5programacion2.actividad1.Titular;
import tp5programacion2.actividad1.Foto; 
import tp5programacion2.actividad2.Bateria;
import tp5programacion2.actividad2.Celular;
import tp5programacion2.actividad2.Usuario;
import tp5programacion2.actividad3.Banco;
import tp5programacion2.actividad3.Cliente;
import tp5programacion2.actividad3.TarjetaDeCredito;

/**
 *
 * @author velar
 */
public class Tp5Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Ejericio 1");
       
       Pasaporte pasaporte = new Pasaporte( "123548", "26/09/25", "foto4x4", "jpg" );
       Titular titular1 = new Titular("Diego Velardes", "34857650");
       pasaporte.setTitular(titular1);
       pasaporte.mostrar();
       
       System.out.println("Ejericio 2");
       
       Bateria bateria = new Bateria("en-59", "5500");
       Celular celular = new Celular( "12345", "Motorola", "40 Edge", bateria);
       Usuario usuario1 = new Usuario("Diego Velardes", "34477650");
       celular.setUsuario(usuario1);
       celular.mostrar();
       
       System.out.println("Ejericio 3");
       
       Banco banco = new Banco("Nacion", "30125425625");
       TarjetaDeCredito tarjeta = new TarjetaDeCredito("456878412154", "02/10/30", banco);
       Cliente cliente1 = new Cliente("Diego Alejandro", "45852650");
       tarjeta.setCliente(cliente1);
       tarjeta.mostrar();       
       
       System.out.println("Ejericio 4");
       
       System.out.println("Ejericio 5");
       
       System.out.println("Ejericio 6");
       
       System.out.println("Ejericio 7");
       
       System.out.println("Ejericio 8");
       
       System.out.println("Ejericio 9");
       
       System.out.println("Ejericio 10");
       
       System.out.println("Ejericio 11");
       
       System.out.println("Ejericio 12");
       
       System.out.println("Ejericio 13");
       
       System.out.println("Ejericio 14");
       
    }
    
}
