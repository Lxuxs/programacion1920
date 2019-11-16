
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class tablademultiplicar {
    public static void main(String[] args) {
        System.out.println("generacion de tablas de multiplicacion");
        System.out.println("ingresa el número para generar tabla de multiplicacion");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        int cnt = 1;
        while(cnt <=100){
            System.out.println(numero+"x"+ cnt+ "=" + numero*cnt);
            cnt++;
        }
    }
        
    
}
