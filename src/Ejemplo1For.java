import java.util.Scanner;

/**
 * Solicitar al usuario un numero, y mostrará todos los numeros desde el 1 al numero ingresado.
 * sout
 *
 * Escribe un programa que muestre todos los multiplos de 7 menores que 100
 */

public class Ejemplo1For {
    public static void main(String[] args) {
        System.out.println("Ingrese un número ->");
        int numero=new Scanner(System.in).nextInt(); //lee el dato directamente
        for (int i = 1; i <= numero; i++) {
            System.out.print(i+"-"); //sin salto de linea
        }
        System.out.println(); //Salto de linea manual
        for (int i = 0; i <= 100; i+=7) {
            System.out.print(i+"-");
        }




    }
}
