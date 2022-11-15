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
public class Ejercicio6 {
     public static void main(String[] args) {
         //Crear un programa que dado un numero determine si es par o impar
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int n;
         n = leer.nextInt();
         if (n%2==0){
             System.out.println("el numero es par");
                  } else {
             System.out.println("el numero es impar");        
                     }
             
         }
}
