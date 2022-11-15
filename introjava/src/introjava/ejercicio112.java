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
public class ejercicio112 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
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
       

