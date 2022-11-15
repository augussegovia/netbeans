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
public class Ejercicio8 {
        public static void main(String[] args) {
     /*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el 
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java*/
         Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una frase o palabra");
            String frase=leer.next();
            switch (frase.length()){
                case 8:
                    System.out.println("correcto");
                    break;
                default:
                    System.out.println("incorrecto");
            }
                
            }
                    
            
}
