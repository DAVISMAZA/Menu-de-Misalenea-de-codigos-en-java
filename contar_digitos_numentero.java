import java.util.Scanner;

public class contar_digitos_numentero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un n�mero entero positivo: ");
        int numero = scanner.nextInt();

        int contador = 0;
        int n = numero;
        if (n == 0) {
            contador = 1;
        } else {
            while (n > 0) {
                n = n / 10;
                contador++;
            }
        }
        System.out.println("El n�mero " + numero + " tiene " + contador + " d�gito(s).");
        scanner.close(); // Added to close the scanner
    }
}