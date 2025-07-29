import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();

        if (num2 != 0) { // Added check for division by zero
            int division = num1 / num2;
            System.out.println("La división de " + num1 + " y " + num2 + " es: " + division); // Corrected message
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
        scanner.close();
    }
}