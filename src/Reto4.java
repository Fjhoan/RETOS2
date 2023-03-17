

public class Reto4 {
    public static void main(String[] args) {
        //Declarar variables
        char[][]calculadora = new char[6][4];
        calculadora[0] = new char[]{'_','_','_','0'};
        calculadora[1] = new char[]{'%','C',' ',' '};
        calculadora[2] = new char[]{'7','8','9','X'};
        calculadora[3] = new char[]{'4','5','6','-'};
        calculadora[4] = new char[]{'1','2','3','+'};
        calculadora[5] = new char[]{' ','0',',','='};
        for (int i = 0; i < calculadora.length; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.printf("%-4s",calculadora[i][j]);
            }
            System.out.println("");
        }
    }
}
