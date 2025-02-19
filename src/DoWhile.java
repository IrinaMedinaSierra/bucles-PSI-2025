import javax.swing.*;

public class DoWhile {
    public static void main(String[] args) {
        String opcion=""; //es neceario declarar opcion fuera
        do { //indicamos que muestre el menu al menos una vez | Bloque de instrucciones ....
            opcion = JOptionPane.showInputDialog("Indique una opcion de la operacion \n[1] Sumar \n[2] Restar \n[3] Multiplicar \n[4] Dividir \n[5] Modulo\n [6] Exponente\n[7] Salir");
            /*Validar  que la opcion sea entre 1 y 6*/
            int op=0; //inicializamos opcion en cada iteración
            try{
                op = Integer.parseInt(opcion);//convertimos el valor de String a numerico
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "El opcion no existe"); //validamos si no es numerico
            }
            if (op>=1 && op<=6) {//solo entra a pedir los numeros si las opciones son correctas
                String num1T = JOptionPane.showInputDialog("Indique el numero 1");
                String num2T = JOptionPane.showInputDialog("Indique el numero 2");
                int a=0,b=0;
                String mensaje="";
                try {
                    a = Integer.parseInt(num1T);
                    b = Integer.parseInt(num2T);
                } catch (NumberFormatException e) {
                    mensaje="El numero no es valido";
                }
                //*** validar que a ó b no sean iguales a 0  ****
                if (a!=0 && b!=0) {
                    switch (op) {
                        case 1 -> mensaje = "El resultado de sumar " + a + " + " + b + " = " + (a + b);
                        case 2 -> mensaje = "El resultado de restar " + a + " - " + b + " = " + (a - b);
                        case 3 -> mensaje = "El resultado de multiplicar " + a + " * " + b + " = " + (a * b);
                        case 4 -> mensaje = "El resultado de dividir " + a + " / " + b + " = " + (a / b);
                        case 5 -> mensaje = "El resultado del módulo " + a + " % " + b + " = " + (a % b);
                        case 6 -> mensaje = "El resultado del exponente  " + a + " ^ " + b + " = " + Math.pow(a, b);
                        default -> mensaje = "Ha ocurrido un error";
                    }
                }
                JOptionPane.showMessageDialog(null, mensaje);
            }
        }while (!opcion.equals("7"));//repite la interacion mientras opcion sea distinto a "7"
    }
}
