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
public class Ejercicio4 {
    

      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en centígrados");        
        double centi=leer.nextDouble();
        double fahren= 32 + (9 * centi / 5);
        System.out.println("La temperatura en Fahrenheit es de: " + fahren);
}
}