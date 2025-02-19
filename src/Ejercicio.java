import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * edad=18
 * incrementa la edad hasta que llegue a 40 años . Ve mostrando cada interacion
 * muestra con un sout
 * ** Mostrar 10 veces Hola en la consola ** pista-> necesitas un contador que se incremente en cada interación
 * ** Solicitar la edad a 10 personas e ir contando cuáles son mayores de 18 y cuáles menores de 18, al final mostrar
 *    los mayores y menores.
 * ** Crear un menu que se repita hasta que el usuario elija la opcion salir. Tendrá 3 opciones :
 *      1-> Hola que tal (Saludo)
 *      2-> Indicar la fecha de hoy
 *      3-> Salir
 */

public class Ejercicio {
    public static void main(String[] args) {

        //El tipo fecha LocalDate / LocalDateTime
        LocalDate fecha = LocalDate.now(); //La fecha de hoy
        System.out.println(fecha);
        LocalDateTime fechaYhora = LocalDateTime.now();
        System.out.println(fechaYhora.getDayOfMonth());
        System.out.println(fechaYhora.getMonth());
        System.out.println(fechaYhora.getYear());
        System.out.println(fechaYhora.getHour());
        int hora= fechaYhora.getHour();
        if (hora<14) {
            System.out.println("Buenos dias");
        }else{
            System.out.println("Buenas tardes");
        }
        }
    }

