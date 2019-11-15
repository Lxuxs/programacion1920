
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
public class cualesmayor_menor {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1;
        double n2;
        System.out.println("ingresar numero 1");
        n1 = entrada.nextInt();
        System.out.println("ingresa el numero2");
         n2 = entrada.nextInt();
      
        if (n1 > n2) {
            System.out.println("n1 > n2");
            
        }else
            System.out.println("n2 < n1");
    
        
    }
    
}
