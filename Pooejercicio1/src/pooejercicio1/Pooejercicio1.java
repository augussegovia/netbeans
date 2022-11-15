/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;

import Libro.Libro;
import LibroService.libroservice;

/**
 *
 * @author Lenovo
 */
public class Pooejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        libroservice ls= new libroservice();
        Libro lib1 = ls.llenardatos();
        System.out.println(lib1);
        
    }
    
    }
    

