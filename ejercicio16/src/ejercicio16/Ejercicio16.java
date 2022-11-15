/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

import java.util.Scanner;

/**
 *Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetid
 * @author Lenovo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[] vector= new int[n];
        for (int i = 0; i < n; i++) {
            vector[i]= (int) (Math.random() * 10);
        }
        System.out.println("Ingrese el numero a buscar");
        int num=leer.nextInt();
        for (int i = 0; i < n; i++) {
            if (vector[i]==num){
                System.out.println("el numero buscado se encuentra en la posicion= "+i);
            }
            
        }
        
    }
    
}
