/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciaService;

import Circunferencia.circunferencia;
import java.util.Scanner;

/**
 *Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del 
objeto.
d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����)
 * @author Lenovo
 */
public class circunferenciaService {
   public circunferencia crearCircunferencia(){
       Scanner leer= new Scanner(System.in);
       circunferencia cir1= new circunferencia();
       System.out.println("Ingrese el radio de la circunferencia");
       cir1.setRadio(leer.nextDouble());
       double area = 3.14*(cir1.getRadio()*cir1.getRadio());
       double perimetro= (2*cir1.getRadio())* 3.14;
       System.out.println(+area+" es el area,"+perimetro+" es el perimetro.");
       return cir1;
   }

}

