/*
 * programa para realizar la multiplicacion de numeros ingresados por teclado
 */
package ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class multiplicacion_numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean nuevo_numero = true;
        int acumulador = 1;
        while (nuevo_numero == true) {
            System.out.println("desea ingresar un numero si/no");
            String respuesta = teclado.next();
            respuesta=respuesta.toLowerCase();
            if (respuesta.equals("si")) {
                System.out.println("ingrese el numero");
                int numero = teclado.nextInt();
                acumulador = acumulador * numero;
            } else if (respuesta.equals("no")) {
                nuevo_numero = false;//hacemos que finalice el ciclo de repeticion
            }
        }
        System.out.println("La multiplicacion de los numeros es:"+acumulador);
    }

}
