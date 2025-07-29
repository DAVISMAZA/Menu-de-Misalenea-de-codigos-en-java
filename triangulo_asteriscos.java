import java.util.Scanner;

public class triangulo_asteriscos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero de filas de la piramide: "); // Corrected typo
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++){
            // Imprimir espacios
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            // Nueva línea después de cada fila
            System.out.println();
        }
        scanner.close(); // Added to close the scanner
    }
}