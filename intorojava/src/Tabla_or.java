/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salas
 */
public class Tabla_or {
    
    public static void main(String[] args) {
        System.out.println("TABLA DE4 VERDAD OR");
        System.out.println("x \t y \t resultado");
        System.out.println("v \t v \t "+ (true|| true));
        System.out.println("v \t F \t "+ (true|| false));
        System.out.println("v \t v \t "+ (false|| true));
        System.out.println("v \t F \t "+ (false|| false));
        
        System.out.println("TABLA DE VERDAD NOT");
        System.out.println("x \t resultado");
        System.out.println(true + "\t" +!true);
        System.out.println(false + "\t" +!false);

        
    }
}
