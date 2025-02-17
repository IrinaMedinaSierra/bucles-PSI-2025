import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Math -> solicitamos 2 numeros por teclado
        //tipo String es texto-No puede realizar operaciones matematicas
        String num1T= JOptionPane.showInputDialog("Enter a number 1");
        String num2T= JOptionPane.showInputDialog("Enter a number 2");
        int num1=0,num2=0;
        String mensaje="";
        try{ //intento pasar el dato de texto a numerico
            num1= Integer.parseInt(num1T);
            num2= Integer.parseInt(num2T);
        } catch (NumberFormatException e) {//si el usuario ingresa un dato no numerico,captura el error
            mensaje="Existe un error en el dato ingresado, solo números";
        }
        if (mensaje.equals("")) {
            String opcion = JOptionPane.showInputDialog("Seleccione el opcion: " +
                    "\n[1]-> Math.max" +
                    "\n[2]-> Math.min" +
                    "\n[3]-> Math.sqrt " +
                    "\n[4]-> Math.pow()" +
                    "\n[5]-> Math.abs " +
                    "\n[6]-> Math.random"+
                    "\n[7]-> Salir..");

            //Con Switch-case realizamos las operacion seleccionada

            switch (opcion) {
                case "1"-> mensaje="Math.max("+num1T+","+num2T+")="+ Math.max(num1,num2);
                case "2"-> mensaje="Math.min("+num1T+","+num2T+")="+ Math.min(num1,num2);
                case "3"-> mensaje="Math.sqrt("+num1+")="+ Math.sqrt(num1)+"\nMath.sqrt("+num2+")="+ Math.sqrt(num2);
                case "4"->mensaje="Math.pow("+num1+","+num2+")="+ Math.pow(num1,num2);
                case "5"-> mensaje="Math.abs("+num1+")="+ Math.abs(num1) + "\nMath.abs("+num2+")="+ Math.abs(num2);
                case "6"-> mensaje="Math.random()="+ (int) (Math.random()*101); //mostrar un número aleatorio
                default -> mensaje="La opción seleccionada no es válida";
            }
        }
        JOptionPane.showMessageDialog(null, mensaje);


    }
}
