import java.util.Scanner;

/**
 * Pedir un número comprendido entre 1 y el 10. Hay que mostrar la tabla de multiplicar del número ingresado,
 * asegurandose que el dato inicial este comprendido en el rango. Si no esta correcto, solicitarlo nuevamente
 */
public class TablaMultiplicar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        do{ //segurarme que lo que ingresa este entre el 1 y el 10
            System.out.println("Ingrese el numero para generar la tabla de multiplicar: ");
            numero = sc.nextInt();
        }while(!(numero>0 && numero<=10));//numero<0 && numero>10
        System.out.println("TABLA DEL "+ numero);
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + "x" + i +" = "+ (numero*i));
        }
        /*Salidas anticipadas -> for. do-while . while
            1. interrupir el bucle -> break
            2. saltar la iteraccion actual, y continuar con el bucle -> continue
         */
        System.out.println("**Salidas anticipadas -BREAK**");
        for (int i = 1; i <= 10; i++) {
            if (i==6){
                break; //salir - interrumpir
            }else {
                System.out.println(numero + "x" + i + "* = " + (numero * i));
            }
        }
        System.out.println("**Salidas anticipadas - CONTINUE**");
        for (int i = 1; i <= 10; i++) {
            if (i==6){
                continue; //saltar
            }else {
                System.out.println(numero + "x" + i + "* = " + (numero * i));
            }
        }

    sc.close();
    }
}
