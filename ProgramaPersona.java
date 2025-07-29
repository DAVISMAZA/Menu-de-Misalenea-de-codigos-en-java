import java.util.Scanner;

public class ProgramaPersona {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el nombre de la persona: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa la edad de la persona: ");
        int edad = scanner.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " a�os");

        if (edad < 18) {
            System.out.println("Clasificaci�n: Menor de edad");
        } else if (edad >= 18 && edad < 65) { // Assuming 65 is the start of "tercera edad"
            System.out.println("Clasificaci�n: Mayor de edad");
        } else {
            System.out.println("Clasificaci�n: Tercera edad");
        }
        scanner.close(); // Added to close the scanner
    }
}
