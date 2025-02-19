public class TablaMultiplicar {
    public static void main(String[] args) {
        //Crear toda las tablas de multiplicar 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.println("TABLA DEL "+ i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j +" = "+ (i*j));
            }
        }
    }
}
