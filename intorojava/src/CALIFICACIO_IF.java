/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class CALIFICACIO_IF {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota;
        
        System.out.println("Ingresar la nota");
         nota = entrada.nextInt();
     
     if(nota>=0 && nota<=4){
        System.out.println("insuficiente");
     }
     
     if(nota>=5 && nota<=6){
        System.out.println("suficiente");
     }
     if(nota>=7 && nota<=8){
        System.out.println("bien");
     }
     if(nota==9|| nota==10){
        System.out.println("notable");
     }
     
    }}