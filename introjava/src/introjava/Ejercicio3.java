/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadena;
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese una oracion");
       cadena = leer.next();
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }
    
}
