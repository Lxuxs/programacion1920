/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class acumulador {
    
    public static void main(String[] args) {
        System.out.println("trabajo con comuladores");
       int contador = 1;
       int acumulador = 1;// va a comular la suma de los números del 1 al 5
       while(contador <=5){
           acumulador = acumulador * contador;
           contador++;
       }
        System.out.println("valor del contador"+contador);
        System.out.println("valor del acumulador:"+acumulador);
    }
}
