import java.util.Scanner;

public class ClasificadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un n�mero: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El n�mero es positivo.");
        } else if (numero < 0) {
            System.out.println("El n�mero es negativo.");
        } else {
            System.out.println("El n�mero es cero.");
        }
        scanner.close(); // Added to close the scanner
    }
}