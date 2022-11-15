/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra5;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios: o Los socios tipo ‘A’ abonan una
 * cuota mayor, pero tienen un 50% de descuento en todos los tipos de
 * tratamientos. o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35%
 * de descuento para los mismos tratamientos que los socios del tipo A. o Los
 * socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
 * tratamientos. o Solicite una letra (carácter) que representa la clase de un
 * socio, y luego un valor real que represente el costo del tratamiento (previo
 * al descuento) y determine el importe en efectivo a pagar por dicho socio.
 *
 * @author Lenovo
 */
public class Ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int preciotr1 = (int) (Math.random() * 300);
        int preciotr2 = (int) (Math.random() * 300);
        int preciotr3 = (int) (Math.random() * 300);
        elTratamiento(preciotr1,preciotr2,preciotr3);
    }

    public static void elTratamiento(int preciotr1, int preciotr2, int preciotr3) {
        Scanner leer = new Scanner(System.in);
        String respuesta = leer.next();
        do {
            System.out.println("Ingrese el numero de tratamiento");
            System.out.println("1-Tratamiento1");
            System.out.println("2-Tratamiento2");
            System.out.println("3-Tratamiento3");
            int tratamiento = leer.nextInt();
            switch (tratamiento) {
                case 1:
                    System.out.println("Eligio el tratamiento1, tiene un costo de " + preciotr1);
                    System.out.println("Desea continuar?S/N");
                    if (respuesta.equals("s")) {
                        verDescuento(tratamiento, preciotr1, preciotr2, preciotr3);
                    } else {
                        continue;
                    }
                case 2:
                    System.out.println("Eligio el tratamiento2, tiene un costo de " + preciotr2);
                    System.out.println("Desea continuar?S/N");
                    respuesta = leer.next();
                    if (respuesta.equals("s")) {
                        verDescuento(tratamiento, preciotr1, preciotr2, preciotr3);
                    } else {
                        continue;
                    }
                case 3:
                    System.out.println("Eligio el tratamiento3, tiene un costo de " + preciotr3);
                    System.out.println("Desea continuar?S/N");
                    respuesta = leer.next();
                    if (respuesta.equals("s")) {
                        verDescuento(tratamiento, preciotr1, preciotr2, preciotr3);
                    } else {
                        continue;
                    }
            }
        } while (!respuesta.equals("s"));
    }

    public static void verDescuento(int tratamiento, int preciotr1, int preciotr2, int preciotr3) {
        Scanner leer = new Scanner(System.in);
        String socio;
        switch (tratamiento) {
            case 1:
                System.out.println("ingrese q tipo de socio es. a/b/c.");
                socio = leer.next();
                switch (socio) {
                    case "a":
                        System.out.println("el precio final con su descuento es " + (preciotr1 * 0.50));
                    case "b":
                        System.out.println("el precio final con su descuento es " + (preciotr1 * 0.35));
                    case "c":
                          System.out.println("el precio final es " + preciotr1);
                }

            case 2:
                System.out.println("ingrese q tipo de socio es. a/b/c.");
                socio = leer.next();
                switch (socio) {
                    case "a":
                        System.out.println("el precio final con su descuento es " + (preciotr2 * 0.50));
                    case "b":
                        System.out.println("el precio final con su descuento es " + (preciotr2 * 0.35));
                    case "c":
                          System.out.println("el precio final es " + preciotr2);
                }
            case 3:
                System.out.println("ingrese q tipo de socio es. a/b/c.");
                socio = leer.next();
                switch (socio) {
                    case "a":
                        System.out.println("el precio final con su descuento es " + (preciotr3 * 0.50));
                    case "b":
                        System.out.println("el precio final con su descuento es " + (preciotr3 * 0.35));
                    case "c":
                        System.out.println("el precio final es " + preciotr3);

                }
        }
    }    
}