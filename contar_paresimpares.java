import java.util.Scanner;

public class contar_paresimpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, par = 0, impar = 0;
        System.out.print("Ingrese la cantidad de números a procesar: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
        }
        System.out.println("Cantidad de números pares: " + par);
        System.out.println("Cantidad de números impares: " + impar);
        scanner.close();
    }
}