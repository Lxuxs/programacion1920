/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class multiplicacionCONsumas {

    private static Object sc;

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int contador = 1;
        int acumulador = 0;
        int n1, n2;
        System.out.println("ingresar un número");
        n1 = datos.nextInt();
        System.out.println("ingrese otro número");
        n2 = datos.nextInt();
        while (contador <= n2) {
            acumulador = acumulador + n1;
            contador = contador + 1;
        }
        System.out.println("la respuesta es:" + acumulador);
    }

}
