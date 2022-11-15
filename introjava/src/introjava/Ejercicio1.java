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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1, n2, suma;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        n1=leer.nextInt();
        System.out.println("ingrese el segundo numero");
        n2=leer.nextInt();
        suma=n1+n2;
        System.out.println("la suma de los dos numeros es:" + suma);
    }
    
}
