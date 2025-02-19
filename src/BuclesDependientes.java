import java.util.Scanner;

//El bucle generalmente el interno depende del valor del externo
public class BuclesDependientes {
    public static void main(String[] args) {
        /*
        Ejemplo ->solicitar un número y vamos a dibujar un triangulo de n lados utilizan *
        n=4             n=7
        ****            *******
        ***             ******
        **              *****
        *               ****
                        ***
                        **
                        *
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para el triangulo: ");
        int num1 = sc.nextInt();//4
        for (int  fila= 1; fila <= num1; fila++) {//fila<=4
            for (int columna= fila; columna <= num1; columna++) {
                System.out.print("*");
            }
            System.out.println();//salto de linea en cada fila
        }

        //Anuta pide el triangulo al reves

        System.out.println("Piramide al reves");
        for (int  fila= num1; fila >=1 ; fila--) {
            for (int columna= fila; columna <= num1; columna++) {
                System.out.print("*");
            }
            System.out.println();//salto de linea en cada fila
        }



       sc.close();
    }
}
