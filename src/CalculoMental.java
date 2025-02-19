import javax.swing.*;

/**
 * Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador tendra que introducir la solución de la suma de dos números aleatorios comprendidos del 1 al 100. Mientras la respuesta sea correcta, el juego continuara he ira contando cuantas respuestas correctas lleva el jugador. Al escribir una erronea, se saldrá del juego y mostrará el número de correctas que ha acertado.
 * Ayuda... Numeros aleatorios num1=(int)(Math.random()*101)
 *          si la suma num1+num2==respuestaUsuario -> no es necesario un if
 *              incrementar el Contador++
 *
 *          el bucle do se repetira mientras (num1+num2)==respuestaUsuario
 *          Variales: num1,num2,contador,respuestaUsuario
 *
 */
public class CalculoMental {
    public static void main(String[] args) {
        //declaracion de variables
    int resultado=0,resultadoUsuario=0,contador=0;
    String mensaje="";
        //bucle
    do{
        int num1=(int)(Math.random()*101);
        int num2=(int)(Math.random()*101);
        int operacion=(int)(Math.random()*3); //si 0-> suma,1->resta,2->multiplicacion
        System.out.println(operacion);
        resultado++;
        switch(operacion){
            case 0-> {
                    mensaje="El resultado de la suma de "+num1+"+"+num2+"=";
                    resultado=num1+num2;
            }
            case 1->{
                mensaje="El resultado de la resta de "+num1+"-"+num2+"=";
                resultado=num1-num2;
            }
            case 2-> {
                mensaje="El resultado de la multiplicación de "+num1+"*"+num2+"=";
                resultado=num1*num2;
            }
        }
        String pregunta = JOptionPane.showInputDialog(mensaje);
        try{
            resultadoUsuario=Integer.parseInt(pregunta);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El numero no es valido");
        }
        contador++;//incrementa el contador
    }while(resultado==resultadoUsuario);
    JOptionPane.showMessageDialog(null, "Has acertado "+ (contador - 1));
    }

}
