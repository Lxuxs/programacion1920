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
public class autentificador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = "lasarango1";
        String password = "123456";
        boolean autentificacion = false;
        while (!autentificacion) {
            System.out.println("AUTENTIFICA SU CLAVE CON SU USUARIO Y CLAVE");
            String us = teclado.next();
            String pass = teclado.next();
            if (usuario.equals(us) && password.equals(pass)) {
                System.out.println("bienvenido al sistema");
                autentificacion = true;

            } else {
                System.out.println("errror");
            }
        }

    }
}
