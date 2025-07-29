import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        int secreto = (int) (Math.random() * 100 + 1);
        Scanner scanner = new Scanner(System.in);
        int intentos = 5;
        while (intentos > 0) {
            System.out.print("Adivina el número (1-100): ");
            int guess = scanner.nextInt();
            if (guess == secreto) {
                System.out.println("¡Correcto! Adivinaste el número.");
                break;
            } else {
                System.out.println("Incorrecto.");
                intentos--;
                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                } else {
                    System.out.println("Se acabaron los intentos. El número era: " + secreto);
                }
            }
        }
        scanner.close(); // Added to close the scanner
    }
}