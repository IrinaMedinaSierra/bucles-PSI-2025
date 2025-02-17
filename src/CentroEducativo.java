/*
Implementar una aplicacion para calcular datos estadisticos de las edades de los alumnos de un centro educativo. Se introducirán datos  hasta que uno de ellos sea negativo.

Como resultado mostrar:
la suma de todas las edades
la media de las edades
el numero de alumnos
cuántos son mayores de edad

contador-> para la suma de edades
contador-> numero de alumnos
contador-> mayores de edad

Ojo-> los datos se mostraran un vez se salga del bucle
 */

import javax.swing.*;

public class CentroEducativo {
    public static void main(String[] args) {
        //Declarar contadores
        int edad=0, edades=0,alumnos=0,mayorEdad=0;
        double media=0;
        //Solicitar la primera edad
        String edadT= JOptionPane.showInputDialog("Ingresa la edad del alumno");
        try{
            edad = Integer.parseInt(edadT);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El dato de edad no es valido");
        }
        while(edad>=0){
            edades+=edad;
            alumnos++;
            if(edad>=18){
                mayorEdad++;
            }
            edadT= JOptionPane.showInputDialog("Ingresa la edad del alumno");
            try{
                edad = Integer.parseInt(edadT);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El dato de edad no es valido");
                edad=-1;
            }


        }
        media=edades/alumnos;
        JOptionPane.showMessageDialog(null, "La media es " + media + "\nLa suma de todas las edades es  " + edades + "\nLos alumnos mayores de edad son " + mayorEdad + "\n El total de alumnos es " + alumnos);

    }
}
