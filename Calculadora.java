import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mostrar mensaje de bienvenida
        System.out.println("=== Calculadora ===");
        // Pedir el primer n�mero
        System.out.print("Ingresa el primer n�mero: ");
        double numero1 = scanner.nextDouble();
        // Pedir el segundo n�mero
        System.out.print("Ingresa el segundo n�mero: ");
        double numero2 = scanner.nextDouble();
        // Mostrar las operaciones disponibles
        System.out.println("Selecciona la operaci�n:");
        System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Multiplicar (*)");
        System.out.println("4. Dividir (/)");
        System.out.print("Escribe el n�mero de la operaci�n (1-4): ");
        int opcion = scanner.nextInt();
        double resultado;
        // Realizar la operaci�n elegida
        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                System.out.println("Resultado: " + resultado);
                break;
            case 4:
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opci�n inv�lida.");
        }
        scanner.close();
    }
}