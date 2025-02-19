/*
Contar el dinero que una persona tiene en su poder  (Banco, hucha, bolsillos, cajon)
Preguntarlo tantas veces sea necesaria hasta que el usuario ingrese  -> -1

 */

import javax.swing.*;

public class ContarDinero {
    public static void main(String[] args) {
        double dinero=0,banco=0,cajon=0,hucha=0,bolsillo=0;
        String bancoT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Banco");
        String cajonT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Cajon");
        String huchaT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Hucha");
        String bolsilloT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Bolsillo");
        try {
            banco= Double.parseDouble(bancoT);
            cajon= Double.parseDouble(cajonT);
            hucha= Double.parseDouble(huchaT);
            bolsillo= Double.parseDouble(bolsilloT);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Existe un error en algun dato");
            banco=-1;
        }
        while (banco!=-1 && cajon!=-1 && hucha!=-1 && bolsillo!=-1){
            dinero=banco+cajon+hucha+bolsillo;
            bancoT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Banco");
            cajonT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Cajon");
            huchaT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Hucha");
            bolsilloT= JOptionPane.showInputDialog("Ingresa el dinero que tienes en el Bolsillo");
            try {
                banco= Double.parseDouble(bancoT);
                cajon= Double.parseDouble(cajonT);
                hucha= Double.parseDouble(huchaT);
                bolsillo= Double.parseDouble(bolsilloT);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Existe un error en algun dato");
                banco= -1;
            }

        }
        JOptionPane.showMessageDialog(null, "EL TOTAL DE DINERO ES " + dinero + "€");




    }

}
