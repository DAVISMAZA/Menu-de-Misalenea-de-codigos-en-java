import java.util.Scanner;

public class resta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        int num2 = scanner.nextInt();
        int resta = num1 - num2;
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
        scanner.close();
    }
}