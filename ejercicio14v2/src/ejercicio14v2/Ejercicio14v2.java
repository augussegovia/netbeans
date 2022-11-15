/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14v2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Ejercicio14v2 {
static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args){
        double euros = introducirEuros();
        String moneda = introducirMoneda();
        double cambio = cambiarMoneda(euros,moneda);
        imprimir(cambio,moneda);
    }
    
    public static double introducirEuros(){
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        return euros;
    }
    
    public static String introducirMoneda(){
        System.out.println("Ingrese la moneda a la que quieres cambiar");
        String moneda = leer.next();
        System.out.println("el cambio sera a " + moneda);
        return moneda;
    }
    
    public static double cambiarMoneda(double euros, String moneda) {
        double cambio = 0.0;
        switch (moneda) {
            case "libra":
                cambio = euros * 0.87;
                break;
            case "dolares":
                cambio = euros * 1.11;
                break;
            case "yenes":
                cambio = euros * 120.63;
                break;
        }
        return cambio;
    }

    public static void imprimir(double cambio, String moneda){
        System.out.println("el resultado del cambio es " + cambio + " " + moneda);
    }
   
    
    
}
