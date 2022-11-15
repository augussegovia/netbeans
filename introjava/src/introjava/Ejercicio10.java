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
public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
       /* Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
        System.out.println("Ingrese el limite");
        int lim=leer.nextInt(),suma;
        suma=0;
        for (int i = 0; i < lim; i++) {
            System.out.println("ingrese numero a sumar");
            int num=leer.nextInt();
            suma=suma+num;
            if (suma>lim){
                break;
            }
        }
        System.out.println("la suma es: "+suma);
    }

     
}
