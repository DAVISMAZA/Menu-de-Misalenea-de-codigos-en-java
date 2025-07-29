import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario el número
        System.out.print("Ingresa el número para ver su tabla de multiplicar: ");
        int numero = scanner.nextInt();
        // Imprimir la tabla de multiplicar del 1 al 10
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}