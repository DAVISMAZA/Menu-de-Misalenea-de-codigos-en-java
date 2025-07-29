import java.util.Scanner;

public class Contardigitos { // Assuming this is the class name from the image
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un n�mero entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Por favor, introduce un n�mero positivo.");
        } else {
            int contador = 0;
            int temp = numero;
            if (temp == 0) {
                contador = 1; // Special case for 0
            } else {
                while (temp > 0) {
                    temp /= 10;
                    contador++;
                }
            }
            System.out.println("El n�mero " + numero + " tiene " + contador + " d�gito(s).");
        }
        scanner.close(); // Added to close the scanner
    }
}