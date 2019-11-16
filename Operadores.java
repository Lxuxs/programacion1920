/*
 *
Esta clase va ha servir paa trabajar con las distintas clases de los operadores
es java
 */

/**
 *
 * @author Salas
 */
public class Operadores {

    public static void main(String[] args) {
        //operadores aritmeticos
        int suma = 14 + 14;
        int resta = 20 - 10;
        double multiplicacion = 50 * 0.12;
        int division = 100 / 50;
        int residuo = 7 % 2;
        System.out.println("1. operadores aritmeticos");
        System.out.println("La suma es : " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println(" La multipliocacion es" + multiplicacion);
        System.out.println("La división es: " + division);
        System.out.println("El residuo de la division es: " + residuo);

        // operadores de incremento y decremento
        int nota = 15;
        nota = nota + 1;
        System.out.println("2. operadores de incremento y decremento");
        System.out.println("incremento como nota = nota +1 : " + nota);
        nota +=1;
        System.out.println("incremento como nota +=1 :" + nota);
        nota++;
        System.out.println("incremento como nota++ : " + nota ); 
        
        System.out.println("decremento de la variable nota ");
        System.out.println("Decremento como nota = nota - 1: "+ nota) ;
        nota -= 1;
        System.out.println("Decremento como nota -- : " + nota);
     

    }
}
