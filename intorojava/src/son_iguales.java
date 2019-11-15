
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class son_iguales {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        System.out.println("ingresar numero 1");
        n1 = entrada.nextInt();
        System.out.println("ingresa elk numero2");
         n2 = entrada.nextInt();
      
        if (n1 == n2) {
            System.out.println("los numeros son iguales");
            
        }else
            System.out.println("los numeros no son iguales");
    
    }
}
