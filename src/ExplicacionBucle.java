public class ExplicacionBucle {
    public static void main(String[] args) {
        int i=5,y=9,contador=0;
        boolean resultado=false;
        do{ //se ejecuta al menos una vez
            System.out.println("El valor de i es "+ i );
            contador++;
            if (contador==10){
                resultado=true;
            }


        }while(!resultado); //false


    }
}
