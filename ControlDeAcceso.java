import java.util.Scanner;

public class ControlDeAcceso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        boolean tienePermiso = true; // This might be intended to be dynamic input or external check

        if (edad >= 18 || tienePermiso) {
            System.out.println("Acceso concedido.");
        } else {
            System.out.println("Acceso denegado.");
        }

        // The following block seems unrelated to access control.
        // If it's intended to be part of the program, consider its placement or a separate program.
        /*
        System.out.println("\nLos números del 0 al 10 son:");
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par.");
            } else {
                System.out.println(i + " es impar.");
            }
        }
        */
        scanner.close(); // Added to close the scanner
    }
}