// Rectangulo.java
public class Rectangulo {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
import java.util.Scanner;

// ProgramaRectangulo.java
public class ProgramaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la base del rect�ngulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingresa la altura del rect�ngulo: ");
        double altura = scanner.nextDouble();

        Rectangulo miRectangulo = new Rectangulo(base, altura);

        System.out.println("�rea del rect�ngulo: " + miRectangulo.calcularArea());
        System.out.println("Per�metro del rect�ngulo: " + miRectangulo.calcularPerimetro());

        scanner.close(); // Added to close the scanner
    }
}