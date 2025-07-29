import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=== Conversor de Temperaturas ===");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt(); // Corrected case

            switch (opcion) { // Corrected case
                case 1:
                    System.out.print("Ingresa la temperatura en Celsius: ");
                    double celsius = scanner.nextDouble(); // Corrected type and case
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println(String.format("%.2f", celsius) + "°C son " + String.format("%.2f", fahrenheit) + "°F.");
                    break;
                case 2:
                    System.out.print("Ingresa la temperatura en Fahrenheit: ");
                    double fahrenheit2 = scanner.nextDouble(); // Corrected type and case
                    double celsius2 = (fahrenheit2 - 32) * 5 / 9;
                    System.out.println(String.format("%.2f", fahrenheit2) + "°F son " + String.format("%.2f", celsius2) + "°C.");
                    break;
                case 3:
                    System.out.println("Saliendo del conversor. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
                    break;
            }
        } while (opcion != 3); // Corrected operator
        scanner.close(); // Corrected case for scanner.close()
    }
}