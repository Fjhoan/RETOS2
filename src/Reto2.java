import java.util.*;

public class Reto2{
    //Declarar variables
    public static void main(String[] args) {
            String palabra;
            char[] arreglo;
            int esPalindromo = 1;

    Scanner Lectura = new Scanner(System.in);
    palabra = Lectura.next();
    //este metodo convierte la cadena palabra en un arreglo de caracteres
    arreglo = palabra.toCharArray();
    for (int i = 0; i < arreglo.length; i++) {
        if(arreglo[i] != arreglo[arreglo.length - i - 1]){
                esPalindromo = 0;
                break;
            }
        }   
    if (esPalindromo == 1) {
            System.out.println(palabra + " Es un palindromo");
        }else{
            System.out.println(palabra + " No es un palindromo");
        }
 Lectura.close();
    }

}