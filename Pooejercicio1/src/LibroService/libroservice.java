/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibroService;

import Libro.Libro;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class libroservice {
    public Libro llenardatos(){
        Libro lib1 = new Libro();
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el ISBN del libro");
        lib1.setIsbn(leer.nextLine());
        System.out.println("ingrese el nombre del autor");
        lib1.setAutor(leer.nextLine());
        System.out.println("Ingrese el titulo del libro ");
        lib1.setTitulo(leer.nextLine());
        System.out.println("ingrese la cantidad de paginas");
        lib1.setPagina(leer.nextInt());
        return lib1;
    }
    
}
