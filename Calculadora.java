import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Mostrar mensaje de bienvenida
        System.out.println("=== Calculadora ===");
        // Pedir el primer número
        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();
        // Pedir el segundo número
        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();
        // Mostrar las operaciones disponibles
        System.out.println("Selecciona la operación:");
        System.out.println("1. Sumar (+)");
        System.out.println("2. Restar (-)");
        System.out.println("3. Multiplicar (*)");
        System.out.println("4. Dividir (/)");
        System.out.print("Escribe el número de la operación (1-4): ");
        int opcion = scanner.nextInt();
        double resultado;
        // Realizar la operación elegida
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
                System.out.println("Opción inválida.");
        }
        scanner.close();
    }
}