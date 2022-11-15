/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa una cantidad de euros a convertir:");
        Double euro = leer.nextDouble();
        System.out.println("Ingresa la moneda a la que quieres convertirlo:");
        System.out.println("Escriba: dolares, yenes o libras:");
        Boolean correcto;
        String moneda;
        do {
            moneda = leer.next();
            correcto = moneda.equals("dolares")||moneda.equals("yenes")||moneda.equals("libras");
            if (!correcto){
                System.out.println("Moneda incorrecta, intentá denuevo salamín con pan.");  
            }
        } while (!correcto);
        cambio(euro, moneda);
    }
public static void cambio(Double euro, String money) {
       switch (money) {
           case "libras":
               System.out.println(euro+" euros son "+(0.86*euro)+" libras.");
               break;
            case "dolares":
               System.out.println(euro+" euros son "+(1.28611*euro)+" dólares.");
               break;
            default:
               System.out.println(euro+" euros son "+(129.852*euro)+" yenes.");
   }
   }

    
}
