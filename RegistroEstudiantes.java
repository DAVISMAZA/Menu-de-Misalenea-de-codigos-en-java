// Estudiante.java
public class Estudiante {
    String nombre;
    double promedio;

    public Estudiante(String nombre, double promedio) {
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public void mostrarEstado() {
        System.out.println("Estudiante: " + nombre);
        System.out.println("Promedio: " + promedio);
        if (promedio >= 6.0) {
            System.out.println("Estado: Aprobado");
        } else {
            System.out.println("Estado: Reprobado");
        }
    }
}
import java.util.Scanner;

// RegistroEstudiantes.java
public class RegistroEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingresa el promedio del estudiante: ");
        double promedio = scanner.nextDouble();

        Estudiante estudiante = new Estudiante(nombre, promedio);
        estudiante.mostrarEstado();

        scanner.close(); // Added to close the scanner
    }
}
