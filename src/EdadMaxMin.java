import javax.swing.*;

public class EdadMaxMin {
    public static void main(String[] args) {
        /*
        Solicita al usuario la edad de dos personas e indica cual es mayor, y cual es menor. Para salir, el usuario debe pulsar -1
         */
        int edad1=0,edad2=0;
        String mensaje = "";

        while(edad1!=-1 && edad2!=-1) {

            String edad1T = JOptionPane.showInputDialog("Ingrese la edad 1  ");
            String edad2T = JOptionPane.showInputDialog("Ingrese la edad 2  ");
            try {
                edad1 = Integer.parseInt(edad1T);
                edad2 = Integer.parseInt(edad2T);
                if (edad1!=-1 && edad2!=-1) {
                    int edadMayor = Math.max(edad1, edad2);
                    int edadMenor = Math.min(edad1, edad2);
                    mensaje = "La edad Mayor es " + edadMayor + " y la edad Menor es " + edadMenor;
                }else
                    mensaje="Adios";
            } catch (NumberFormatException e) {
                mensaje = "Error en algun dato insertado";
            }
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }

}

