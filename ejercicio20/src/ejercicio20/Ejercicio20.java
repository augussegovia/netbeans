/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

import java.util.Scanner;

/**
 * . Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 *
 * @author Lenovo
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        relleno(matriz);
        mostrarmatriz(matriz);
        suma(matriz);
    }
    public static void relleno(int[][] matriz){
         Scanner leer = new Scanner(System.in);
                System.out.println("rellene la matriz con numeros del 1 al 9");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("numero no valido, ingrese otro numero del 1 al 9");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }
    }
    
    public static void mostrarmatriz(int[][] matriz) {
        System.out.println("la matriz es: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    public static void suma(int matriz[][]) {
        int sumacol, sumafila, sumadia;
        int i = 0;
        sumacol = matriz[0][0] + matriz[1][0] + matriz[2][0];
        sumafila = matriz[0][0] + matriz[0][1] + matriz[0][2];
        sumadia = matriz[0][0] + matriz[1][1] + matriz[2][2];
        if (sumacol == sumafila && sumafila == sumadia) {
            System.out.println("la matriz es mágica");
        } else {
            System.out.println("la matriz no es mágica");
        }
    }
}

    


