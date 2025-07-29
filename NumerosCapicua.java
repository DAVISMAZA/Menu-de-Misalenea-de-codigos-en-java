import java.util.Scanner;

public class NumerosCapicua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el número inicial del rango: ");
        int inicio = scanner.nextInt();
        System.out.print("Ingresa el número final del rango: ");
        int fin = scanner.nextInt();

        System.out.println("Números capicúa en el rango de " + inicio + " a " + fin + ":");

        for (int i = inicio; i <= fin; i++) {
            if (esCapicua(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line after printing numbers
        scanner.close(); // Added to close the scanner
    }

    // Helper method to check if a number is capicúa (palindrome)
    public static boolean esCapicua(int numero) {
        int original = numero;
        int reverso = 0;
        while (numero > 0) {
            int digito = numero % 10;
            reverso = reverso * 10 + digito;
            numero /= 10;
        }
        return original == reverso;
    }
}