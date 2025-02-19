/*
La anidación de bucles es muy frecuente y se trata de tener un bucle dentro de otro
 */
public class BuclesIndependientes {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 8; j++) {
                System.out.println("El valor de i es " + i + " y el valor de j es " + j);
            }
        }
    }
}
