import java.util.Scanner;

public class NumerosN {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicitar al usuario el número
        System.out.print("Ingresa el número a sumar: ");
        int numero = scanner.nextInt();
        // Imprimir la suma de los números del 1 al N
        int suma = 0;
        System.out.println("Suma de los números del 1 al " + numero + ":");
        for (int i = 1; i <= numero; i++) {
            suma += i;
            System.out.println("Suma hasta " + i + " = " + suma);
        }
        System.out.println("La suma total de los números del 1 al " + numero + " es: " + suma); // Added final sum
        scanner.close(); // Added to close the scanner
    }
}