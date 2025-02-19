/*
El número secreto
Solicitar al usuario un número cuantas veces sea necesario, hasta que acierte el número que mediante
Math.random() haya tomado.
El usuario se puede rendir pulsando -1
 */
import javax.swing.*;

public class AdivinaElNumero {
    public static void main(String[] args) {
        int numeroSecreto=(int)(Math.random()*10);
        String numero= JOptionPane.showInputDialog("Ingrese un número ");
        int numeroUser;
        try{
            numeroUser = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El numero no es valido");
            numeroUser=-1;
        }
        int intentos=1;
    while(numeroUser!=numeroSecreto && numeroUser!=-1){
        //Si el numero ingresado es mayor al numero secreto, le damos una pista al usuario
        if (numeroUser>numeroSecreto){
            JOptionPane.showMessageDialog(null, "El numero es mayor que el numero Secreto");
        }else{
            JOptionPane.showMessageDialog(null, "El numero es menor que el numero Secreto");
        }
        intentos++;
        numero=JOptionPane.showInputDialog("Intento ["+ intentos+"] Ingresa un numero");
        try{
            numeroUser = Integer.parseInt(numero);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El numero no es valido");
            numeroUser=-1;
        }
    }
    if (numeroUser==numeroSecreto){
        JOptionPane.showMessageDialog(null, "Enhorabuena....adivinaste el número");
    }else{
        JOptionPane.showMessageDialog(null, "Te has rendido...gane yo!");
    }
    }
}
