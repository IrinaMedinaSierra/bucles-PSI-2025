import javax.swing.*;

public class ContarDineroDoWhile {
    public static void main(String[] args) {
     double dinero=0;
     double total=0;
     do{
         String bolsa=JOptionPane.showInputDialog("Ingrese el dinero que tiene");
         try{
             dinero=Double.parseDouble(bolsa);
             //no restar si el valor es -1
             total+=dinero;
         }catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Existe un error en algun dato");
         }

     }while (dinero!=-1);
     JOptionPane.showMessageDialog(null, "El total de dinero que tienes es "+total + "€");

    }

}
