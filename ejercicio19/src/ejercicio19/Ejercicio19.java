/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio19 {

    /** Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
	int A[][] = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};	//Se crea la matriz
	int AT[][] = new int[3][3];
        boolean esonoes = true;	//Se crea una variable bandera 2
        //Imprimir la matriz
        System.out.println("La matriz es:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + A[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        //Determinar si es antisimetrica
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[j][i] = (-1) * A[j][i];
                AT[i][j] = A[j][i];
                A[j][i] = (-1) * A[j][i];
                if (AT[i][j] != A[i][j]) {
                    esonoes = false;
                    i = 3;
                    break;
                }
            }
        }
        System.out.println("matriz traspuesta:");
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + A[j][i] + "]");
            }
            System.out.println();
        }
        System.out.println("");
        //Mostrar si es antisimetrica o no
        if (esonoes) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }

    }
}
