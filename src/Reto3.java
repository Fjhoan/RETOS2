import java.util.*;

public class Reto3 {
    public static void main(String[] args) {
        //crear variables
        int codigoMaquina;
        //Instanciar clases
        Scanner lectura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ahora vamos a simular una maquina expendedora");

        //Crear la matriz
        String[][] productos = new String[16][5];

        //llenar la maquina 
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Por favor ingresa el nombre del producto en la posición " + (i + 1) + ": ");
            productos[i][0] = lectura.nextLine();
            System.out.println("Por favor ingresa el precio del producto en la posición " + (i + 1) + ": ");
            productos[i][1] = lectura.nextLine();
        }

        //Mostrar los producto
        System.out.println(" codigo | Nombre del producto | Precio del producto");
        for (int i = 0; i < productos.length; i++) {
            codigoMaquina = random.nextInt(99);
            System.out.printf(codigoMaquina + " | " +productos[i][0] + " | " + productos[i][1]);
            System.out.println("");
        }

        //Limpiar el bufffer
        lectura.close();
    }
}