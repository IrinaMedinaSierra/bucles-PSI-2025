/*
Solicita 10 numeros enteros por pantalla y calcula la media
declarar variales que sumará esos numeros....pista  utilizar opera y asigna +=
Finalmente, muestra la media
 */


import java.util.Scanner;

public class Ejemplo2For {
    public static void main(String[] args) {

        int numero=0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite um numero: ");
            numero += sc.nextInt();
        }

        System.out.println("La media es " + ((double) numero/10));
    }

}
