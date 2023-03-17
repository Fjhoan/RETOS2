import java.util.*;

public class Reto {
    public static void main(String[] args) {
        String palabra;
        int intentos = 0;
        int maxIntentos = 6;
        char[] palabraAdivina;
        double saldo = 0, saldoInicial = 0, valorApuesta = 0, sumaPerdida = 0, sumaGanada = 0;

        Scanner Lectura = new Scanner(System.in);
        Random Random = new Random();
        System.out.println("Bienvenido cuanto quiere recargar");
        saldoInicial = Lectura.nextDouble();
        System.out.println("cuanto desea apostar");
        valorApuesta = Lectura.nextDouble();
        if (valorApuesta > saldoInicial) {
            System.out.println("el valor de apuesta no puede superar al saldo de recarga");
        }

        String[] palabras = {"televisor", "messi", "vegetta777", "twitch"};
        palabra = palabras[Random.nextInt(palabras.length)];
        palabraAdivina = new char[palabra.length()];
        Arrays.fill(palabraAdivina, '_');

        while (intentos < maxIntentos) {
            System.out.println("Adivina una letra:");
            char letra = Lectura.next().charAt(0);
            int acierto = 0;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraAdivina[i] = letra;
                    acierto = 1;
                }
            }
            if (acierto == 0) {
                intentos++;
                System.out.println("Fallaste Te quedan " + (maxIntentos - intentos) + " intentos");

            } else {
                System.out.println("Adivinaste una letra");
            }
            System.out.println(palabraAdivina);
            if (Arrays.equals(palabraAdivina, palabra.toCharArray())) {
                System.out.println("Felicidades ganaste");
                sumaGanada = valorApuesta * 0.3;
                
                saldo = saldoInicial + sumaGanada;
                System.out.println("usted ganó: " + sumaGanada + ", su saldo final esta en: " + saldo);
                break;
            }
        }
        if (intentos >= maxIntentos) {
            System.out.println("Lo siento perdiste" + "\n " + "la palabra era " +  palabra);
            sumaPerdida = valorApuesta * 0.1;
            saldo = saldoInicial - sumaPerdida;
            System.out.println("usted perdio: " + sumaPerdida + ", su saldo final esta en: " + saldo);
        }
        Lectura.close();
        
    }
}

