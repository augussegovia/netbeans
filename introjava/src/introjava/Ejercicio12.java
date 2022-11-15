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
public class Ejercicio12 {
          public static void main(String[] args) {
              Scanner leer = new Scanner(System.in);
             /* Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().*/   
             String frase;
             int correctas,incorrectas;
             incorrectas=0;
             correctas=0;
             do {
                 System.out.println("Ingrese la cadena");
                 frase=leer.next();
                 if (frase.length() ==5 && frase.startsWith("x") && frase.endsWith("o")){
                         correctas=correctas+1;
                 }else{
                     incorrectas=incorrectas+1;
                 } 

             } while (!frase.equals("&&&&&"));
              System.out.println("la cantidad de incorrectas: "+incorrectas);
              System.out.println("la cantidad de correctas: "+correctas);
    }   
}
