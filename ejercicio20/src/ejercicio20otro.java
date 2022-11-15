
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class ejercicio20otro {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los 9 valores de la martriz");
        int[][] matriz = new int[3][3];
        llenado(matriz);
        if (comprobacionlinea(matriz)){
            System.out.println("la matriz es magica");
        }else{
            System.out.println("la matriz no es magica");
        }
        

    }

    public static void llenado(int[][] matriz) {
        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]= leer.nextInt();
                
            }
        }
    }
    public static boolean comprobacionlinea(int[][] matriz) {
        
        int sumai =0;
        for (int i = 0; i < 3; i++) {
            sumai+=matriz[0][i];
        }
        
        for (int i = 1; i < 3; i++) {
            int sumafila=0;
            for (int j = 0; j < 3; j++) {
                sumafila+=matriz[i][j]; 
                
            }
            if (sumafila!=sumai){
                return false;
            }
        }
        
        
        for (int i = 0; i < 3; i++) {
            int sumacolumna=0;
            for (int j = 0; j < 3; j++) {
                sumacolumna+=matriz[j][i];
                
            }
          if(sumacolumna!=sumai){
              return false;
          }
        }
        int sumadiagmayor=0;
                
        for (int i = 0; i < 3; i++) {
            sumadiagmayor+=matriz[i][i];
            
        }
        if (sumadiagmayor!=sumai){
            return false;
            
        }
       int sumadiaginvert=0;
       int aux=2;
        for (int i = 0; i < 3; i++) {
            sumadiaginvert+=matriz[i][aux];
            aux--;
            
        }
        if(sumadiaginvert!=sumai){
            return false;
        }else{
            return true;
        }
    }
}


