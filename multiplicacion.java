import java.util.Scanner;

public class multiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        int multiplicacion = num1 * num2;
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);
        scanner.close();
    }
}