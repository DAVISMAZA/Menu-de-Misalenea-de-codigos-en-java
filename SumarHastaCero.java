import java.util.Scanner;

public class SumarHastaCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        System.out.println("Introduce números para sumarlos. Introduce 0 para terminar.");

        do {
            System.out.print("Introduce un número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);

        System.out.println("La suma total es: " + suma);
        scanner.close(); // Added to close the scanner
    }
}