import java.util.Scanner;

public class sumar { // Assuming this is the class name from the image
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.println("Introduce n�meros para sumar (0 para finalizar):");

        do {
            System.out.print("N�mero: ");
            num = scanner.nextInt();
            sum += num;
        } while (num != 0);

        System.out.println("La suma total de los n�meros introducidos es: " + sum);
        scanner.close(); // Added to close the scanner
    }
}