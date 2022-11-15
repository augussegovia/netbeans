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
public class Ejercicio11 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por 
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla 
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que 
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del 
programa, caso contrario se vuelve a mostrar el menú*/
         System.out.println("Ingrese dos numeros enteros positivos");
         int num1=leer.nextInt(),num2=leer.nextInt();
         int opcion;
         String salir;
         do {
             System.out.println("eliga una opcion:");
             System.out.println("1.Sumar");
             System.out.println("2.Restar");
             System.out.println("3.Multiplicar");
             System.out.println("4.Dividir");
             System.out.println("5.Salir");
             opcion =leer.nextInt();
             switch (opcion){
                 case 1:
                     System.out.println("la suma es: "+(num1+num2));
                     continue;
                 case 2:
                     System.out.println("la resta es: "+(num1-num2));
                     continue;
                 case 3:
                     System.out.println("la multiplicacion es: "+(num1*num2));
                     continue;
                 case 4:
                     System.out.println("la division es: "+(num1/num2));
                     continue;
                 case 5:
                     System.out.println("desea salir(s/n)?");
                     salir=leer.nextLine();
                     
                     if (salir.equals("s")){
                         break;
                     }
                     if (salir.equals("n")){
                        
                     }
                        
                              
             }
         } while (opcion != 5);
    } 
} 
    

     
     
