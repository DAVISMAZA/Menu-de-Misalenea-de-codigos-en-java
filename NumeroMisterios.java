import java.util.Scanner;
import java.util.Random;

public class NumeroMisterios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroMisterioso = random.nextInt(100) + 1; // Número entre 1 y 100
        int intentosMaximos = 7;
        int intentosRealizados = 0;
        boolean adivinado = false;

        System.out.println("Adivina el número misterioso entre 1 y 100. Tienes " + intentosMaximos + " intentos.");

        while (intentosRealizados < intentosMaximos && !adivinado) {
            System.out.print("Intento " + (intentosRealizados + 1) + ": Ingresa tu suposición: ");
            int suposicion = scanner.nextInt();
            intentosRealizados++;

            if (suposicion == numeroMisterioso) {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentosRealizados + " intentos.");
                adivinado = true;
            } else if (suposicion < numeroMisterioso) {
                System.out.println("Es mayor. Sigue intentando.");
            } else {
                System.out.println("Es menor. Sigue intentando.");
            }
        }

        if (!adivinado) {
            System.out.println("Se te acabaron los intentos. El número misterioso era: " + numeroMisterioso);
        }
        scanner.close(); // Added to close the scanner
    }
}