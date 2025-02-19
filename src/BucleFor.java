/**
 * Sintaxis bucle for
 * for (int contador=0;contador<=10;contador++){
 * }
 */

public class BucleFor {
    public static void main(String[] args) {
        /*
         * Mostrar 10 veces la palabra ECO
         */
        for (int i = 1; i <=10; i++) {
            /* pueden ser muchas líneas de código */
            System.out.println("ECO " +  i);
        }
        /* **Otro Ejemplo ***/
        /* ** Mostrar todos los años de forma decreciente desde 2025 al 2000 ** */
        for (int i = 2025; i >=2000; i--) {
            System.out.println("Año " +  i);
        }


    }

}
