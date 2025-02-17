/*
Diseñe un programa que por cada numero ingresado por el usuario indique si es par, si es positivo y su cuadrado. Para salir del programa, el usuario debe ingresar 0
 */


import javax.swing.*;

public class OtroWhile {
    public static void main(String[] args) {
        String numT= JOptionPane.showInputDialog("Ingrese un número: ");
        boolean par,positivo;
        double num=0;
        String mensaje="";
        try{
            num=Double.parseDouble(numT); //pasamos el numero a double
        }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "El numero no es valido");
        }
        while (num!=0){
            par=num%2==0;
            positivo=num>=0;
            double cuadrado=Math.pow(num,2);
            //Mostramos el resultado
            mensaje="¿Es par? ->"+par+" ¿Es posivo? ->"+positivo + " El cuadrado es ->" + cuadrado;
            JOptionPane.showMessageDialog(null, mensaje);
            numT= JOptionPane.showInputDialog("Ingrese un número: ");
            try{
                num=Double.parseDouble(numT); //pasamos el numero a double
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "El numero no es valido");
                JOptionPane.showMessageDialog(null, "ADIOS:·)");
                num=0; //Obligo a que se salga
            }
        }
    }
}
