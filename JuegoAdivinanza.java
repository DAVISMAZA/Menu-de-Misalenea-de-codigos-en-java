import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Número entre 1 y 100
        int intentos = 0;
        int guess;
        boolean adivinado = false;

        System.out.println("Bienvenido al Juego de Adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100. ¡Intenta adivinarlo!");

        while (!adivinado) {
            System.out.print("Introduce tu intento: ");
            guess = scanner.nextInt();
            intentos++;

            if (guess < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (guess > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en " + intentos + " intentos.");
                adivinado = true;
            }
        }
        scanner.close(); // Added to close the scanner
    }
}