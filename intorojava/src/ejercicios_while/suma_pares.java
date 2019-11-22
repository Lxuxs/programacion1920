/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_while;

/**
 *
 * @author UTPL
 */
public class suma_pares {

    public static void main(String[] args) {
        int contador = 1;
        int par;
        int acum = 0;
        int suma;
        while (contador <= 100) {
            if (contador % 2 == 0) {
                par = contador;
                System.out.println("" + par);
                acum = acum + par;

            }
            contador++;
        }
        System.out.println("" + acum);

    }
}
