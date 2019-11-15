/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class noya_switch {
    
    public static void main(String[] args) {
        
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa la nota" );
        nota = entrada.nextInt();
        
        switch (nota){
            case 0:
            case 1:
            case 3:
            case 4:
                System.out.println("insuficiente");
            break;
            case 5:
            case 6:
                    System.out.println("suficiente");
            case 7:
            case 8:
                System.out.println("bueno");
            break;
            case 9:
            case 10:
                System.out.println("notable");
                break;
                
                
        }
               
        
    }
}
